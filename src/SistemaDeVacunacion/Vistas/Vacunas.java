package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.LaboratorioData;
import SistemaDeVacunacion.Conexiones.VacunaData;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Vacunas extends javax.swing.JFrame {

    VacunaData vd = new VacunaData();
    Vacuna vac = new Vacuna();
    LaboratorioData ld = new LaboratorioData();
    DateTimeFormatter formatearFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Vacunas() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtDosis = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jtAntigeno = new javax.swing.JTextField();
        jtFechaCad = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtLaboratorio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 75, 94));
        jLabel2.setText("CARGA DE VACUNAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Dosis:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Marca comercial:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Stock:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setText("Antígeno:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Fecha de caducidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jtDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDosisActionPerformed(evt);
            }
        });
        getContentPane().add(jtDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 248, -1));
        getContentPane().add(jtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 248, -1));
        getContentPane().add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 248, -1));

        jtAntigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAntigenoActionPerformed(evt);
            }
        });
        getContentPane().add(jtAntigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 248, -1));
        getContentPane().add(jtFechaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 248, -1));

        jbGuardar.setBackground(new java.awt.Color(15, 75, 94));
        jbGuardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jbModificar.setBackground(new java.awt.Color(15, 75, 94));
        jbModificar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jbLimpiar.setBackground(new java.awt.Color(15, 75, 94));
        jbLimpiar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 40));

        jLabel1.setText("Laboratorio:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));
        getContentPane().add(jtLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 270, -1));

        jbBuscar.setBackground(new java.awt.Color(15, 75, 94));
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtAntigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAntigenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAntigenoActionPerformed

    private void jtDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDosisActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new Rango_1().setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
        vac.setAntigeno(jtAntigeno.getText());
        vac.setLaboratorio(ld.buscarLaboratorioXNombre(jtLaboratorio.getText()));
        vac.setCaducidad(LocalDate.parse((jtFechaCad.getText()), formatearFecha));
        vac.setCapacidadDosis(Double.parseDouble(jtDosis.getText()));
        vac.setMarca(jtMarca.getText());
        vac.setStock(Integer.parseInt(jtStock.getText()));
        vd.guardarVacuna(vac);
        //JOptionPane.showMessageDialog(null, "Vacuna creada con éxito.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "algo falló acá. -g-");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        vac = vd.buscarVacunaXNombre(jtMarca.getText());
        jtAntigeno.setText(vac.getAntigeno());
        jtDosis.setText(String.valueOf(vac.getCapacidadDosis()));
        jtFechaCad.setText(vac.getCaducidad().format(formatearFecha));
        jtLaboratorio.setText(vac.laboratorio.getNombre());
        jtMarca.setText(vac.getMarca());
        jtStock.setText(String.valueOf(vac.getStock()));
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try{
            vac = vd.buscarVacunaXNombre(jtMarca.getText());
            vac.setAntigeno(jtAntigeno.getText());
            vac.setCaducidad(LocalDate.parse((jtFechaCad.getText()), formatearFecha));
            vac.setCapacidadDosis(Double.parseDouble(jtDosis.getText()));
            vac.setMarca(jtMarca.getText());
            vac.setStock(Integer.parseInt(jtStock.getText()));
            vd.modificarVacuna(vac);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Los valores ingresados no son validos. Revise y vuelva a intentarlo.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtAntigeno.setText("");
        jtDosis.setText("");
        jtFechaCad.setText("");
        jtLaboratorio.setText("");
        jtMarca.setText("");
        jtStock.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacunas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtAntigeno;
    private javax.swing.JTextField jtDosis;
    private javax.swing.JTextField jtFechaCad;
    private javax.swing.JTextField jtLaboratorio;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
