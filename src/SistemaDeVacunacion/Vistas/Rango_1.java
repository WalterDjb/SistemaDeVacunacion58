/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeVacunacion.Vistas;

/**
 *
 * @author Walter Benítez
 */
public class Rango_1 extends javax.swing.JFrame {

    /**
     * Creates new form Rango_1
     */
    public Rango_1() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("RANGO 1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBlabs = new javax.swing.JButton();
        JBvax = new javax.swing.JButton();
        JBusers = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBlabs.setBackground(new java.awt.Color(15, 75, 94));
        JBlabs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBlabs.setForeground(new java.awt.Color(255, 255, 255));
        JBlabs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lab.png"))); // NOI18N
        JBlabs.setText("Administrar Laboratorios");
        JBlabs.setPreferredSize(new java.awt.Dimension(250, 40));
        JBlabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlabsActionPerformed(evt);
            }
        });
        getContentPane().add(JBlabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, 60));

        JBvax.setBackground(new java.awt.Color(15, 75, 94));
        JBvax.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBvax.setForeground(new java.awt.Color(255, 255, 255));
        JBvax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacuna.png"))); // NOI18N
        JBvax.setText("Administrar Vacunas");
        JBvax.setPreferredSize(new java.awt.Dimension(250, 40));
        JBvax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvaxActionPerformed(evt);
            }
        });
        getContentPane().add(JBvax, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 280, 60));

        JBusers.setBackground(new java.awt.Color(15, 75, 94));
        JBusers.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBusers.setForeground(new java.awt.Color(255, 255, 255));
        JBusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.png"))); // NOI18N
        JBusers.setText("Administrar usuarios");
        JBusers.setPreferredSize(new java.awt.Dimension(250, 40));
        JBusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBusersActionPerformed(evt);
            }
        });
        getContentPane().add(JBusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 280, 60));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBlabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlabsActionPerformed
        this.dispose();
        new Laboratorios().setVisible(true);
        
    }//GEN-LAST:event_JBlabsActionPerformed

    private void JBvaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvaxActionPerformed
        this.dispose();
        new Vacunas().setVisible(true);
    }//GEN-LAST:event_JBvaxActionPerformed

    private void JBusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBusersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBusersActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Rango_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rango_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rango_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rango_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rango_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBlabs;
    private javax.swing.JButton JBusers;
    private javax.swing.JButton JBvax;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
