package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class CentroData {

    Connection con;
    Centro centro = new Centro();
    ArrayList<Centro> centros = new ArrayList<>();
    Vacuna vac = new Vacuna();
    public CentroData() {
        con = Conexion.getConexion();
    }

    public void agregar(Centro centro) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO `centro`(`direccion`,`provincia`, `localidad`, `capacidad`, `registrados`) VALUES (?,?,?,?,'0')",Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, centro.getDomicilio());
            ps.setString(2, centro.getProvincia());
            ps.setString(3, centro.getLocalidad());
            ps.setInt(4, centro.getCapacidad());

            ps.executeUpdate();
            
            ResultSet rs =ps.getGeneratedKeys();
            int id = 0;
            if (rs.next()){
                id = rs.getInt(1);
            }
            //no tocar este desastre, capaz algún día lo arreglo -g- -.-'
            //desde acá va un for each vacuna en vacunas
            //for (int i = 0; i <= centro.vacunas.size(); i++){
                PreparedStatement ps2 = con.prepareStatement("INSERT INTO stock (idCentro"/*,'vacunas','stock'*/+") VALUES (?)");
                ps2.setInt(1, id);
                //ps2.setString(2, centro.vacunas.get(i).getMarca());
                //ps2.setInt(3, centro.vacunas.get(i).getStock());
               // }
        ps2.executeUpdate();
        ps.close();
        ps2.close();
        }catch(SQLException ex){
            System.err.println("Error "+ex.getMessage());
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

    public void eliminarPorId(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM laboratorio WHERE id = " + id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de eliminar Centro");
        }
    }
    
     public Centro buscarCentroXId(int id){
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("select * from centro where id = " + id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                centro.setId(rs.getInt("id"));
                centro.setDomicilio(rs.getString("direccion"));
                centro.setStock(rs.getInt("stock"));
                centro.setProvincia(rs.getString("provincia"));
                centro.setLocalidad(rs.getString("localidad"));
                centro.setCapacidad(rs.getInt("capacidad"));
                centro.setRegistrados(rs.getInt("registrados"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR al buscar el centro por ID");
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "El ID debe ser un valor numérico.");
        }
        return centro;
    }
     
     public Centro buscarCentroXLocalidad(String localidad){
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("select * from centro where localidad = " + localidad);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                centro.setId(rs.getInt("id"));
                centro.setDomicilio(rs.getString("direccion"));
                centro.setStock(rs.getInt("stock"));
                centro.setProvincia(rs.getString("provincia"));
                centro.setLocalidad(rs.getString("localidad"));
                centro.setCapacidad(rs.getInt("capacidad"));
                centro.setRegistrados(rs.getInt("registrados"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR buscando el centro por localidad");
        }
        return centro;
    }

    public List<Centro> listarCentrosXProvincia(String provincia) {
    con = Conexion.getConexion();
    List<Centro> centros = new ArrayList<>();
    try {
        con = Conexion.getConexion();
        String sql = "select * from centro where provincia = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Centro centro = new Centro();
            centro.setId(rs.getInt("id"));
            centro.setDomicilio(rs.getString("direccion"));
            centro.setStock(rs.getInt("stock"));
            centro.setProvincia(rs.getString("provincia"));
            centro.setLocalidad(rs.getString("localidad"));
            centro.setCapacidad(rs.getInt("capacidad"));
            centro.setRegistrados(rs.getInt("registrados"));
            centros.add(centro);
        }
    } catch (SQLException e) {
        System.out.println("ERROR: " + e.getMessage());
    } catch (NullPointerException npe){
        System.err.println("Error; "+npe.getMessage());
    }
    return centros;
    }
}
