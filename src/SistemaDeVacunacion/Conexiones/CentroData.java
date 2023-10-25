package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Centro;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CentroData {

    Connection con;
    Centro centro = new Centro();
    ArrayList<Centro> centros = new ArrayList<>();

    public CentroData() {
        con = Conexion.getConexion();
    }

    public void agregar(Centro centro) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO centro VALUES (?, ?, ?, ?, ?, ?, ?)");
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
