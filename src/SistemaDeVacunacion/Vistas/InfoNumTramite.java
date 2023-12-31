package SistemaDeVacunacion.Vistas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Walter Benítez
 */
public class InfoNumTramite extends javax.swing.JFrame {

    /**
     * Creates new form InfoNumTramite
     */
    public InfoNumTramite() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        repaint();
        setLocationRelativeTo(null);
        setResizable(false);
        
        label_info.setText(
                
                "<html><ul>\n<li style=\"text-align: left; color: rgb(41, 105, 176); font-size: 11px; font-family: Helvetica;\">El n&uacute;mero de tr&aacute;mite se encuentra al frente del documento, en la secci&oacute;n inferior al centro.</li>\n"
                + "<li style=\"text-align: left; color: rgb(41, 105, 176); font-size: 11px; font-family: Helvetica;\">Es una serie de n&uacute;meros de 11 d&iacute;gitos.</li>\n"
                + "</ul>\n<p><br></p>\n<p><span style=\"font-family: Helvetica; font-size: 11px; color: rgb(41, 105, 176);\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;A continuaci&oacute;n le indicamos de manera gr&aacute;fica su ubicaci&oacute;n:</span></p></html>"
        );

        ImageIcon imagen_dni = new ImageIcon("src/Imagenes/dni_id.png");
        Icon icono_dni = new ImageIcon(imagen_dni.getImage().getScaledInstance(label_imagen_dni.getWidth(), label_imagen_dni.getHeight(), Image.SCALE_DEFAULT));
        label_imagen_dni.setIcon(icono_dni);
        
        ImageIcon imagen_label_fondo = new ImageIcon("src/Imagenes/img_fondo_tramite.png");
        Icon icono_label_fondo = new ImageIcon(imagen_label_fondo.getImage().getScaledInstance(label_fondo.getWidth(), label_fondo.getHeight(), Image.SCALE_DEFAULT));
        label_fondo.setIcon(icono_label_fondo);
        
        repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_aceptar = new javax.swing.JButton();
        label_info = new javax.swing.JLabel();
        label_imagen_dni = new javax.swing.JLabel();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(530, 530));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(530, 530));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_aceptar.setText("ACEPTAR");
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 478, -1, -1));

        label_info.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        label_info.setText("      ");
        getContentPane().add(label_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, -1));
        getContentPane().add(label_imagen_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 369, 234));
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        ObtenerCertificado.tram = null;
        dispose();
    }//GEN-LAST:event_boton_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoNumTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoNumTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoNumTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoNumTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoNumTramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_imagen_dni;
    private javax.swing.JLabel label_info;
    // End of variables declaration//GEN-END:variables
}
