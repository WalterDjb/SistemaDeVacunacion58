package SistemaDeVacunacion.Conexiones;

import java.sql.Connection;

public class LaboratorioData {
    private Connection con=null;
    
    public LaboratorioData(){
        con=Conexion.getConexion();
    }
    public void guardarLaboratorio(){
        
    }
}