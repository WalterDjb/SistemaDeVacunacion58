package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CiudadanoData;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class DatoCertificado extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public DatoCertificado() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Obtener certificado");
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
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(0, 0, 0));
        label_titulo.setText("Datos encontrados");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        boton_volver.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_volver.setText("<");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        new ObtenerCertificado().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatoCertificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables

}
