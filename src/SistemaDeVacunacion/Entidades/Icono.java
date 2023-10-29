/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeVacunacion.Entidades;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Walter Benítez
 */
public class Icono {
    public static Icon CORRECTO = establecerIcono("correcto.png", 64, 64);
    
    private Icono(){}
    
    private static Icon establecerIcono(String archivo, int width, int height){
        ImageIcon imagen = new ImageIcon("src/Imagenes/" + archivo);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        
        return icono;
    }
}
