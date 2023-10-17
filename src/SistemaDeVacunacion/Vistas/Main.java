package SistemaDeVacunacion.Vistas;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Walter Benítez
 */
public class Main extends javax.swing.JFrame {

    /** Creates new form Main */
    public Main() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN");
    }

    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
    return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        boton_quiero_vacunarme = new javax.swing.JButton();
        boton_consultar = new javax.swing.JButton();
        boton_obtener_certificado = new javax.swing.JButton();
        boton_centros = new javax.swing.JButton();
        boton_cancelar_turno = new javax.swing.JButton();
        boton_informacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(15, 75, 94));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Acceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, 40));

        boton_quiero_vacunarme.setBackground(new java.awt.Color(15, 75, 94));
        boton_quiero_vacunarme.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_quiero_vacunarme.setForeground(new java.awt.Color(255, 255, 255));
        boton_quiero_vacunarme.setText("Quiero vacunarme");
        boton_quiero_vacunarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_quiero_vacunarmeActionPerformed(evt);
            }
        });
        getContentPane().add(boton_quiero_vacunarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 50));

        boton_consultar.setBackground(new java.awt.Color(15, 75, 94));
        boton_consultar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_consultar.setForeground(new java.awt.Color(255, 255, 255));
        boton_consultar.setText("Consultar turno");
        boton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 50));

        boton_obtener_certificado.setBackground(new java.awt.Color(15, 75, 94));
        boton_obtener_certificado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_obtener_certificado.setForeground(new java.awt.Color(255, 255, 255));
        boton_obtener_certificado.setText("Obtener certificado");
        boton_obtener_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_obtener_certificadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_obtener_certificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 200, 50));

        boton_centros.setBackground(new java.awt.Color(15, 75, 94));
        boton_centros.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_centros.setForeground(new java.awt.Color(255, 255, 255));
        boton_centros.setText("Centros de salud");
        boton_centros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_centrosActionPerformed(evt);
            }
        });
        getContentPane().add(boton_centros, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 190, 50));

        boton_cancelar_turno.setBackground(new java.awt.Color(15, 75, 94));
        boton_cancelar_turno.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_cancelar_turno.setForeground(new java.awt.Color(255, 255, 255));
        boton_cancelar_turno.setText("Cancelar turno");
        boton_cancelar_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelar_turnoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_cancelar_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 190, 50));

        boton_informacion.setBackground(new java.awt.Color(15, 75, 94));
        boton_informacion.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_informacion.setForeground(new java.awt.Color(255, 255, 255));
        boton_informacion.setText("Más información");
        boton_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_informacionActionPerformed(evt);
            }
        });
        getContentPane().add(boton_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_quiero_vacunarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_quiero_vacunarmeActionPerformed
        new QuieroVacunarme().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_quiero_vacunarmeActionPerformed

    private void boton_centrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_centrosActionPerformed
        new CentrosHabilitados().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_centrosActionPerformed

    private void boton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultarActionPerformed
        new ConsultarTurno().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_consultarActionPerformed

    private void boton_cancelar_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelar_turnoActionPerformed
        new CancelarTurno().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_cancelar_turnoActionPerformed

    private void boton_obtener_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_obtener_certificadoActionPerformed
        //dispose();
        new ObtenerCertificado().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_obtener_certificadoActionPerformed

    private void boton_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_informacionActionPerformed
        new Informacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_informacionActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar_turno;
    private javax.swing.JButton boton_centros;
    private javax.swing.JButton boton_consultar;
    private javax.swing.JButton boton_informacion;
    private javax.swing.JButton boton_obtener_certificado;
    private javax.swing.JButton boton_quiero_vacunarme;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
