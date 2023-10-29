package SistemaDeVacunacion.Vistas;
import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Conexiones.CiudadanoData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Cita;
import SistemaDeVacunacion.Entidades.Ciudadano;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class QuieroVacunarme extends javax.swing.JFrame {
    CentroData ced = new CentroData();
    CiudadanoData cid = new CiudadanoData();
    CitaData citad = new CitaData();
    
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
        jtDoc = new javax.swing.JTextField();
        jtTramite = new javax.swing.JTextField();
        label_tramite = new javax.swing.JLabel();
        label_titulo = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jtMail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCaracCelular = new javax.swing.JTextField();
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
        jcbPatologia = new javax.swing.JComboBox<>();
        jcbAMbito1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JCcentros = new javax.swing.JComboBox<>();
        jbInfo = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

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

        jtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocActionPerformed(evt);
            }
        });
        jtDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDocKeyTyped(evt);
            }
        });
        getContentPane().add(jtDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, -1));

        jtTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTramiteActionPerformed(evt);
            }
        });
        jtTramite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTramiteKeyTyped(evt);
            }
        });
        getContentPane().add(jtTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 170, -1));

        label_tramite.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        label_tramite.setText("Número de trámite:");
        getContentPane().add(label_tramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("QUIERO VACUNARME");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 30));

        jtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDomicilioActionPerformed(evt);
            }
        });
        getContentPane().add(jtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 170, 240, -1));

        jtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMailActionPerformed(evt);
            }
        });
        getContentPane().add(jtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 240, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel9.setText("Localidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

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
        getContentPane().add(jtCaracCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 70, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setText("Patología base:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, 20));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setText("Domicilio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

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
        getContentPane().add(jtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 270, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setText("Email:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

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
        getContentPane().add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 160, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setText("Provincia:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

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
        getContentPane().add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 270, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setText("Ámbito de trabajo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

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
        getContentPane().add(jtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 270, -1));

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
        jcbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        jcbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProvinciaActionPerformed(evt);
            }
        });
        getContentPane().add(jcbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 270, -1));

        jcbPatologia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbPatologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Cáncer.", "Diabetes.", "Enf. autoinmunitarias.", "Enf. cardíacas.", "Enf. crónicas del sistema digestivo.", "Enf.s hepáticas.", "Enf. hematológicas.", "Enf. metabólicas hereditarias.", "Enf. neurológicas.", "Enf. pulmonares crónicas.", "Enf. renales crónicas.", "Enf. autoinmunitarias.", "Inmunodeficiencias primarias.", "Obesidad." }));
        getContentPane().add(jcbPatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 180, -1));

        jcbAMbito1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbAMbito1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otros", "Salud", "Educacion", "Comercio", "Seguridad", "Justicia", " " }));
        getContentPane().add(jcbAMbito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 160, -1));

        jLabel3.setText("Centros:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        JCcentros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione un Centro>" }));
        getContentPane().add(JCcentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 200, 30));

        jbInfo.setText("i");
        jbInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInfoActionPerformed(evt);
            }
        });
        getContentPane().add(jbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 40, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTramiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTramiteActionPerformed

    private void jtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDomicilioActionPerformed

    private void jtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMailActionPerformed

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
  CiudadanoData cid = new CiudadanoData();
  Ciudadano ciudadano = new Ciudadano();
try {
    int dni = Integer.parseInt(jtDoc.getText());
    ciudadano = cid.buscarPorDni(dni);
    
    
    if (jtApellido.getText().isEmpty() || jtNombre1.getText().isEmpty() || jtDomicilio.getText().isEmpty()|| jtLocalidad.getText().isEmpty()|| jtDoc.getText().isEmpty()|| jtTramite.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.");
        return;
    } else if 
        (ciudadano != null){
        citad.crearCitaPorDniYId (dni, (Integer.parseInt(String.valueOf(JCcentros.getSelectedItem()).substring(0,2))));
    } else {
    ciudadano = new Ciudadano();
    ciudadano.setDni(dni);
    ciudadano.setNombre(jtNombre1.getText());
    ciudadano.setApellido(jtApellido.getText());
    ciudadano.setProvincia(jcbProvincia.getSelectedItem().toString());
    ciudadano.setLocalidad(jtLocalidad.getText());
    ciudadano.setEmail(jtMail.getText());
    ciudadano.setCelular(Long.parseLong(jtCaracCelular.getText() + jtCelular.getText()));
    ciudadano.setPatologia(jcbPatologia.getSelectedItem().toString());
    ciudadano.setAmbito(jcbAMbito1.getSelectedItem().toString());
    ciudadano.setDomicilio(jtDomicilio.getText());
    ciudadano.setNumTramite(Long.parseLong(jtTramite.getText()));
    cid.guardarCiudadano(ciudadano);
    citad.cargarCitasPorCentroYDni(dni, (Integer.parseInt(String.valueOf(JCcentros.getSelectedItem()).substring(0,2))));
    }

} catch (NumberFormatException nfe) {
    //JOptionPane.showMessageDialog(null, "El DNI debe ser un valor numérico.");
} catch (NullPointerException npe) {
    JOptionPane.showMessageDialog(null, "Error al guardar o modificar el ciudadano.");
    System.err.println("ERROR: "+npe.getMessage());
}

//JOptionPane.showMessageDialog(null, "Inscripto Correctamente, en unos dias nos comunicaremos para informarle fecha y lugar de vacunacion");
//Limpiar();  
          
        
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
        if (jtCelular.getText().length()>=8){
            evt.consume();
        }
      
    }//GEN-LAST:event_jtCelularKeyTyped

    private void jtDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocKeyTyped
       char key = evt.getKeyChar();
       boolean numeros = (key >= '0' && key <= '9');

       if (!numeros || jtDoc.getText().length() >= 8) {
        evt.consume();
}
        
    }//GEN-LAST:event_jtDocKeyTyped

    private void jtTramiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTramiteKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }    
        if (jtTramite.getText().length()>=11){
            evt.consume();
        }
    }//GEN-LAST:event_jtTramiteKeyTyped

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
        
    }//GEN-LAST:event_jtLocalidadKeyTyped

    private void jtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocActionPerformed

    private void jbInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInfoActionPerformed
        String Scen = String.valueOf(JCcentros.getSelectedItem()).substring(0,2);
        int id = Integer.parseInt(Scen);
        Centro cen = ced.buscarCentroXId(id);
        JOptionPane.showMessageDialog(null, "DATOS DEL CENTRO\nProvincia: "+cen.getProvincia()+".\nLocalidad: "+cen.getLocalidad()+".\nDireccion: "+cen.getDomicilio()+".\nCapacidad: "+cen.getCapacidad()+" personas por día.");
    }//GEN-LAST:event_jbInfoActionPerformed

    private void jcbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProvinciaActionPerformed
        JCcentros.removeAllItems();
        cargarJCcentros();
    }//GEN-LAST:event_jcbProvinciaActionPerformed

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
    private javax.swing.JComboBox<String> JCcentros;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbInfo;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbAMbito1;
    private javax.swing.JComboBox<String> jcbPatologia;
    private javax.swing.JComboBox<String> jcbProvincia;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCaracCelular;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDoc;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtLocalidad;
    private javax.swing.JTextField jtMail;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtTramite;
    private javax.swing.JLabel label_doc;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_tramite;
    // End of variables declaration//GEN-END:variables

    
    private void Limpiar(){
    jtDoc.setText("");
    jtApellido.setText("");
    jtCaracCelular.setText("");
    jtCelular.setText("");
    jtDomicilio.setText("");
    jtLocalidad.setText("");
    jtMail.setText("");
    jtNombre1.setText("");
    jtTramite.setText("");
    
}
    
    private void cargarJCcentros (){
        JCcentros.removeAllItems();
            List <Centro> centros = new ArrayList<>();
            centros = ced.listarCentrosXProvincia(String.valueOf(jcbProvincia.getSelectedItem()));
            for (Centro centro: centros){
            JCcentros.addItem(centro.toString());
        }
    }
}
