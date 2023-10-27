package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import javax.swing.JOptionPane;

public class CrearCentro extends javax.swing.JFrame {

    public CrearCentro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTcapacidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTdireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTlocalidad = new javax.swing.JTextField();
        JCprovincia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        JBcrear = new javax.swing.JButton();
        JBvolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setText("Localidad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        getContentPane().add(JTcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 149, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Dirección:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));
        getContentPane().add(JTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 149, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Provincia:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 16));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Capacidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));
        getContentPane().add(JTlocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 149, -1));

        JCprovincia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JCprovincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        getContentPane().add(JCprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 149, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        jLabel6.setText("CREAR CENTRO DE VACUNACIÓN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        JBcrear.setBackground(new java.awt.Color(15, 75, 94));
        JBcrear.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBcrear.setForeground(new java.awt.Color(255, 255, 255));
        JBcrear.setText("Crear");
        JBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcrearActionPerformed(evt);
            }
        });
        getContentPane().add(JBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 120, 47));

        JBvolver.setBackground(new java.awt.Color(15, 75, 94));
        JBvolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBvolver.setForeground(new java.awt.Color(255, 255, 255));
        JBvolver.setText("<- Volver");
        JBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBvolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 42, 117, 41));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcrearActionPerformed
        Centro centro = new Centro();
        CentroData cd = new CentroData();
        try{
        centro.setCapacidad(Integer.parseInt(JTcapacidad.getText()));
        centro.setDomicilio(JTdireccion.getText());
        centro.setLocalidad(JTlocalidad.getText());
        centro.setProvincia(String.valueOf(JCprovincia.getSelectedItem()));
        cd.agregar(centro);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "El valor de Capacidad debe ser un valor numérico valido.");
        }
    }//GEN-LAST:event_JBcrearActionPerformed

    private void JBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBvolverActionPerformed
        this.dispose();
        new Rango_2().setVisible(true);
    }//GEN-LAST:event_JBvolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
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
            java.util.logging.Logger.getLogger(CrearCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCentro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcrear;
    private javax.swing.JButton JBvolver;
    private javax.swing.JComboBox<String> JCprovincia;
    private javax.swing.JTextField JTcapacidad;
    private javax.swing.JTextField JTdireccion;
    private javax.swing.JTextField JTlocalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
