
package SistemaDeVacunacion.Vistas;
import SistemaDeVacunacion.Conexiones.CitaData;
/**
 *
 * @author totip
 */
public class EstadisticasListado extends javax.swing.JFrame {

   private CitaData ciData; 
   
   
    public EstadisticasListado() {
        initComponents();
        ciData = new CitaData();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVolver = new javax.swing.JButton();
        jbLista_Mensual = new javax.swing.JButton();
        jbLista_Diaria = new javax.swing.JButton();
        jbLista_Centro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 45, 114, 41));

        jbLista_Mensual.setBackground(new java.awt.Color(15, 75, 94));
        jbLista_Mensual.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbLista_Mensual.setForeground(new java.awt.Color(255, 255, 255));
        jbLista_Mensual.setText("Listado mensual de citas");
        jbLista_Mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLista_MensualActionPerformed(evt);
            }
        });
        getContentPane().add(jbLista_Mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 311, 40));

        jbLista_Diaria.setBackground(new java.awt.Color(15, 75, 94));
        jbLista_Diaria.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbLista_Diaria.setForeground(new java.awt.Color(255, 255, 255));
        jbLista_Diaria.setText("Vacunados por Centro");
        jbLista_Diaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLista_DiariaActionPerformed(evt);
            }
        });
        getContentPane().add(jbLista_Diaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 41));

        jbLista_Centro.setBackground(new java.awt.Color(15, 75, 94));
        jbLista_Centro.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbLista_Centro.setForeground(new java.awt.Color(255, 255, 255));
        jbLista_Centro.setText("Vacunas aplicadas por Centro");
        jbLista_Centro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLista_CentroActionPerformed(evt);
            }
        });
        getContentPane().add(jbLista_Centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 311, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new Rango_2().setVisible(true);     
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbLista_MensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLista_MensualActionPerformed
        this.dispose();
        new ListCitasMensual().setVisible(true);
        ciData.actualizarCitasVencidas();        

    }//GEN-LAST:event_jbLista_MensualActionPerformed

    private void jbLista_DiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLista_DiariaActionPerformed
        this.dispose();
        new ListCentroEspecifico().setVisible(true);   
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLista_DiariaActionPerformed

    private void jbLista_CentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLista_CentroActionPerformed
        this.dispose();
        new ListCentroDiario().setVisible(true);        
    }//GEN-LAST:event_jbLista_CentroActionPerformed

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
            java.util.logging.Logger.getLogger(EstadisticasListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticasListado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbLista_Centro;
    private javax.swing.JButton jbLista_Diaria;
    private javax.swing.JButton jbLista_Mensual;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
