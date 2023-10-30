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
        boton_informacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boton_informacion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(15, 75, 94));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acceder.png"))); // NOI18N
        jButton1.setText("Acceder");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, 40));

        boton_quiero_vacunarme.setBackground(new java.awt.Color(15, 75, 94));
        boton_quiero_vacunarme.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_quiero_vacunarme.setForeground(new java.awt.Color(255, 255, 255));
        boton_quiero_vacunarme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vacuna.png"))); // NOI18N
        boton_quiero_vacunarme.setText("Quiero vacunarme");
        boton_quiero_vacunarme.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_quiero_vacunarme.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        boton_quiero_vacunarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_quiero_vacunarmeActionPerformed(evt);
            }
        });
        getContentPane().add(boton_quiero_vacunarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 240, 60));

        boton_consultar.setBackground(new java.awt.Color(15, 75, 94));
        boton_consultar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_consultar.setForeground(new java.awt.Color(255, 255, 255));
        boton_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        boton_consultar.setText("Consultar turno");
        boton_consultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_consultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        boton_consultar.setIconTextGap(5);
        boton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 240, 60));

        boton_obtener_certificado.setBackground(new java.awt.Color(15, 75, 94));
        boton_obtener_certificado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_obtener_certificado.setForeground(new java.awt.Color(255, 255, 255));
        boton_obtener_certificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Certificado.png"))); // NOI18N
        boton_obtener_certificado.setText("Obtener certificado");
        boton_obtener_certificado.setMaximumSize(new java.awt.Dimension(205, 61));
        boton_obtener_certificado.setMinimumSize(new java.awt.Dimension(205, 61));
        boton_obtener_certificado.setPreferredSize(new java.awt.Dimension(205, 61));
        boton_obtener_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_obtener_certificadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_obtener_certificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 240, 60));

        boton_centros.setBackground(new java.awt.Color(15, 75, 94));
        boton_centros.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_centros.setForeground(new java.awt.Color(255, 255, 255));
        boton_centros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hospi.png"))); // NOI18N
        boton_centros.setText("Centros de salud");
        boton_centros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_centros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        boton_centros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_centrosActionPerformed(evt);
            }
        });
        getContentPane().add(boton_centros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 240, 60));

        boton_informacion.setBackground(new java.awt.Color(15, 75, 94));
        boton_informacion.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_informacion.setForeground(new java.awt.Color(255, 255, 255));
        boton_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informacion.png"))); // NOI18N
        boton_informacion.setText("Más información");
        boton_informacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_informacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        boton_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_informacionActionPerformed(evt);
            }
        });
        getContentPane().add(boton_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        boton_informacion1.setBackground(new java.awt.Color(15, 75, 94));
        boton_informacion1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_informacion1.setForeground(new java.awt.Color(255, 255, 255));
        boton_informacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informacion.png"))); // NOI18N
        boton_informacion1.setText("Más información");
        boton_informacion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_informacion1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        boton_informacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_informacion1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton_informacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_quiero_vacunarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_quiero_vacunarmeActionPerformed
        new SolicitarTurno().setVisible(true);
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

    private void boton_obtener_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_obtener_certificadoActionPerformed
        //dispose();
        new ObtenerCertificado().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_obtener_certificadoActionPerformed

    private void boton_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_informacionActionPerformed
        new Informacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_informacionActionPerformed

    private void boton_informacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_informacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_informacion1ActionPerformed

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
    private javax.swing.JButton boton_centros;
    private javax.swing.JButton boton_consultar;
    private javax.swing.JButton boton_informacion;
    private javax.swing.JButton boton_informacion1;
    private javax.swing.JButton boton_obtener_certificado;
    private javax.swing.JButton boton_quiero_vacunarme;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
