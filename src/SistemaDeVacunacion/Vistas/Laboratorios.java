package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.LaboratorioData;
import SistemaDeVacunacion.Entidades.Laboratorio;
import javax.swing.JOptionPane;

public class Laboratorios extends javax.swing.JFrame {

    public Laboratorios() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectorBuscador = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTcuit02 = new javax.swing.JTextField();
        JTnombre = new javax.swing.JTextField();
        JTpais = new javax.swing.JTextField();
        JTdireccion = new javax.swing.JTextField();
        JTcuit03 = new javax.swing.JTextField();
        JTcuit01 = new javax.swing.JTextField();
        JBguardar = new javax.swing.JButton();
        JBmodificar = new javax.swing.JButton();
        JBrenovar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBvolver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTstock = new javax.swing.JTextField();
        JRb01 = new javax.swing.JRadioButton();
        JRb02 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("LABORATORIOS ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 260, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("CUIT:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Nombre comercial:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("País de origen:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Dirección fiscal:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        JTcuit02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcuit02ActionPerformed(evt);
            }
        });
        JTcuit02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTcuit02KeyTyped(evt);
            }
        });
        getContentPane().add(JTcuit02, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 156, -1));
        getContentPane().add(JTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 160, -1));

        JTpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTpaisActionPerformed(evt);
            }
        });
        getContentPane().add(JTpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, -1));

        JTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTdireccionActionPerformed(evt);
            }
        });
        getContentPane().add(JTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 160, -1));

        JTcuit03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcuit03ActionPerformed(evt);
            }
        });
        JTcuit03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTcuit03KeyTyped(evt);
            }
        });
        getContentPane().add(JTcuit03, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 33, -1));

        JTcuit01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcuit01ActionPerformed(evt);
            }
        });
        JTcuit01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTcuit01KeyTyped(evt);
            }
        });
        getContentPane().add(JTcuit01, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 33, -1));

        JBguardar.setBackground(new java.awt.Color(15, 75, 94));
        JBguardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBguardar.setForeground(new java.awt.Color(255, 255, 255));
        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(JBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        JBmodificar.setBackground(new java.awt.Color(15, 75, 94));
        JBmodificar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBmodificar.setForeground(new java.awt.Color(255, 255, 255));
        JBmodificar.setText("Modificar");
        JBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(JBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        JBrenovar.setBackground(new java.awt.Color(15, 75, 94));
        JBrenovar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBrenovar.setForeground(new java.awt.Color(255, 255, 255));
        JBrenovar.setText("Eliminar");
        JBrenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBrenovarActionPerformed(evt);
            }
        });
        getContentPane().add(JBrenovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel6.setText("-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel7.setText("-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        JBvolver.setBackground(new java.awt.Color(15, 75, 94));
        JBvolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBvolver.setForeground(new java.awt.Color(255, 255, 255));
        JBvolver.setText("<-  Volver");
        JBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 40));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(15, 75, 94));
        jLabel9.setText("FARMACOLÓGICOS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 310, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Stock:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        JTstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTstockKeyTyped(evt);
            }
        });
        getContentPane().add(JTstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 160, -1));

        JRb01.setBackground(new java.awt.Color(255, 255, 255));
        SelectorBuscador.add(JRb01);
        JRb01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb01ActionPerformed(evt);
            }
        });
        getContentPane().add(JRb01, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        JRb02.setBackground(new java.awt.Color(255, 255, 255));
        SelectorBuscador.add(JRb02);
        getContentPane().add(JRb02, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        jButton5.setBackground(new java.awt.Color(15, 75, 94));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 80, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        LaboratorioData ld = new LaboratorioData();
        Laboratorio lab = new Laboratorio();
    private void JTcuit02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcuit02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTcuit02ActionPerformed

    private void JTpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTpaisActionPerformed

    private void JTcuit03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcuit03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTcuit03ActionPerformed

    private void JTcuit01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcuit01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTcuit01ActionPerformed

    private void JTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTdireccionActionPerformed

    private void JBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmodificarActionPerformed
        try{
        if (JRb01.isSelected()){
            lab= ld.buscarLaboratorioXCuit(Long.parseLong(JTcuit01.getText()+JTcuit02.getText()+JTcuit03.getText()));
            lab.setCuit(Long.parseLong(JTcuit01.getText()+JTcuit02.getText()+JTcuit03.getText()));
            lab.setNombre(JTnombre.getText());
            lab.setPais(JTpais.getText());
            lab.setDireccion(JTdireccion.getText());
            lab.setStock(Long.parseLong(JTstock.getText()));
            ld.modificarLaboratorioXNombre(lab);
            //JOptionPane.showMessageDialog(null, "Datos modificados.");
        }
        else if (JRb02.isSelected()){
            lab= ld.buscarLaboratorioXNombre(JTnombre.getText());
            lab.setCuit(Long.parseLong(JTcuit01.getText()+JTcuit02.getText()+JTcuit03.getText()));
            lab.setNombre(JTnombre.getText());
            lab.setPais(JTpais.getText());
            lab.setDireccion(JTdireccion.getText());
            lab.setStock(Long.parseLong(JTstock.getText()));
            ld.modificarLaboratorioXNombre(lab);
            //JOptionPane.showMessageDialog(null, "Datos modificados.");
                }
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Tanto CUIT como Stock deben ser valores numericos validos.");
        }            
    }//GEN-LAST:event_JBmodificarActionPerformed

    private void JBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvolverActionPerformed
        this.dispose();
        new Rango_1().setVisible(true);
    }//GEN-LAST:event_JBvolverActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
        if (JRb01.isSelected()){
            lab= ld.buscarLaboratorioXCuit(Long.parseLong(JTcuit01.getText()+JTcuit02.getText()+JTcuit03.getText()));
            JTnombre.setText(lab.getNombre());
            JTpais.setText(lab.getPais());
            JTdireccion.setText(lab.getDireccion());
            JTstock.setText(String.valueOf(lab.getStock()));
        }
        else if(JRb02.isSelected()){
            lab= ld.buscarLaboratorioXNombre(JTnombre.getText());
            JTcuit01.setText(String.valueOf(lab.getCuit()).substring(0,2));
            JTcuit02.setText(String.valueOf(lab.getCuit()).substring(2,10));
            JTcuit03.setText(String.valueOf(String.valueOf(lab.getCuit()).charAt(10)));
            JTnombre.setText(lab.getNombre());
            JTpais.setText(lab.getPais());
            JTdireccion.setText(lab.getDireccion());
            JTstock.setText(String.valueOf(lab.getStock()));
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un parámetro de busqueda.");
        }
                }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Tanto CUIT como Stock deben ser valores numericos validos.");
        }catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null, "No se encontraron laboratorios registrados con esos datos.");
        }            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        try{
        lab.setCuit(Long.parseLong(JTcuit01.getText()+JTcuit02.getText()+JTcuit03.getText()));
        lab.setNombre(JTnombre.getText());
        lab.setPais(JTpais.getText());
        lab.setDireccion(JTdireccion.getText());
        lab.setStock(Long.parseLong(JTstock.getText()));
        ld.guardarLaboratorio(lab);
        JTcuit01.setText("");
        JTcuit02.setText("");
        JTcuit03.setText("");
        JTnombre.setText("");
        JTpais.setText("");
        JTdireccion.setText("");
        JTstock.setText("");
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Tanto CUIT como Stock deben ser valores numericos validos.");
        }            
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBrenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBrenovarActionPerformed
        JTcuit01.setText("");
        JTcuit02.setText("");
        JTcuit03.setText("");
        JTnombre.setText("");
        JTpais.setText("");
        JTdireccion.setText("");
        JTstock.setText("");
    }//GEN-LAST:event_JBrenovarActionPerformed

    private void JRb01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRb01ActionPerformed

    private void JTcuit01KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTcuit01KeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
        if (JTcuit01.getText().length()>=2)
            evt.consume();
        
    }//GEN-LAST:event_JTcuit01KeyTyped

    private void JTcuit02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTcuit02KeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }        
        if(JTcuit02.getText().length()>=8){
    evt.consume();
}

    }//GEN-LAST:event_JTcuit02KeyTyped

    private void JTcuit03KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTcuit03KeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }        
        if(JTcuit03.getText().length()>=1){
            evt.consume();
        }

    }//GEN-LAST:event_JTcuit03KeyTyped

    private void JTstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTstockKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key<=57;
        if(!numeros){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JTstockKeyTyped


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
            java.util.logging.Logger.getLogger(Laboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBmodificar;
    private javax.swing.JButton JBrenovar;
    private javax.swing.JButton JBvolver;
    private javax.swing.JRadioButton JRb01;
    private javax.swing.JRadioButton JRb02;
    private javax.swing.JTextField JTcuit01;
    private javax.swing.JTextField JTcuit02;
    private javax.swing.JTextField JTcuit03;
    private javax.swing.JTextField JTdireccion;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JTextField JTpais;
    private javax.swing.JTextField JTstock;
    private javax.swing.ButtonGroup SelectorBuscador;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
