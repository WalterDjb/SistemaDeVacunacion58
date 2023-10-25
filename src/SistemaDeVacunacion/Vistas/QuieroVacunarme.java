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
        jtEmail = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCaracCelular = new javax.swing.JTextField();
        jtPatologia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtNombre1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtCelular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtLocalidad = new javax.swing.JTextField();
        jbInscribir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbProvincia = new javax.swing.JComboBox<>();
        jcbAMbito = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(label_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

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
        getContentPane().add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, -1));

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
        getContentPane().add(txt_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, -1));

        label_tramite.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_tramite.setText("Número de trámite:");
        getContentPane().add(label_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("QUIERO VACUNARME");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 30));

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 131, -1));

        jtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDomicilioActionPerformed(evt);
            }
        });
        getContentPane().add(jtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 131, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel9.setText("Localidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jtCaracCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCaracCelularActionPerformed(evt);
            }
        });
        jtCaracCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCaracCelularKeyTyped(evt);
            }
        });
        getContentPane().add(jtCaracCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 60, -1));

        jtPatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPatologiaActionPerformed(evt);
            }
        });
        jtPatologia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPatologiaKeyTyped(evt);
            }
        });
        getContentPane().add(jtPatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 131, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setText("Patología base:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 20));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setText("Domicilio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setText("Nombre:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        jtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombre1ActionPerformed(evt);
            }
        });
        jtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombre1KeyTyped(evt);
            }
        });
        getContentPane().add(jtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setText("Email:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCelularActionPerformed(evt);
            }
        });
        jtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCelularKeyTyped(evt);
            }
        });
        getContentPane().add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 131, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setText("Provincia:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setText("Ámbito de trabajo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        jtLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLocalidadActionPerformed(evt);
            }
        });
        jtLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtLocalidadKeyTyped(evt);
            }
        });
        getContentPane().add(jtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 140, -1));

        jbInscribir.setBackground(new java.awt.Color(15, 75, 94));
        jbInscribir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 130, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jcbProvincia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Ciudad Autónoma Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        getContentPane().add(jcbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, -1));

        jcbAMbito.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbAMbito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salud", "Educacion", "Comercio", "Seguridad", "Justicia", "Otros" }));
        getContentPane().add(jcbAMbito, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void txt_tramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tramiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tramiteActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDomicilioActionPerformed

    private void jtPatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPatologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPatologiaActionPerformed

    private void jtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre1ActionPerformed

    private void jtCaracCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCaracCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCaracCelularActionPerformed

    private void jtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCelularActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLocalidadActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jtCaracCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCaracCelularKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
        if (jtCaracCelular.getText().length()>=4){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCaracCelularKeyTyped

    private void jtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCelularKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }   
        if (jtCelular.getText().length()>=10){
            evt.consume();
        }
      
    }//GEN-LAST:event_jtCelularKeyTyped

    private void txt_docKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_docKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
        if (txt_doc.getText().length()>=8){
            evt.consume();
        }
        
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
    }//GEN-LAST:event_txt_tramiteKeyTyped

    private void jtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombre1KeyTyped
        
        int key = evt.getKeyChar();
        boolean mayusculas = key>=65 && key<=90;
        boolean minusculas = key>=97 && key <=122;
        
        if(!(minusculas || mayusculas )){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre1KeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key>=65 && key<=90;
        boolean minusculas = key>=97 && key <=122;
        
        if(!(minusculas || mayusculas )){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLocalidadKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key>=65 && key<=90;
        boolean minusculas = key>=97 && key <=122;
        
        if(!(minusculas || mayusculas )){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtLocalidadKeyTyped

    private void jtPatologiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPatologiaKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key>=65 && key<=90;
        boolean minusculas = key>=97 && key <=122;
        
        if(!(minusculas || mayusculas )){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtPatologiaKeyTyped

    private void txt_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbAMbito;
    private javax.swing.JComboBox<String> jcbProvincia;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCaracCelular;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtLocalidad;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtPatologia;
    private javax.swing.JLabel label_doc;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_tramite;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_tramite;
    // End of variables declaration//GEN-END:variables

}
