package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CiudadanoData {
    private static Connection cn;
    
    private CiudadanoData(){}
    
    public static boolean dniTramiteEncontrados(int dni, long tramite){
        try {
            cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("select aplicaciones from ciudadano where dni = " + dni + " and tramite = " + tramite);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next() && rs.getInt("aplicaciones") > 0){
                return true;
            } else if(rs.getInt("apliaciones") <= 0) {
                JOptionPane.showMessageDialog(null, "Por el momento no tiene ningún certificado disponible", "No encontrado", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con los datos proporcionados", "Registro inexistente", 1);
        }
        return false;
    }
    
    // PENDIENTE
    public static Ciudadano buscarPorDni(int dni){
        Ciudadano ciudadano = new Ciudadano();
        try {
            cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("select * from ciudadano where dni = " + dni);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setNumTramite(rs.getLong("tramite"));
                ciudadano.setNombre(rs.getString("apellido") + ", " + rs.getString("nombre"));
                ciudadano.setProvincia(rs.getString("provincia"));
                ciudadano.setLocalidad(rs.getString("localidad"));
                ciudadano.setDomicilio(rs.getString("domicilio"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getLong("celular"));
                ciudadano.setTrabajo(rs.getString("ambitoTrabajo"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setDosis(rs.getInt("aplicaciones"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
        return ciudadano;
    }
}
