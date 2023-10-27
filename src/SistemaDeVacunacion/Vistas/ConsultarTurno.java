package SistemaDeVacunacion.Vistas;
import java.awt.Image;
import java.awt.Toolkit;
import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Entidades.Cita;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


/**
 *
 * @author Walter Benítez
 */
public class ConsultarTurno extends javax.swing.JFrame {

    /** Creates new form Main */
    public ConsultarTurno() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Quiero vacunarme");
        jbCancelar1.setVisible(false);
        jbCancelar.setVisible(false);
        jbCancelar2.setVisible(false);
    }

    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
    return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtFecha = new javax.swing.JTextField();
        jtHora = new javax.swing.JTextField();
        jtCentro = new javax.swing.JTextField();
        jbConsulta = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbCancelar1 = new javax.swing.JButton();
        jbCancelar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 75, 94));
        jLabel2.setText("CONSULTAR TURNO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setText("Número de DNI:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Turno Nro:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

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
        getContentPane().add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 150, -1));

        jtFecha.setEditable(false);
        getContentPane().add(jtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 235, 150, -1));

        jtHora.setEditable(false);
        jtHora.setText(" ");
        getContentPane().add(jtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 150, -1));

        jtCentro.setEditable(false);
        getContentPane().add(jtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 305, 150, -1));

        jbConsulta.setBackground(new java.awt.Color(15, 75, 94));
        jbConsulta.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jbConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 195, 30, 30));

        jbCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jbCancelar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jbCancelar.setText("Nueva Consulta");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 200, 50));

        jbCancelar1.setBackground(new java.awt.Color(234, 58, 46));
        jbCancelar1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar1.setText("<html><body style='width: 50px; text-align:center;'>Confirmar Cancelaciòn</body></html>");
        jbCancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 200, 50));

        jbCancelar2.setBackground(new java.awt.Color(234, 58, 46));
        jbCancelar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbCancelar2.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar2.setText("Cancelar Turno");
        jbCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 200, 50));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Centro de salud:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 305, -1, -1));

        jtId.setEditable(false);
        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });
        getContentPane().add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        Limpiar();
       
    }//GEN-LAST:event_jbCancelarActionPerformed

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
    Cita cita = ad.buscarTurnoXDni(dni);

    if (cita != null && cita.getEstadoCita() == null) {
        LocalDateTime fechaHoraActual = LocalDateTime.now(); 
        
        
        if (cita.getFechaHoraCita().isAfter(fechaHoraActual)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fechaHoraCitaStr = cita.getFechaHoraCita().format(formatter);
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
            String fechaHoraCitaHora = cita.getFechaHoraCita().format(formatterHora);
            jtFecha.setText(fechaHoraCitaStr);
            jtHora.setText(fechaHoraCitaHora);
            jtCentro.setText(cita.getCentro().toString());
            jtId.setText(Integer.toString(cita.getId()));
            
            jbCancelar.setVisible(true);
            jbCancelar2.setVisible(true);
        } else {
            
            JOptionPane.showMessageDialog(null, "La fecha de la cita programada ya paso.");
            jtFecha.setText(""); 
            jtHora.setText("");
            jtCentro.setText("");
            jtId.setText("");
        }
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


    }//GEN-LAST:event_jbConsultaActionPerformed

    private void jbCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar1ActionPerformed
    CitaData ad = new CitaData();
    Cita cita = ad.buscarTurnoPorId(Integer.parseInt(jtId.getText()));
        
    if (cita != null) { 
        ad.cancelarTurnoPorId(Integer.parseInt(jtId.getText()));
        Limpiar();
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró una cita para el ID especificado.");
        
    }
    }//GEN-LAST:event_jbCancelar1ActionPerformed

    private void jbCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar2ActionPerformed
        jbCancelar1.setVisible(true);
        jbCancelar.setVisible(false);
        jbCancelar2.setVisible(false);
        
    }//GEN-LAST:event_jbCancelar2ActionPerformed

    private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelar1;
    private javax.swing.JButton jbCancelar2;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtCentro;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField jtHora;
    private javax.swing.JTextField jtId;
    // End of variables declaration//GEN-END:variables

    private void Limpiar(){
    jtDni.setText("");
    jtFecha.setText("");
    jtHora.setText("");
    jtCentro.setText("");
    jtId.setText("");
    
}
}
