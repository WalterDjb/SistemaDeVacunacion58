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
            ps.setString(4, laboratorio.getDireccion());
            ps.setLong(5, laboratorio.getStock()); 
                    
            ResultSet rs=ps.executeQuery();
            //if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Laboratorio creado.");
            //}
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
   public void modificarLaboratorioXCuit(Laboratorio laboratorio){
       String sql = "UPDATE laboratorio SET nombre = ?, pais = ?, direccion= ?, stock= ?  WHERE cuit =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(5, laboratorio.getCuit());
            ps.setString(1, laboratorio.getNombre());
            ps.setString(2, laboratorio.getPais());
            ps.setString(3, laboratorio.getDireccion());
            ps.setLong(4, laboratorio.getStock());
            int funca = ps.executeUpdate();
            if (funca==1){
               JOptionPane.showMessageDialog(null, "Datos de laboratorio modificados.");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudieron modificar los datos del laboratorio.");
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No se pudo conectar con el laboratorio.");
        }
   }
   
   public void modificarLaboratorioXNombre(Laboratorio laboratorio){
       String sql = "UPDATE laboratorio SET cuit = ?, pais = ?, direccion= ?, stock= ?  WHERE nombre =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, laboratorio.getNombre());
            ps.setLong(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getPais());
            ps.setString(3, laboratorio.getDireccion());
            ps.setLong(4, laboratorio.getStock());
            int funca = ps.executeUpdate();
            if (funca==1){
               JOptionPane.showMessageDialog(null, "Datos de laboratorio modificados.");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudieron modificar los datos del laboratorio.");
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No se pudo conectar con el laboratorio.");
        }
   }
   
   public void eliminarLaboratorio(Laboratorio laboratorio){
       
       String sql = "DELETE FROM laboratorio WHERE cuit = ?";
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, laboratorio.getCuit());
            
            int funca = ps.executeUpdate();
                if(funca == 1) {
                    JOptionPane.showMessageDialog(null, "Laboratorio eliminado.");
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el laboratorio.");
                }
            
            ps.close(); 
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con el laboratorio.");
        }
   }
   
   public Laboratorio buscarLaboratorioXCuit(long cuit){
    String sql= "SELECT * FROM laboratorio WHERE cuit =?";
    Laboratorio laboratorio = null;
    try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setLong(1, cuit);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                laboratorio = new Laboratorio();
                laboratorio.setCuit(rs.getLong("cuit"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDireccion(rs.getString("direccion"));
                laboratorio.setNombre(rs.getString("nombre"));
                laboratorio.setStock(rs.getLong("stock"));
            }
        } catch (SQLException ex) {
            System.err.println("error al conectar con la base de datos de laboratorio");
        }
        return laboratorio;
       }
   
   public Laboratorio buscarLaboratorioXNombre(String nombre){
    String sql= "SELECT * FROM laboratorio WHERE nombre LIKE '"+nombre+"%'";
    Laboratorio laboratorio = null;
    try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                laboratorio = new Laboratorio();
                laboratorio.setCuit(rs.getLong("cuit"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDireccion(rs.getString("direccion"));
                laboratorio.setNombre(rs.getString("nombre"));
                laboratorio.setStock(rs.getLong("stock"));
            }
        } catch (SQLException ex) {
            System.err.println("error al conectar con la base de datos de laboratorio");
        }
        return laboratorio;
       }
}