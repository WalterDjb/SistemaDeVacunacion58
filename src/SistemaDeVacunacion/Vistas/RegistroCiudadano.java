package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Conexiones.CiudadanoData;
import SistemaDeVacunacion.Entidades.Ciudadano;
import SistemaDeVacunacion.Entidades.Icono;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class RegistroCiudadano extends javax.swing.JFrame {

    CentroData ced = new CentroData();

    /**
     * Creates new form Main
     */
    public RegistroCiudadano() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Quiero vacunarme");

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVolver = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jtMail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtNombre1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtCelular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbProvincia1 = new javax.swing.JComboBox<>();
        jcbPatologia = new javax.swing.JComboBox<>();
        jcbAMbito1 = new javax.swing.JComboBox<>();
        jtLocalidad = new javax.swing.JTextField();
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

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("Registra tu datos");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 40));

        jtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDomicilioActionPerformed(evt);
            }
        });
        getContentPane().add(jtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 240, -1));

        jtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMailActionPerformed(evt);
            }
        });
        getContentPane().add(jtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 240, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel9.setText("Localidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setText("Patología:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 20));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setText("Domicilio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setText("Nombre:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

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
        getContentPane().add(jtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 270, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setText("Email:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

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
        getContentPane().add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 240, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setText("Provincia:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 30));

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
        getContentPane().add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setText("Ámbito de trabajo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jbInscribir.setBackground(new java.awt.Color(15, 75, 94));
        jbInscribir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbInscribir.setText("REGISTRARME");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 150, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jcbProvincia1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbProvincia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        jcbProvincia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProvincia1ActionPerformed(evt);
            }
        });
        getContentPane().add(jcbProvincia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 270, -1));

        jcbPatologia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbPatologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Cáncer.", "Diabetes.", "Enf. autoinmunitarias.", "Enf. cardíacas.", "Enf. crónicas del sistema digestivo.", "Enf.s hepáticas.", "Enf. hematológicas.", "Enf. metabólicas hereditarias.", "Enf. neurológicas.", "Enf. pulmonares crónicas.", "Enf. renales crónicas.", "Enf. autoinmunitarias.", "Inmunodeficiencias primarias.", "Obesidad." }));
        getContentPane().add(jcbPatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 230, -1));

        jcbAMbito1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbAMbito1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otros", "Salud", "Educacion", "Comercio", "Seguridad", "Justicia" }));
        getContentPane().add(jcbAMbito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 150, -1));

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
        getContentPane().add(jtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 270, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDomicilioActionPerformed

    private void jtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMailActionPerformed

    private void jtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombre1ActionPerformed

    private void jtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCelularActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        if (jtNombre1.getText().trim().equals("") || jtApellido.getText().trim().equals("")
                || jtCelular.getText().trim().equals("") || jtLocalidad.getText().trim().equals("")
                || jtDomicilio.getText().trim().equals("") || jtMail.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Datos faltantes", 0, Icono.ERROR);

        } else if (jtDomicilio.getText().trim().length() < 4) {

            JOptionPane.showMessageDialog(null, "Domicilio inválido. Intente nuevamente", "Dato inválido", 0, Icono.ERROR);

        } else if (jtCelular.getText().trim().length() < 10) {

            JOptionPane.showMessageDialog(null, "Número de teléfono inválido. Intente nuevamente", "Dato inválido", 0, Icono.ERROR);

        } else if (jtNombre1.getText().trim().length() < 3) {

            JOptionPane.showMessageDialog(null, "Nombre inválido. Intente nuevamente", "Dato inválido", 0, Icono.ERROR);

        } else if (jtApellido.getText().trim().length() < 3) {

            JOptionPane.showMessageDialog(null, "Apellido inválido. Intente nuevamente", "Dato inválido", 0, Icono.ERROR);

        } else {

            Ciudadano ciudadano = new Ciudadano();

            ciudadano.setDni(SolicitarTurno.dni);
            ciudadano.setNombre(jtNombre1.getText().trim());
            ciudadano.setApellido(jtApellido.getText().trim());
            ciudadano.setCelular(Long.valueOf(jtCelular.getText().trim()));
            ciudadano.setDomicilio(jtDomicilio.getText().trim());
            ciudadano.setAmbito(jcbAMbito1.getSelectedItem().toString());
            ciudadano.setEmail(jtMail.getText().trim());
            ciudadano.setLocalidad(jtLocalidad.getText().trim());
            ciudadano.setNumTramite(SolicitarTurno.tramite);
            ciudadano.setPatologia(jcbPatologia.getSelectedItem().toString());
            ciudadano.setProvincia(jcbProvincia1.getSelectedItem().toString());

            CiudadanoData.guardarCiudadano(ciudadano);
            JOptionPane.showMessageDialog(null, "Se han guardado sus datos satisfactoriamente.", "Operación exitosa", 1, Icono.CORRECTO);
            new DatosTurno().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCelularKeyTyped

        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtCelular.getText().length() >= 12) {
            evt.consume();
        }

    }//GEN-LAST:event_jtCelularKeyTyped

    private void jtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombre1KeyTyped

        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombre1KeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jcbProvincia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProvincia1ActionPerformed

    }//GEN-LAST:event_jcbProvincia1ActionPerformed

    private void jtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLocalidadActionPerformed

    private void jtLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLocalidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLocalidadKeyTyped

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
            java.util.logging.Logger.getLogger(RegistroCiudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCiudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCiudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCiudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCiudadano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
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
    private javax.swing.JComboBox<String> jcbAMbito1;
    private javax.swing.JComboBox<String> jcbPatologia;
    private javax.swing.JComboBox<String> jcbProvincia1;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtLocalidad;
    private javax.swing.JTextField jtMail;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables

}
