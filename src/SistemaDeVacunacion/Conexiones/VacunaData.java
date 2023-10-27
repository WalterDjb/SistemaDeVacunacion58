package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VacunaData {
    private static Connection con = Conexion.getConexion();
    private static LaboratorioData ld=new LaboratorioData();
    private CentroData cd = new CentroData();
    
    
    public VacunaData(){
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
           ps.setInt(6, vacuna.getStock());
           /*if (vacuna.estado){
                ps.setInt(6, 1);
                }else{
                ps.setInt(6, 0);
                }
           */
           
           ResultSet rs = ps.executeQuery();
           JOptionPane.showMessageDialog(null, "Vacuna creada.");
           ps.close();
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla vacuna");
       }
    }
    
    public static Vacuna buscarVacunaXNombre (String marca){
        String sql = "SELECT * FROM `vacuna` WHERE marca LIKE '"+marca+"%'";
        Vacuna vacuna = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1, marca);
            //no toma el dato dinámico, o no lo convierte bien a string dentro de la sentencia sql, pero falla. -g-
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                vacuna = new Vacuna();
                vacuna.setLaboratorio(ld.buscarLaboratorioXCuit(rs.getLong("cuitLaboratorio")));
                vacuna.setAntigeno(rs.getString("antigeno"));
                vacuna.setCapacidadDosis(rs.getDouble("capacidadDosis"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setCaducidad(rs.getDate("caducidad").toLocalDate());
                vacuna.setStock(rs.getInt("stock"));
          //JOptionPane.showMessageDialog(null, "Laboratorio: "+vacuna.getLaboratorio().getNombre()+"\n Marca: "+vacuna.getMarca()+"\n Antigeno: "+vacuna.getAntigeno());
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
    
    public void modificarVacuna(Vacuna vacuna){
       String sql = "UPDATE vacuna SET capacidadDosis = ?, antigeno = ?, caducidad = ?, stock= ?  WHERE marca =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, vacuna.getCapacidadDosis());
            ps.setString(2, vacuna.getAntigeno());
            ps.setDate(3, Date.valueOf(vacuna.getCaducidad()));
            ps.setInt(4, vacuna.getStock());
            ps.setString(5, vacuna.getMarca());
            int funca = ps.executeUpdate();
            if (funca==1){
               JOptionPane.showMessageDialog(null, "Datos de la vacuna modificados.");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudieron modificar los datos de la vacuna.");
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No se pudo conectar con la vacuna.");
        }
   }
}
