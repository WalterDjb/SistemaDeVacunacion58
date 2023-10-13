package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Acceso;
import SistemaDeVacunacion.Vistas.Login;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class AccesoData {

    private static Connection cn;

    private AccesoData() {}

    public static void crear(Acceso acceso) {
        try {
            cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("insert into acceso values(?, ?, ?, ?, ?, ?)");
            pst.setInt(1, acceso.getNivel());
            pst.setString(2, acceso.getNombre());
            pst.setString(3, acceso.getEmail());
            pst.setString(4, acceso.getUsuario());
            pst.setString(5, acceso.getContra());
            pst.setString(6, acceso.getTipoContra());

            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al crear nuevo acceso " + e);
        }
    }

    public static void eliminarPorUsuario(String usuario) {
        try {
            cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("delete from acceso where usuario = '" + usuario + "'");
            
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar acceso " + e);
        }
    }

    public static void modificarContraseñaProvisoria(String contra) {
        try {
            cn = Conexion.getConexion();
            PreparedStatement pst = cn.prepareStatement("update acceso set contra = ?, tipoContra = ? where usuario = '" + Login.user + "'");
            pst.setString(1, contra);
            pst.setString(2, "A");
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Contraseña modificada con éxito!", "Operación exitosa", 1);
        } catch (SQLException e) {
            System.err.println("Error al modificar contraseña " + e);
        }
    }
}
