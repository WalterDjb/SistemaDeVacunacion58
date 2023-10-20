package SistemaDeVacunacion.Vistas;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Walter Benítez
 */
public class QuieroVacunarme extends javax.swing.JFrame {

    /** Creates new form Main */
    public QuieroVacunarme() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Quiero vacunarme");
    }

    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
    return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVolver = new javax.swing.JButton();
        label_doc = new javax.swing.JLabel();
        txt_doc = new javax.swing.JTextField();
        txt_tramite = new javax.swing.JTextField();
        label_tramite = new javax.swing.JLabel();
        label_titulo = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCaracCelular = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtAmbito = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtNombre1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtEmail1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtEmail2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtAmbito1 = new javax.swing.JTextField();
        jtAmbito2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, 40));

        label_doc.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_doc.setText("Número de documento:");
        getContentPane().add(label_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));
        getContentPane().add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 250, -1));

        txt_tramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tramiteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 250, -1));

        label_tramite.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_tramite.setText("Número de trámite:");
        getContentPane().add(label_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("QUIERO VACUNARME");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 30));

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 131, -1));

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 131, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel9.setText("Localidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jtCaracCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCaracCelularActionPerformed(evt);
            }
        });
        getContentPane().add(jtCaracCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 60, -1));

        jtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCelularActionPerformed(evt);
            }
        });
        getContentPane().add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 131, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setText("Patología base:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setText("Domicilio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jtAmbito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAmbitoActionPerformed(evt);
            }
        });
        getContentPane().add(jtAmbito, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 131, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setText("Apellido");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 20));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setText("Nombre");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, 20));

        jtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 131, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setText("Email:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 131, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setText("Provincia");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jtEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmail2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 131, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setText("Ámbito de trabajo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jtAmbito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAmbito1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtAmbito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 131, -1));

        jtAmbito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAmbito2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtAmbito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 131, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void txt_tramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tramiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tramiteActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCelularActionPerformed

    private void jtAmbitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAmbitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAmbitoActionPerformed

    private void jtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre1ActionPerformed

    private void jtCaracCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCaracCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCaracCelularActionPerformed

    private void jtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmail1ActionPerformed

    private void jtEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmail2ActionPerformed

    private void jtAmbito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAmbito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAmbito1ActionPerformed

    private void jtAmbito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAmbito2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAmbito2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuieroVacunarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuieroVacunarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuieroVacunarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuieroVacunarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuieroVacunarme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtAmbito;
    private javax.swing.JTextField jtAmbito1;
    private javax.swing.JTextField jtAmbito2;
    private javax.swing.JTextField jtCaracCelular;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEmail1;
    private javax.swing.JTextField jtEmail2;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JLabel label_doc;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_tramite;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_tramite;
    // End of variables declaration//GEN-END:variables

}
