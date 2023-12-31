package SistemaDeVacunacion.Vistas;

public class Rango_3 extends javax.swing.JFrame {

    public Rango_3() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("RANGO 3");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jbVacunados = new javax.swing.JButton();
        jbEstadisticas1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<- Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 130, 50));

        jbVacunados.setBackground(new java.awt.Color(15, 75, 94));
        jbVacunados.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVacunados.setForeground(new java.awt.Color(255, 255, 255));
        jbVacunados.setText("Registrar Vacunados");
        jbVacunados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVacunadosActionPerformed(evt);
            }
        });
        getContentPane().add(jbVacunados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 230, 50));

        jbEstadisticas1.setBackground(new java.awt.Color(15, 75, 94));
        jbEstadisticas1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbEstadisticas1.setForeground(new java.awt.Color(255, 255, 255));
        jbEstadisticas1.setText("Asignar Citas");
        jbEstadisticas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstadisticas1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbEstadisticas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 230, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbVacunadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVacunadosActionPerformed
        this.dispose();
        new Registrar_vacunados().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jbVacunadosActionPerformed

    private void jbEstadisticas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadisticas1ActionPerformed
        this.dispose();
        new Asignar_Citas().setVisible(true);
    }//GEN-LAST:event_jbEstadisticas1ActionPerformed

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
            java.util.logging.Logger.getLogger(Rango_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rango_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rango_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rango_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rango_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEstadisticas1;
    private javax.swing.JButton jbVacunados;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
