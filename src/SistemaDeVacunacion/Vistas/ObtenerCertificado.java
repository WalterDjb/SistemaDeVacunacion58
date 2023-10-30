package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CiudadanoData;
import SistemaDeVacunacion.Entidades.Icono;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class ObtenerCertificado extends javax.swing.JFrame {
    
    public static int dni;
    public static InfoNumTramite tram = null;

    /**
     * Creates new form Main
     */
    public ObtenerCertificado() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Obtener certificado");
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
        label_doc = new javax.swing.JLabel();
        txt_doc = new javax.swing.JTextField();
        label_tramite = new javax.swing.JLabel();
        txt_tramite = new javax.swing.JTextField();
        boton_obtener_tramite = new javax.swing.JButton();
        boton_ver_certificado = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("OBTENER CERTIFICADO");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 30));

        label_doc.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_doc.setText("Número de documento:");
        getContentPane().add(label_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        txt_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docActionPerformed(evt);
            }
        });
        txt_doc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_docKeyTyped(evt);
            }
        });
        getContentPane().add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 250, -1));

        label_tramite.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_tramite.setText("Número de trámite:");
        getContentPane().add(label_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        txt_tramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tramiteActionPerformed(evt);
            }
        });
        txt_tramite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tramiteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 250, -1));

        boton_obtener_tramite.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_obtener_tramite.setForeground(new java.awt.Color(0, 51, 255));
        boton_obtener_tramite.setText("¿Cómo obtengo mi número de trámite?");
        boton_obtener_tramite.setBorderPainted(false);
        boton_obtener_tramite.setContentAreaFilled(false);
        boton_obtener_tramite.setDefaultCapable(false);
        boton_obtener_tramite.setFocusPainted(false);
        boton_obtener_tramite.setFocusable(false);
        boton_obtener_tramite.setRequestFocusEnabled(false);
        boton_obtener_tramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_obtener_tramiteActionPerformed(evt);
            }
        });
        getContentPane().add(boton_obtener_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        boton_ver_certificado.setBackground(new java.awt.Color(15, 75, 94));
        boton_ver_certificado.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_ver_certificado.setForeground(new java.awt.Color(255, 255, 255));
        boton_ver_certificado.setText("Ver certificado");
        boton_ver_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ver_certificadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_ver_certificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 40));

        boton_volver.setBackground(new java.awt.Color(15, 75, 94));
        boton_volver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_volver.setText("<- Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("DE VACUNACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 145, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    private void txt_tramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tramiteActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tramiteActionPerformed

    private void boton_ver_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ver_certificadoActionPerformed
        if (txt_doc.getText().trim().equals("") || txt_tramite.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos", "Falta de datos", 0);
        } else if ((txt_doc.getText().trim().length() < 7 || txt_doc.getText().trim().length() > 8) && txt_tramite.getText().trim().length() != 14) {
            JOptionPane.showMessageDialog(null, "Número de documento y de trámite inválidos", "Datos incorrectos", 0);
            txt_doc.setText("");
            txt_tramite.setText("");
        } else if (txt_doc.getText().trim().length() < 7 || txt_doc.getText().trim().length() > 8) {
            JOptionPane.showMessageDialog(null, "Número de documento inválido", "Documento incorrecto", 0);
            txt_doc.setText("");
            txt_tramite.setText("");
        } else if (txt_tramite.getText().trim().length() != 11) {
            JOptionPane.showMessageDialog(null, "Número de trámite inválido", "Trámite incorrecto", 0);
            txt_tramite.setText("");
        } else {
            dni = 0;
            String tramite;

            try {
                dni = Integer.parseInt(txt_doc.getText().trim());
                Long.valueOf(txt_tramite.getText().trim()); // Esto no lo guardo en una variable porque solo me va a servir para saber si realmente fueron numeros los datos ingresados en txt_tramite, para el tramite necesito un String.
                tramite = txt_tramite.getText().trim();         // y acá si guardo el tramite como String, necesario porque los numeros de tramite arrancan en 0 y si fueron un numero entero ese cero se perdería.
                
                if(CiudadanoData.dniTramiteEncontrados(dni, tramite) == 1){
                    new DatoCertificado().setVisible(true);
                    dispose();
                } else if(CiudadanoData.dniTramiteEncontrados(dni, tramite) == 2){
                    JOptionPane.showMessageDialog(null, "Por el momento no tiene ningún certificado disponible", "No encontrado", 1);
                    txt_doc.setText("");
                    txt_tramite.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con los datos proporcionados", "Registro inexistente", 1);
                }
                
            } catch (NumberFormatException e) {

                if (dni == 0) {
                    JOptionPane.showMessageDialog(null, "El número de documento contiene carácteres inválidos", "Error de formato", 0, Icono.ERROR);
                    txt_doc.setText("");
                    txt_tramite.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El número de trámite contiene carácteres inválidos", "Error de formato", 0, Icono.ERROR);
                    txt_tramite.setText("");
                }
            }
        }
    }//GEN-LAST:event_boton_ver_certificadoActionPerformed

    private void txt_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docActionPerformed

    private void txt_docKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_docKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
        if (txt_doc.getText().length()>=8){
            evt.consume();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_txt_docKeyTyped

    private void txt_tramiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tramiteKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
        if (txt_tramite.getText().length()>=11){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tramiteKeyTyped

    private void boton_obtener_tramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_obtener_tramiteActionPerformed
        if(tram == null){
            tram = new InfoNumTramite();
            tram.setVisible(true);
        }
    }//GEN-LAST:event_boton_obtener_tramiteActionPerformed

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
            java.util.logging.Logger.getLogger(ObtenerCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObtenerCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObtenerCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObtenerCertificado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObtenerCertificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_obtener_tramite;
    private javax.swing.JButton boton_ver_certificado;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_doc;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_tramite;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_tramite;
    // End of variables declaration//GEN-END:variables

}
