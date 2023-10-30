package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class CentroData {

    private static Connection con;
    private static Centro cen = new Centro();
    private ArrayList<Centro> centros = new ArrayList<>();
    private Vacuna vac = new Vacuna();
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
                //PreparedStatement ps2 = con.prepareStatement("INSERT INTO stock (idCentro"/*,'vacunas','stock'*/+") VALUES (?)");
                //ps2.setInt(1, id);
                //ps2.setString(2, centro.vacunas.get(i).getMarca());
                //ps2.setInt(3, centro.vacunas.get(i).getStock());
               // }
        //ps2.executeUpdate();

        PreparedStatement ps3 = con.prepareStatement("INSERT INTO acceso (nivel, nombre, email, usuario, contra, tipoContra) VALUES (?,?,?,?,?,?)");
        ps3.setInt(1, 3);
        ps3.setString(2, "Centro "+id);
        ps3.setString(3, "-");
        ps3.setString(4, id+"-"+centro.getLocalidad());
        ps3.setString(5, id+"-"+centro.getLocalidad());
        ps3.setString(6, "A");
        ps3.executeUpdate();
        
        ps.close();
        //ps2.close();
        ps3.close();
        
        JOptionPane.showMessageDialog(null, "Creado el Centro de vacunación "+id+"-"+centro.getLocalidad());
        
        }catch(SQLException ex){
            System.err.println("Error "+ex.getMessage());
        }
    }

    public void modificarStock(int id, int stock) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE stock SET stock=? WHERE id = " + id);
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
    
     public static Centro buscarCentroXId(int id){
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("select * from centro where id = " + id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cen.setId(rs.getInt("id"));
                cen.setDomicilio(rs.getString("direccion"));
                cen.setStock(rs.getInt("stock"));
                cen.setProvincia(rs.getString("provincia"));
                cen.setLocalidad(rs.getString("localidad"));
                cen.setCapacidad(rs.getInt("capacidad"));
                cen.setRegistrados(rs.getInt("registrados"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR al buscar el centro por ID");
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "El ID debe ser un valor numérico.");
        }
        return cen;
    }
     
     public Centro buscarCentroXLocalidad(String localidad){
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("select * from centro where localidad = " + localidad);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cen.setId(rs.getInt("id"));
                cen.setDomicilio(rs.getString("direccion"));
                cen.setStock(rs.getInt("stock"));
                cen.setProvincia(rs.getString("provincia"));
                cen.setLocalidad(rs.getString("localidad"));
                cen.setCapacidad(rs.getInt("capacidad"));
                cen.setRegistrados(rs.getInt("registrados"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR buscando el centro por localidad");
        }
        return cen;
    }

    public List<Centro> listarCentrosXProvincia(String provincia) {
    con = Conexion.getConexion();
    List<Centro> centros = new ArrayList<>();
    try {
        con = Conexion.getConexion();
        String sql = "select * from centro where provincia = (?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, provincia);
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
    
    public List<Vacuna> StockDeVacunas(int id){
        String sql = "SELECT vacuna, stock FROM stock WHERE idCentro = "+id;
        List<Vacuna> vacunas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                vac.setMarca(rs.getString("vacuna"));
                vac.setStock(rs.getInt("stock"));
                vacunas.add(vac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CentroData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vacunas;
    }
    
    public void actualizarCitasVacunado(String serie, int id) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE cita SET fHAplicacion = NOW(), estadoCita = 'CUM', numeroSerie = ? WHERE id = ?");
            ps.setString(1, serie);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado al tratar de actualizar el estado de las Citas");
        }
    }
}
