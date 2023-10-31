package SistemaDeVacunacion.Vistas;
import java.awt.Image;
import java.awt.Toolkit;
import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Cita;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registrar_vacunados extends javax.swing.JFrame {
    CentroData ced = new CentroData();
    
    public Registrar_vacunados() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
         cargarComboBox();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jbConsulta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtHora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtCentro = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtSerie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JCVacunas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Número de SERIE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 431, 160, -1));

        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        getContentPane().add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 150, -1));

        jbConsulta.setBackground(new java.awt.Color(15, 75, 94));
        jbConsulta.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jbConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 30, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jtFecha.setEditable(false);
        getContentPane().add(jtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jtHora.setEditable(false);
        jtHora.setText(" ");
        getContentPane().add(jtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 150, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Centro de salud:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jtCentro.setEditable(false);
        getContentPane().add(jtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 150, -1));

        jtId.setEditable(false);
        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });
        getContentPane().add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 150, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Vacuna");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("REGISTRAR LOS DATOS DE LA VACUNA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSerieActionPerformed(evt);
            }
        });
        jtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSerieKeyTyped(evt);
            }
        });
        getContentPane().add(jtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 200, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Turno Nro:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setText("VACUNADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 100, 50));

        JCVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCVacunasActionPerformed(evt);
            }
        });
        getContentPane().add(JCVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 200, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setText("Número de DNI:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel12.setText("BUSCAR EL TURNO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 560, 200));

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("REGISTRAR VACUNADOS");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 560, 90));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
        if(jtDni.getText().length()>=8){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniKeyTyped

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed

                                        
    CitaData ad = new CitaData();
try {
    int dni = Integer.parseInt(jtDni.getText());
    Cita cita = ad.buscarTurnoXDni2(dni);

    if (cita != null && cita.getEstadoCita() == null) {
        LocalDateTime fechaHoraActual = LocalDateTime.now(); 
                
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fechaHoraCitaStr = cita.getFechaHoraCita().format(formatter);
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
            String fechaHoraCitaHora = cita.getFechaHoraCita().format(formatterHora);
            jtFecha.setText(fechaHoraCitaStr);
            jtHora.setText(fechaHoraCitaHora);
            jtCentro.setText(cita.getCentro().toString());
            jtId.setText(Integer.toString(cita.getId()));
            
                    
    } else {
        
        JOptionPane.showMessageDialog(null, "El DNI no tiene turno asignado.");
        jtFecha.setText(""); 
        jtHora.setText("");
        jtCentro.setText("");
        jtId.setText("");
    }
} catch (NumberFormatException nfe) {
    JOptionPane.showMessageDialog(null, "El DNI debe ser un valor numérico");
    jtDni.setText("");
}
    //cargarComboBox();
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdActionPerformed

    private void jtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSerieActionPerformed

    private void jtSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSerieKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSerieKeyTyped

    private void JCVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCVacunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCVacunasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registrarVacuna();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_vacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_vacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_vacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_vacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_vacunados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCVacunas;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtCentro;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField jtHora;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtSerie;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox(){
        //CentroData ad = new CentroData();
        //Centro centro = ced.buscarCentroXId(Integer.parseInt(Login.user.substring(0,2)));
        //List <Centro> centros = new ArrayList <>();
        JCVacunas.removeAllItems();
        List <Vacuna> vacunas = ced.buscarCentroXId(Integer.parseInt(Login.user.substring(0,2))).getVacunas();
        for (Vacuna vacuna: vacunas){
        JCVacunas.addItem(vacuna.getMarca());
        }
    }
    
    private void registrarVacuna() {
        String serie = jtSerie.getText();
        int id = Integer.parseInt(jtId.getText());
        String marca = String.valueOf(JCVacunas.getSelectedItem());
        ced.actualizarCitasVacunado(serie, id, marca);
        Limpiar();
    }
    
    private void Limpiar(){
    jtDni.setText("");
    jtFecha.setText("");
    jtHora.setText("");
    jtCentro.setText("");
    jtId.setText("");
    jtSerie.setText("");
    JOptionPane.showMessageDialog(null,"Registrado Correctamente");
    }
}
