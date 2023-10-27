package SistemaDeVacunacion.Vistas;

/**
 *
 * @author Walter Benítez
 */
public class Rango_2 extends javax.swing.JFrame {

    /**
     * Creates new form Rango_2
     */
    public Rango_2() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("RANGO 2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCentros = new javax.swing.JButton();
        jbAsignarVacunas = new javax.swing.JButton();
        jbEstadisticas = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCentros.setBackground(new java.awt.Color(15, 75, 94));
        jbCentros.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbCentros.setForeground(new java.awt.Color(255, 255, 255));
        jbCentros.setText("Centros de vacunacion");
        jbCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCentrosActionPerformed(evt);
            }
        });
        getContentPane().add(jbCentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 230, 50));

        jbAsignarVacunas.setBackground(new java.awt.Color(15, 75, 94));
        jbAsignarVacunas.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbAsignarVacunas.setForeground(new java.awt.Color(255, 255, 255));
        jbAsignarVacunas.setText("Asignar Vacunas");
        jbAsignarVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignarVacunasActionPerformed(evt);
            }
        });
        getContentPane().add(jbAsignarVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 230, 50));

        jbEstadisticas.setBackground(new java.awt.Color(15, 75, 94));
        jbEstadisticas.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        jbEstadisticas.setText("Estadisticas");
        jbEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(jbEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 230, 50));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<- Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 130, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCentrosActionPerformed
        this.dispose();
        new CrearCentro().setVisible(true);
    }//GEN-LAST:event_jbCentrosActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbAsignarVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignarVacunasActionPerformed
        this.dispose();
        new AsignarVacunasACentro().setVisible(true);
    }//GEN-LAST:event_jbAsignarVacunasActionPerformed

    private void jbEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstadisticasActionPerformed
        this.dispose();
        new EstadisticasListado().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jbEstadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(Rango_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rango_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rango_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rango_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rango_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jbAsignarVacunas;
    private javax.swing.JButton jbCentros;
    private javax.swing.JButton jbEstadisticas;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
