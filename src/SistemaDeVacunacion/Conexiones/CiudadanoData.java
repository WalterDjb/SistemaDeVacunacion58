package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CiudadanoData {

    public static Connection con = Conexion.getConexion();

    public CiudadanoData() {
    }

    public static boolean dniTramiteEncontrados(int dni, String tramite) {
        try {
            con = Conexion.getConexion();
            PreparedStatement pst = con.prepareStatement("select aplicaciones from ciudadano where dni = " + dni + " and tramite = " + tramite);
            ResultSet rs = pst.executeQuery();

            if (rs.next() && rs.getInt("aplicaciones") > 0) {
                return true;
            } else if (rs.getInt("aplicaciones") <= 0) {
                JOptionPane.showMessageDialog(null, "Por el momento no tiene ningún certificado disponible", "No encontrado", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con los datos proporcionados", "Registro inexistente", 1);
        }
        return false;
    }

    public static Ciudadano buscarPorDni(int dni) {
        Ciudadano ciudadano = null; // Inicializamos como null

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("select * from ciudadano where dni = ?");
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setNumTramite(rs.getString("tramite"));
                ciudadano.setNombre(rs.getString("nombre"));
                ciudadano.setApellido(rs.getString("apellido"));
                ciudadano.setProvincia(rs.getString("provincia"));
                ciudadano.setLocalidad(rs.getString("localidad"));
                ciudadano.setDomicilio(rs.getString("domicilio"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getLong("celular"));
                ciudadano.setAmbito(rs.getString("ambitoTrabajo"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setDosis(rs.getInt("aplicaciones"));
                ciudadano.setUltimaDosis(rs.getTimestamp("ultimaDosis").toLocalDateTime());
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return ciudadano;
    }

    public static void guardarCiudadano(Ciudadano ciudadano) {

        String sql = "INSERT INTO ciudadano (dni,tramite,nombre,apellido, provincia, localidad, email, celular, patologia, ambitoTrabajo, domicilio)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, String.valueOf(ciudadano.getNumTramite()));
            ps.setString(3, ciudadano.getNombre());
            ps.setString(4, ciudadano.getApellido());
            ps.setString(5, ciudadano.getProvincia());
            ps.setString(6, ciudadano.getLocalidad());
            ps.setString(7, ciudadano.getEmail());
            ps.setLong(8, ciudadano.getCelular());
            ps.setString(9, ciudadano.getPatologia());
            ps.setString(10, ciudadano.getAmbito());
            ps.setString(11, ciudadano.getDomicilio());
            //System.out.println(sql);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                ciudadano.setDni(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudadano Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano");
            System.err.println("Error; " + ex.getMessage());
        }
    }
}
