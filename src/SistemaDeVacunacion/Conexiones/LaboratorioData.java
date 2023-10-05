package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class LaboratorioData {
    private Connection con=null;
    
    public LaboratorioData(){
        con=Conexion.getConexion();
    }
    public void guardarLaboratorio(Laboratorio laboratorio){
     
        String sql ="INSERT INTO laboratorio (cuit, nombre, pais, direccion, stock) + VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getNombre());
            ps.setString(3, laboratorio.getPais());
            ps.setString(4, laboratorio.getDomicilio());
            ps.setInt(5, laboratorio.getStock()); 
                    
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cant create Lab");
        }
                
    }
    
   
}