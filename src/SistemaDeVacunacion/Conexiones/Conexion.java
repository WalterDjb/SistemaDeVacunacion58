package SistemaDeVacunacion.Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="db_sistemadevacunacion";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion() {}
    
    public static Connection getConexion() {
        
        if (connection ==null){
             
            try {
                Class.forName("org.mariadb.jdbc.Driver"); 
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                //JOptionPane.showMessageDialog(null, "Conectado");
                System.err.println("CONECTADO A LA BASE DE DATOS");
                
            } catch (ClassNotFoundException ex) {
                //JOptionPane.showMessageDialog(null, "error cargar Driver");
                System.err.println("ERROR AL CARGAR EL DRIVER");
                
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "error de conexion");
                System.err.println("ERROR DE CONEXION " + ex);
            }
        }
        return connection;
    }    
}
