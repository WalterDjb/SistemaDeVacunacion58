package SistemaDeVacunacion.Entidades;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Walter Benítez
 */
public class Icono {
    public static final Icon CORRECTO = establecerIcono("icon_correcto.png", 64, 64);
    public static final Icon ERROR = establecerIcono("icon_error.png", 64, 64);
    
    private Icono(){}
    
    private static Icon establecerIcono(String archivo, int width, int height){
        ImageIcon imagen = new ImageIcon("src/Imagenes/" + archivo);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        
        return icono;
    }
}
