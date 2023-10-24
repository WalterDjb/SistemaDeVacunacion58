package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Cita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            //cit.setFechaHoraCita(rs.getDate("fHCita").toInstant().atZone(GMT-3:00).toLocalDateTime());   <<<---Arreglar
            //cit.setFechaHoraColocacion(rs.getDate("fHAplicacion").toInstant());                                            <<<---Arreglar
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
        }return cit;
    }
}
