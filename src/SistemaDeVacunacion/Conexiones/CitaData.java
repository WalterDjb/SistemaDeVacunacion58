package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CitaData {
    Connection con;
    
    public CitaData(){
        con = Conexion.getConexion();
    }
    
    public void agregar(Cita cita, int dni) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO cita VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, "0");
            ps.setInt(2, dni);
            ps.setString(3, cita.getFechaHoraCita().toString());
            ps.setInt(4, cita.getCodigo());
            ps.setString(5, cita.getFechaHoraColocacion().toString());
            ps.setInt(6, cita.getCentro().getId());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la cita");
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
}
