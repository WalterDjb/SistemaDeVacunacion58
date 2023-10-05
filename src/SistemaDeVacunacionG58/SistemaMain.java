/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeVacunacionG58;

import SistemaDeVacunacion.Conexiones.LaboratorioData;
import SistemaDeVacunacion.Entidades.Laboratorio;

/**
 *
 * @author Walter Benítez
 */
public class SistemaMain {
    public static void main(String[] args){
    
        Laboratorio aa= new Laboratorio("Pfizer", "EEUU", "Misuri 3245", "20321231231",1000);
        LaboratorioData ld= new LaboratorioData ();
        //ld.guardarLaboratorio(aa);
        ld.modificarStockLaboratorio(aa);
    }
}
