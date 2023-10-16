package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.prefs.Preferences;

public class Login extends javax.swing.JFrame {

    public static String user;
    public static String pass;
    private Preferences p = Preferences.userNodeForPackage(this.getClass());

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);

        if (p.get("user", null) != null) {
            txt_user.setText(p.get("user", null));
            check_recordar_user.setSelected(true);
            txt_user.setBackground(Color.lightGray);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        check_recordar_user = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("BIENVENIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 199, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 150, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        check_recordar_user.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        check_recordar_user.setText("Recordar usuario");
        check_recordar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_recordar_userActionPerformed(evt);
            }
        });
        getContentPane().add(check_recordar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 2, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Olvidé mi contraseña");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jButton3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton3.setText("<-  Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 40));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 199, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();

        if (!user.equals("") && !pass.equals("")) {
            try {
                Connection cn = Conexion.getConexion();
                PreparedStatement pst = cn.prepareStatement("select nivel, tipoContra from acceso where usuario = '" + user + "' and contra = '" + pass + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    Integer nivel = rs.getInt("nivel");
                    String tipoContra = rs.getString("tipoContra");

                    if (check_recordar_user.isSelected()) {
                        p.put("user", user);
                    } else {
                        p.remove("user");
                    }

                    if (tipoContra.equals("A")) {
                        switch (nivel) {
                            case 1:
                                new Rango_1().setVisible(true);
                                dispose();
                                break;
                            case 2:
                                new Rango_2().setVisible(true);
                                dispose();
                                break;
                            case 3:
                                new Rango_3().setVisible(true);
                                dispose();
                                break;
                            default:
                                break;
                        }
                    } else {
                        new CambioContra().setVisible(true);
                        dispose();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos", "Error de credenciales", 0);

                    if (p.get("user", null) != null) {
                        txt_password.setText("");
                    } else {
                        txt_user.setText("");
                        txt_password.setText("");
                    }

                }
            } catch (SQLException e) {
                System.err.println("Error en el botón ACCEDER " + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión contacte al administrador", "Error de inicio", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe copletar todos los campos", "Error", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void check_recordar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_recordar_userActionPerformed
        if (!check_recordar_user.isSelected()) {
            txt_user.setBackground(Color.white);
        }
    }//GEN-LAST:event_check_recordar_userActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Recovery().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_recordar_user;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
