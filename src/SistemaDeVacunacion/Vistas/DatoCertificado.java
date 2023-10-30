package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Conexiones.CiudadanoData;
import SistemaDeVacunacion.Entidades.Cita;
import java.awt.Image;
import java.awt.Toolkit;
import SistemaDeVacunacion.Entidades.Ciudadano;
import SistemaDeVacunacion.Entidades.Icono;
import java.time.format.DateTimeFormatter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.Rectangle;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class DatoCertificado extends javax.swing.JFrame {

    private Ciudadano ciudadano;
    private Cita cita;

    public DatoCertificado() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Resultado de búsqueda");

        ciudadano = CiudadanoData.buscarPorDni(ObtenerCertificado.dni);
        cita = CitaData.obtenerUltimaAplicacion(ObtenerCertificado.dni, ciudadano.getUltimaDosis());
        label_dni.setText(String.valueOf(ciudadano.getDni()));
        label_nombre.setText(ciudadano.getApellido() + ", " + ciudadano.getNombre());
        label_dosis.setText(String.valueOf(ciudadano.getDosis()));
        label_ultima.setText(ciudadano.getUltimaDosis().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        label_vacuna.setText(cita.getVacuna().getMarca());
        label_centro.setText(cita.getCentro().getId() + "-" + cita.getCentro().getLocalidad() + "-" + cita.getCentro().getDomicilio());
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        boton_volver = new javax.swing.JButton();
        label_titulo_nombre = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_titulo_dni = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_titulo_dosis = new javax.swing.JLabel();
        label_dosis = new javax.swing.JLabel();
        label_titulo_ultima = new javax.swing.JLabel();
        label_ultima = new javax.swing.JLabel();
        label_titulo_vacuna = new javax.swing.JLabel();
        label_vacuna = new javax.swing.JLabel();
        label_titulo_centro = new javax.swing.JLabel();
        label_centro = new javax.swing.JLabel();
        boton_descargar_certificado = new javax.swing.JButton();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("Datos encontrados");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        boton_volver.setBackground(new java.awt.Color(15, 75, 94));
        boton_volver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_volver.setText("<- Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        label_titulo_nombre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_nombre.setText("Nombre completo:");
        getContentPane().add(label_titulo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        label_nombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_nombre.setText(" ");
        getContentPane().add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 210, 300, -1));

        label_titulo_dni.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_dni.setText("Número de documento:");
        getContentPane().add(label_titulo_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        label_dni.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_dni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_dni.setText(" ");
        getContentPane().add(label_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 240, 260, -1));

        label_titulo_dosis.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_dosis.setText("Cantidad de dosis:");
        getContentPane().add(label_titulo_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        label_dosis.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_dosis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_dosis.setText(" ");
        getContentPane().add(label_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 270, 290, -1));

        label_titulo_ultima.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_ultima.setText("Última aplicación:");
        getContentPane().add(label_titulo_ultima, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        label_ultima.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_ultima.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_ultima.setText(" ");
        getContentPane().add(label_ultima, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 300, 300, -1));

        label_titulo_vacuna.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_vacuna.setText("Vacuna:");
        getContentPane().add(label_titulo_vacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        label_vacuna.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_vacuna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_vacuna.setText(" ");
        getContentPane().add(label_vacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 330, 350, -1));

        label_titulo_centro.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_centro.setText("Centro de salud:");
        getContentPane().add(label_titulo_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        label_centro.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_centro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_centro.setText(" ");
        getContentPane().add(label_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 360, 310, -1));

        boton_descargar_certificado.setBackground(new java.awt.Color(15, 75, 94));
        boton_descargar_certificado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_descargar_certificado.setForeground(new java.awt.Color(255, 255, 255));
        boton_descargar_certificado.setText("Descargar certificado");
        boton_descargar_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_descargar_certificadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_descargar_certificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 230, 40));

        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        new ObtenerCertificado().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    private void boton_descargar_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_descargar_certificadoActionPerformed
        Document doc = new Document();
        doc.setPageSize(new Rectangle(1664, 1169));

        try {

            String dir = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(dir + "/Desktop/Certificado_" + label_nombre.getText().replaceAll(" ", "-").replace(",", "") + ".pdf"));
            com.itextpdf.text.Image fondo = com.itextpdf.text.Image.getInstance("src/Imagenes/img_fondo_certificado.png");
            fondo.setAbsolutePosition(0, 0);

            Paragraph txt = new Paragraph();

            txt.setAlignment(Paragraph.ALIGN_RIGHT);
            txt.setFont(FontFactory.getFont(FontFactory.COURIER, 40, Font.BOLD, BaseColor.BLACK));
            txt.add("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + ciudadano.getApellido() + ", " + ciudadano.getNombre());
            txt.add("\n\n\n\n\n\n" + ciudadano.getDni());
            txt.add("\n\n\n\n\n\n\n" + cita.getVacuna().getMarca());
            txt.add("\n\n\n\n\n\n\n" + textoDosis(ciudadano.getDosis()));
            txt.add("\n\n\n\n\n\n" + ciudadano.getUltimaDosis().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            txt.add("\n\n\n\n\n\n" + cita.getCentro().getId() + "-" + cita.getCentro().getLocalidad() + "-" + cita.getCentro().getDomicilio());
            txt.add("\n\n\n\n\n\n" + cita.getnSerie() + " ");

            doc.open();
            doc.add(fondo);
            doc.add(txt);
            doc.close();

            JOptionPane.showMessageDialog(null, "Su certificado se ha guardado en el escritorio", "Certificado guardado", 1, Icono.CORRECTO);

        } catch (DocumentException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(DatoCertificado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_descargar_certificadoActionPerformed

    public String textoDosis(int dosis) {
        String texto;

        switch (dosis) {
            case 1:
                return "Primera";
            case 2:
                return "Segunda";
            case 3:
                return "Tercera";
            default:
                return "Refuerzo " + dosis;
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatoCertificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_descargar_certificado;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel label_centro;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_dosis;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo_centro;
    private javax.swing.JLabel label_titulo_dni;
    private javax.swing.JLabel label_titulo_dosis;
    private javax.swing.JLabel label_titulo_nombre;
    private javax.swing.JLabel label_titulo_ultima;
    private javax.swing.JLabel label_titulo_vacuna;
    private javax.swing.JLabel label_ultima;
    private javax.swing.JLabel label_vacuna;
    // End of variables declaration//GEN-END:variables

}
