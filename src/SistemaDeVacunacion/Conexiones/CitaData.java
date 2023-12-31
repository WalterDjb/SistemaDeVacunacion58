package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Cita;
import SistemaDeVacunacion.Entidades.Vacuna;
import SistemaDeVacunacion.Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class CitaData {

    private static Connection con = Conexion.getConexion();
    private static Cita cit = new Cita();
    private static CentroData ced = new CentroData();
    private static CiudadanoData cd = new CiudadanoData();
    private static VacunaData vd = new VacunaData();

    public CitaData() {
    }

    public void agregar(Cita cita, int dni) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO cita VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, "0");
            ps.setInt(2, dni);
            ps.setString(3, cita.getFechaHoraCita().toString());
            ps.setString(4, cita.getNSerie());
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

    public Cita buscarCita(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("select * from cita where id = " + id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cit.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
                cit.setCiudadano(cd.buscarPorDni(rs.getInt("dni")));
                cit.setNSerie(rs.getString("numeroSerie"));
                cit.setVacuna(vd.buscarVacunaXNombre(rs.getString("vacuna")));
                cit.setDosis(String.valueOf(rs.getLong("numeroSerie")).charAt(9));
                cit.setEstadoCita(rs.getString("estadoCita"));
                cit.setFechaHoraCita(rs.getDate("fHCita").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());
                cit.setFechaHoraColocacion(rs.getDate("fHAplicacion").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
        }
        return cit;
    }

    public Cita buscarTurnoXDni(int dni) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * from cita where dni = ?");
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Cita cita = new Cita();
                cita.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
                cita.setFechaHoraCita(rs.getTimestamp("fHCita").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());
                cita.setId(rs.getInt("id"));
                cita.setEstadoCita(rs.getString("estadoCita"));
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
    
    public static Cita obtenerUltimaAplicacion(int dni, LocalDateTime ultima){
        Cita cita = null;
        
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * from cita where dni = " + dni + " and fHAplicacion = '" + ultima + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                cita = new Cita();
                
                cita.setId(rs.getInt("id"));
                cita.setCiudadano(CiudadanoData.buscarPorDni(dni));
                cita.setCentro(CentroData.buscarCentroXId(rs.getInt("centro")));
                cita.setFechaHoraCita(rs.getTimestamp("fHCita").toLocalDateTime());
                cita.setFechaHoraColocacion(rs.getTimestamp("fHAplicacion").toLocalDateTime());
                cita.setEstadoCita(rs.getString("estadoCita"));
                cita.setNSerie(rs.getString("numeroSerie"));
                cita.setVacuna(VacunaData.buscarVacunaXNombre(rs.getString("Vacuna")));
            }
            
        } catch (SQLException e) {
            System.err.println("ERROR en el método obtenerUltimaAplicación" + e);
        }
        
        return cita;
    
    }
    
    public List<Cita> obtenerCitasPorProvincia(String provincia, int ano, int mes) {
    List<Cita> citas = new ArrayList<>();
    
    if (con != null) {
        String consulta = "SELECT  c.fHCita, c.estadoCita, ce.id, ce.localidad FROM cita AS c JOIN centro AS ce ON c.centro = ce.id WHERE ce.provincia = ? AND YEAR(c.fHCita) = ? AND MONTH(c.fHCita) = ?";
        
        try (PreparedStatement ps = con.prepareStatement(consulta)) {
            ps.setString(1, provincia);
            ps.setInt(2, ano);
            ps.setInt(3, mes);
            ResultSet rs = ps.executeQuery();
            
             while (rs.next()) {
            Cita cita = new Cita();
            cita.setFechaHoraCita(rs.getTimestamp("fHCita").toLocalDateTime());
            cita.setEstadoCita(rs.getString("estadoCita"));
            cita.setId(rs.getInt("id"));
            cita.setLocalidad(rs.getString("localidad")); 
            citas.add(cita);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } 
}

    return citas;
}
    
    public void actualizarCitasVencidas() {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE cita SET estadoCita = 'VEN'WHERE estadoCita IS NULL AND fHCita <= DATE_ADD(NOW(), INTERVAL 1 DAY);");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de actualizar el estado de las Citas");
        }
    }
    
    public static List <Cita> cargarCitasPorCentroYDni (int id, int dni){
        List <Cita> citas = new ArrayList<>();
        Cita cita = new Cita();
        String sql = "SELECT * FROM cita WHERE centro = '"+id+"' AND dni = '"+dni+"' AND estadoCita IS NULL";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cita.setCiudadano(cd.buscarPorDni(dni));
                cita.setCentro(ced.buscarCentroXId(id));
                cita.setDosis(cd.buscarPorDni(dni).getDosis());
                cita.setFechaHoraColocacion(cd.buscarPorDni(dni).getUltimaDosis());
                citas.add(cita);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de actualizar el estado de las Citas");
        }
     return citas;
    }
    
    public List<Cita> obtenerVacunadosXCentro(int centro) {
    List<Cita> citas = new ArrayList<>();
    
    if (con != null) {
        String consulta = "SELECT * FROM cita WHERE centro = ? AND estadoCita = 'CUM'";
        
        try (PreparedStatement ps = con.prepareStatement(consulta)) {
            ps.setInt(1, centro);
            ResultSet rs = ps.executeQuery();
            
             if (rs.next()) {
                Cita cita = new Cita();
                Vacuna vacuna = new Vacuna();
                vacuna.setMarca(rs.getString("Vacuna"));
                cita.setVacuna(vacuna);
                cita.setDni(rs.getInt("dni"));
                cita.setNSerie(rs.getString("numeroSerie"));
                
                citas.add(cita);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error inesperado al tratar de obtener los vacunados por centro");
    } 
}

    return citas;
}
    
   public List<Cita> obtenerVacunasAplicadasDiaria(Date fechaAplicacion) {
    List<Cita> citas = new ArrayList<>();

    if (con != null) {
        String consulta = "SELECT  c.fHAplicacion, c.estadoCita, ce.id, ce.localidad FROM cita AS c JOIN centro AS ce ON c.centro = ce.id WHERE c.fHAplicacion = ? AND estadoCita = 'CUM'";

        try (PreparedStatement ps = con.prepareStatement(consulta)) {
            ps.setDate(1, new java.sql.Date(fechaAplicacion.getTime()));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cita cita = new Cita();
                cita.setFechaHoraCita(rs.getTimestamp("fHAplicacion").toLocalDateTime());
                cita.setEstadoCita(rs.getString("estadoCita"));
                cita.setId(rs.getInt("id"));
                cita.setLocalidad(rs.getString("localidad"));
//                cita.setCentro(centro);
                
                citas.add(cita);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de obtener los vacunados diariamente");
        }
    }

    return citas;
}
    
    public void crearCitaPorDniYId (int dni, int id){
        try {
        Cita cita = new Cita();
        cita.setCiudadano(cd.buscarPorDni(dni));
        cita.setCentro(ced.buscarCentroXId(id));
        cita.setDosis(cd.buscarPorDni(dni).getDosis()+1);
        cita.setFechaHoraColocacion(cd.buscarPorDni(dni).getUltimaDosis());
        String sql = "INSERT INTO citas VALUES (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cita.ciudadano.getDni());
            ps.setString(2, cita.fechaHoraCita.toString());
            ps.setString(3, cita.getVacuna().getMarca());
            ps.setString(4, cita.fechaHoraColocacion.toString());
            ps.setInt(5, cita.centro.getId());
            //ps.setString(6, "NULL");
            //ps.setString(7, "NULL");
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERROR crítico mortal y muchas cosas malas en crearCitaPorDniYId: "+ex.getMessage());
        }
        
    }
    public Cita buscarTurnoXDni2(int dni) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * from cita where dni = ? AND estadoCita IS NULL");
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Cita cita = new Cita();
                cita.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
                cita.setFechaHoraCita(rs.getTimestamp("fHCita").toInstant().atZone(ZoneId.of("GMT-3")).toLocalDateTime());
                cita.setId(rs.getInt("id"));
                cita.setEstadoCita(rs.getString("estadoCita"));
                return cita;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
        }
        return null;
    }
    
    public List<Cita> buscarPersonasSinTurno() {
    List<Cita> citas = new ArrayList<>();
    
    try {
        PreparedStatement ps = con.prepareStatement("SELECT cita.*, ciudadano.patologia, ciudadano.ambitoTrabajo FROM cita INNER JOIN ciudadano ON cita.DNI = ciudadano.DNI WHERE (cita.fHCita IS NULL) AND ciudadano.patologia <> 'Ninguna' OR ciudadano.ambitoTrabajo <> 'Otros'");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Cita cita = new Cita();
            cita.setId(rs.getInt("id"));
            cita.setDni(rs.getInt("dni"));
            cita.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
            
            
            Ciudadano ciudadano = new Ciudadano();
            ciudadano.setPatologia(rs.getString("patologia"));
            ciudadano.setAmbito(rs.getString("ambitoTrabajo"));
            cita.setCiudadano(ciudadano);
            
            citas.add(cita);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
    }
    
    return citas;
}

    public List<Cita> buscarPersonasSinTurno1() {
    List<Cita> citas = new ArrayList<>();
    
    try {
        PreparedStatement ps = con.prepareStatement("SELECT cita.*, ciudadano.patologia, ciudadano.ambitoTrabajo FROM cita INNER JOIN ciudadano ON cita.DNI = ciudadano.DNI WHERE (cita.fHCita IS NULL) AND ciudadano.ambitoTrabajo <> 'Salud' AND ciudadano.ambitoTrabajo <> 'Educacion'");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Cita cita = new Cita();
            cita.setId(rs.getInt("id"));
            cita.setDni(rs.getInt("dni"));
            cita.setCentro(ced.buscarCentroXId(rs.getInt("centro")));
            
            
            Ciudadano ciudadano = new Ciudadano();
            ciudadano.setPatologia(rs.getString("patologia"));
            ciudadano.setAmbito(rs.getString("ambitoTrabajo"));
            cita.setCiudadano(ciudadano);
            
            citas.add(cita);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a Cita.");
    }
    
    return citas;
}
   public void AsignarFecha(Date fechaCita, int id) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE cita SET fHCita = ? WHERE id = ?");
            ps.setDate(1, new java.sql.Date(fechaCita.getTime()));
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de actualizar el estado de las Citas");
        }
    }  

public void CargarCita(int dni, int centro) {
    try {
        PreparedStatement ps = con.prepareStatement("INSERT INTO cita (dni, centro) VALUES (?, ?)");
        ps.setInt(1, dni);
        ps.setInt(2, centro);
        ps.executeUpdate();
        ps.close();
        con.close(); 
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error inesperado al tratar de actualizar las Citas");
    }
}   
}

