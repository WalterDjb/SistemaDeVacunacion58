package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.AccesoData;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class CambioContra extends javax.swing.JFrame {

    /**
     * Creates new form CambioContra
     */
    public CambioContra() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nueva_contra = new javax.swing.JTextField();
        txt_rep_contra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton_cambiar_contraseña = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setText("Cambio de contraseña");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        txt_nueva_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nueva_contraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nueva_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 199, -1));
        getContentPane().add(txt_rep_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 199, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Contraseña nueva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Reingresar la contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        boton_cambiar_contraseña.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_cambiar_contraseña.setText("Actualizar contraseña");
        boton_cambiar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiar_contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_cambiar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton1.setText("<-  Volver");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Campaña px.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cambiar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiar_contraseñaActionPerformed

        if (txt_nueva_contra.getText().equals("") || txt_rep_contra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Campo incompleto", 0);
        } else if (txt_nueva_contra.getText().length() < 8 || txt_nueva_contra.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 8 y 40 carácteres", "Longitud inválida", 0);
        } else if (!txt_nueva_contra.getText().equals(txt_rep_contra.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales", "Error de contraseña", 0);
        } else {
            AccesoData.modificarContraseñaProvisoria(txt_nueva_contra.getText().trim());
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_boton_cambiar_contraseñaActionPerformed

    private void txt_nueva_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nueva_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nueva_contraActionPerformed

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
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cambiar_contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_nueva_contra;
    private javax.swing.JTextField txt_rep_contra;
    // End of variables declaration//GEN-END:variables
}
