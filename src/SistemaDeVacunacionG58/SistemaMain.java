package SistemaDeVacunacionG58;

import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Conexiones.LaboratorioData;
import SistemaDeVacunacion.Conexiones.VacunaData;
import SistemaDeVacunacion.Entidades.Correo;
import SistemaDeVacunacion.Entidades.Laboratorio;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaMain {
    public static void main(String[] args){
    
        //Laboratorio aa= new Laboratorio("DawsonLab", "Peronia", "IngenieroBenitez666", "30123456789",2);
        LaboratorioData ld= new LaboratorioData ();
        //ld.guardarLaboratorio(aa);
        //ld.modificarStockLaboratorio(aa);
        //ld.eliminarLaboratorio(aa);
        //LocalDate loc = LocalDate.of(2023, 11, 1);
        //Vacuna bb = new Vacuna(aa, "vacunola lince", "caca de perro mensajero", true, loc, 2);
        VacunaData vd = new VacunaData ();
       //try{ 
       //vd.guardarVacuna(bb);
       //}catch(Exception e){
       //}
       //ld.modificarLaboratorio(aa);
       //ld.buscarLaboratorioXCuit(30123);
       Vacuna vacu = vd.buscarVacunaXNombre("vacu");
       
       ArrayList<Vacuna> vacunas = new ArrayList();
       
       vacunas.addAll(CentroData.StockDeVacunas(0));
    }
}
