package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Centro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CentroData {
    Connection con;
    
    public CentroData() {
        con = Conexion.getConexion();
    }
    
    public void agregarCentro(Centro centro){
        try{
            PreparedStatement ps=con.prepareStatement("INSERT INTO centro VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, "0");
            ps.setString(2, centro.getDomicilio());
            ps.setLong(3, centro.getStock());
            ps.setString(4, centro.getProvincia());
            ps.setString(5, centro.getLocalidad());
            ps.setInt(6, centro.getCapacidad());
            ps.setInt(7, centro.getRegistrados()); 
                    
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar Centro");
        }
    }
    
    public void modificarStock(int id, int stock) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE centro SET stock=? WHERE id = " + id);
            ps.setLong(1, stock);

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar stock");
        }
    }
}
