package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class LaboratorioData {
    private Connection con=null;
    
    public LaboratorioData(){
        con=Conexion.getConexion();
    }
    public void guardarLaboratorio(Laboratorio laboratorio){
     
        String sql ="INSERT INTO laboratorio VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getNombre());
            ps.setString(3, laboratorio.getPais());
            ps.setString(4, laboratorio.getDomicilio());
            ps.setLong(5, laboratorio.getStock()); 
                    
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Laboratorio creado.");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el laboratorio.");
        }
                
    }
    
   public void modificarStockLaboratorio(Laboratorio laboratorio){
       
       String sql = "UPDATE laboratorio SET stock=? WHERE cuit=?";
       
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, laboratorio.getStock());
            ps.setLong(2, laboratorio.getCuit());
//ps.setString(1, String.valueOf(laboratorio.getStock()));
            //ps.setString(2, String.valueOf(laboratorio.getCuit()));
            System.out.println(laboratorio.getStock() +"Valor de stock actualizado.");
            
            ps.executeUpdate();
            
            ps.close(); 
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el valor de stock del laboratorio.");
        }
}
   public void modificarLaboratorio(Laboratorio laboratorio){
       //pendiente de ser probado -g-
       String sql = "UPDATE laboratorio SET nombre = ?, pais = ?, domicilio= ?, stock= ?  WHERE cuit =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(5, laboratorio.getCuit());
            ps.setString(1, laboratorio.getNombre());
            ps.setString(2, laboratorio.getPais());
            ps.setString(3, laboratorio.getDomicilio());
            ps.setLong(4, laboratorio.getStock());
            int funca = ps.executeUpdate();
            if (funca==1){
               JOptionPane.showMessageDialog(null, "Datos de laboratorio modificados.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron modificar los datos del laboratorio.");
        }
   }
   
   public void eliminarLaboratorio(Laboratorio laboratorio){
       
       String sql = "DELETE FROM laboratorio WHERE cuit = ?";
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, laboratorio.getCuit());
            
            ps.executeUpdate();
            //ResultSet rs=ps.getGeneratedKeys();
            //if(rs.next()) {
            //    JOptionPane.showMessageDialog(null, "Lab deleted");
                
            //}
            
            ps.close(); 
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede crear el laboratorio.");
        }
   }
   
}