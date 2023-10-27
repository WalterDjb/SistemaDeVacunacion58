package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Cita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class CitaData {
    Connection con;
    Cita cit = new Cita();
    CentroData ced = new CentroData();
    CiudadanoData cd = new CiudadanoData();
    VacunaData vd = new VacunaData();
    
    public CitaData(){
        con = Conexion.getConexion();
    }
    
    public void agregar(Cita cita, int dni) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO cita VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, "0");
            ps.setInt(2, dni);
            ps.setString(3, cita.getFechaHoraCita().toString());
            ps.setInt(4, cita.getNSerie());
            ps.setString(5, cita.getFechaHoraColocacion().toString());
            ps.setInt(6, cita.getCentro().getId());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la cita");
        }
    }
    public void eliminarPorId(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM laboratorio WHERE id = " + id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de eliminar Centro");
        }
    }
    public Cita buscarCita(int id){
        try{
            PreparedStatement ps = con.prepareStatement("select * from cita where id = " + id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
            cit.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
            cit.setCiudadano(cd.buscarPorDni(rs.getInt("dni")));
            cit.setNSerie(rs.getInt("numeroSerie"));
            cit.setVacuna(vd.buscarVacunaXNombre(rs.getString("vacuna")));
            cit.setDosis(String.valueOf(rs.getLong("numeroSerie")).charAt(9));
            cit.setEstadoCita(rs.getString("estadoCita"));
            cit.setFechaHoraCita(rs.getDate("fHCita").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());   
            cit.setFechaHoraColocacion(rs.getDate("fHAplicacion").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());                                         
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
        }return cit;
    }
    
    public Cita buscarTurnoXDni(int dni){
        try {
        PreparedStatement ps = con.prepareStatement("select * from cita where dni = ?");
        ps.setInt(1, dni); 
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Cita cita = new Cita();
            cita.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
            cita.setFechaHoraCita(rs.getTimestamp("fHCita").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());
            cita.setId(rs.getInt("id"));
            return cita;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
    }
    return null; 
}
    
    public Cita buscarTurnoPorId(int id) {
    try {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM cita WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Cita cita = new Cita();
            cita.setEstadoCita(rs.getString("estadoCita"));
            return cita;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
    }
    return null;
}

    public void cancelarTurnoPorId(int id) {
        try {
            String sql = "UPDATE cita SET estadoCita = 'CAN' WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasActualizadas = ps.executeUpdate();
            ps.close();
         if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "La cita con ID " + id + " ha sido cancelada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una cita con el ID " + id);
        }
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error inesperado al tratar de cancelar la cita.");
}

}
}
