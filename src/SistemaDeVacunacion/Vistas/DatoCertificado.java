package SistemaDeVacunacion.Vistas;


import SistemaDeVacunacion.Conexiones.CiudadanoData;
import java.awt.Image;
import java.awt.Toolkit;
import SistemaDeVacunacion.Entidades.Ciudadano;

/**
 *
 * @author Walter Benítez
 */
public class DatoCertificado extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public DatoCertificado() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Resultado de búsqueda");
        
        Ciudadano ciudadano = CiudadanoData.buscarPorDni(35681886);
        label_dni.setText(String.valueOf(ciudadano.getDni()));
        label_nombre.setText(ciudadano.getNombre());
        label_dosis.setText(String.valueOf(ciudadano.getDosis()));
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        boton_volver = new javax.swing.JButton();
        label_titulo_nombre = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_titulo_dni = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_titulo_dosis = new javax.swing.JLabel();
        label_dosis = new javax.swing.JLabel();
        label_titulo_ultima = new javax.swing.JLabel();
        label_ultima = new javax.swing.JLabel();
        label_titulo_vacuna = new javax.swing.JLabel();
        label_vacuna = new javax.swing.JLabel();
        label_titulo_centro = new javax.swing.JLabel();
        label_centro = new javax.swing.JLabel();
        boton_descargar_certificado = new javax.swing.JButton();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setText("Datos encontrados");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        boton_volver.setBackground(new java.awt.Color(15, 75, 94));
        boton_volver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_volver.setText("<- Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        label_titulo_nombre.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_nombre.setText("Nombre completo:");
        getContentPane().add(label_titulo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_nombre.setText(" ");
        getContentPane().add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 210, 260, -1));

        label_titulo_dni.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_dni.setText("Número de documento:");
        getContentPane().add(label_titulo_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        label_dni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_dni.setText(" ");
        getContentPane().add(label_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 240, 220, -1));

        label_titulo_dosis.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_dosis.setText("Cantidad de dosis:");
        getContentPane().add(label_titulo_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        label_dosis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_dosis.setText(" ");
        getContentPane().add(label_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 270, 250, -1));

        label_titulo_ultima.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_ultima.setText("Última aplicación:");
        getContentPane().add(label_titulo_ultima, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        label_ultima.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_ultima.setText(" ");
        getContentPane().add(label_ultima, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 300, 260, -1));

        label_titulo_vacuna.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_vacuna.setText("Vacuna:");
        getContentPane().add(label_titulo_vacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        label_vacuna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_vacuna.setText(" ");
        getContentPane().add(label_vacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 330, 310, -1));

        label_titulo_centro.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_titulo_centro.setText("Centro de salud:");
        getContentPane().add(label_titulo_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        label_centro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_centro.setText(" ");
        getContentPane().add(label_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 360, 270, -1));

        boton_descargar_certificado.setBackground(new java.awt.Color(15, 75, 94));
        boton_descargar_certificado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_descargar_certificado.setForeground(new java.awt.Color(255, 255, 255));
        boton_descargar_certificado.setText("Descargar certificado");
        boton_descargar_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_descargar_certificadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_descargar_certificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 230, 40));

        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        new ObtenerCertificado().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    private void boton_descargar_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_descargar_certificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_descargar_certificadoActionPerformed

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
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatoCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatoCertificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_descargar_certificado;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel label_centro;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_dosis;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo_centro;
    private javax.swing.JLabel label_titulo_dni;
    private javax.swing.JLabel label_titulo_dosis;
    private javax.swing.JLabel label_titulo_nombre;
    private javax.swing.JLabel label_titulo_ultima;
    private javax.swing.JLabel label_titulo_vacuna;
    private javax.swing.JLabel label_ultima;
    private javax.swing.JLabel label_vacuna;
    // End of variables declaration//GEN-END:variables

}
