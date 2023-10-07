package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VacunaData {
    private Connection con=null;

    public VacunaData(){
        con=Conexion.getConexion();
    }
    public void guardarVacuna(Vacuna vacuna){
        
        

            
       try {
           String sql ="INSERT INTO vacuna VALUES(?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setLong(1, vacuna.getLaboratorio().getCuit());
           ps.setInt(2, vacuna.getSerie());
           ps.setDouble(3, vacuna.getCapacidadDosis());
           ps.setString(4, vacuna.getMarca());
           ps.setString(5, vacuna.getAntigeno());
           ps.setDate(6, Date.valueOf(vacuna.getCaducidad()));
           if (vacuna.estado){
           ps.setInt(7, 1);
           }else{
               ps.setInt(7, 0);
           }
           
           ps.executeUpdate();
           
           ps.close();
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla vacuna");
       }
    }
}
