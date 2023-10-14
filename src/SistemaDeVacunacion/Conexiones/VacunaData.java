package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VacunaData {
    private Connection con=null;
    LaboratorioData ld=new LaboratorioData();
    
    public VacunaData(){
        con=Conexion.getConexion();
    }

    public void guardarVacuna(Vacuna vacuna){
       try {
           String sql ="INSERT INTO vacuna VALUES(?, ?, ?, ?, ?, ?)";
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setLong(1, vacuna.getLaboratorio().getCuit());
           //ps.setInt(2, vacuna.getSerie());
           ps.setDouble(2, vacuna.getCapacidadDosis());
           ps.setString(3, vacuna.getMarca());
           ps.setString(4, vacuna.getAntigeno());
           ps.setDate(5, Date.valueOf(vacuna.getCaducidad()));
           if (vacuna.estado){
                ps.setInt(6, 1);
                }else{
                ps.setInt(6, 0);
                }
           
           ps.executeUpdate();
           
           ps.close();
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla vacuna");
       }
    }
    
    public Vacuna buscarVacunaXNombre (String marca){
        String sql = "SELECT * FROM `vacuna` WHERE marca LIKE '?%'";
        Vacuna vacuna = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, marca);
            //no toma el dato dinámico, o no lo convierte bien a string dentro de la sentencia sql, pero falla. -g-
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                vacuna = new Vacuna();
                vacuna.setLaboratorio(ld.buscarLaboratorioXCuit(rs.getLong("cuitLaboratorio")));
                vacuna.setAntigeno(rs.getString("antigeno"));
                vacuna.setCapacidadDosis(rs.getDouble("capacidadDosis"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setCaducidad(rs.getDate("caducidad").toLocalDate());
          JOptionPane.showMessageDialog(null, "Laboratorio: "+vacuna.getLaboratorio().getNombre()+"\n Marca: "+vacuna.getMarca()+"\n Antigeno: "+vacuna.getAntigeno());
          //no se asusten, no me volví loco. El pane de arriba es para ver si recoge bien los datos solamente
            } else{
                JOptionPane.showMessageDialog(null, "No existe un resultado para su busqueda");
            }
            ps.close();
        } catch (SQLException ex) {
            System.err.println("No se pudo ejecutar el buscador de vacunas por nombre -g-");
        }
        return vacuna;
    }
    
    private void eliminarVacuna (Vacuna vacuna){
        String sql = "DELETE vacuna WHERE marca= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vacuna.marca);
            
            int  funca = ps.executeUpdate();
            if (funca==1){
                JOptionPane.showMessageDialog(null, "Vacuna eliminada.");
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar la vacuna");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla vacuna");
        }
        
    }
}
