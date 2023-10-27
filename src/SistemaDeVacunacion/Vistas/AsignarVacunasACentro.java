package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AsignarVacunasACentro extends javax.swing.JFrame {

    CentroData cd = new CentroData();
Centro centro = new Centro();
List <Vacuna> vacunas = new ArrayList();
Vacuna vac = new Vacuna();

private final DefaultTableModel model = new DefaultTableModel(){
    @Override
        public boolean isCellEditable(int row, int column) {
            return column == 2;
        }
};

    public AsignarVacunasACentro() {
        initComponents();
        cargarJCcentros();
        
        model.addColumn("Vacuna");
        model.addColumn("Stock");
        
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVolver = new javax.swing.JButton();
        JCcentros = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBguardar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

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

        JCcentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCcentrosActionPerformed(evt);
            }
        });
        getContentPane().add(JCcentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 200, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        jLabel1.setText("ASIGNAR VACUNAS A CENTRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 190));

        JBguardar.setBackground(new java.awt.Color(15, 75, 94));
        JBguardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JBguardar.setForeground(new java.awt.Color(255, 255, 255));
        JBguardar.setText("Guardar");
        getContentPane().add(JBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 110, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new Rango_2().setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void JCcentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCcentrosActionPerformed

        for (Vacuna vacuna: vacunas) {
                model.addRow(new Object[]{vacuna.getMarca(), vacuna.getStock()});
        }
        JTable jTable1 = new JTable(model);
    }//GEN-LAST:event_JCcentrosActionPerformed

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
            java.util.logging.Logger.getLogger(AsignarVacunasACentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarVacunasACentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarVacunasACentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarVacunasACentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarVacunasACentro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBguardar;
    private javax.swing.JComboBox<Centro> JCcentros;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables

 private void cargarJCcentros (){
            JCcentros.removeAllItems();
            List <Centro> centros = new ArrayList<>();

      if (  "CABA".equals(Login.user)){
          centros = cd.listarCentrosXProvincia("Ciudad Autónoma de Buenos Aires");
        for (Centro centro: centros){
            JCcentros.addItem(centro);
        }
      }else{
        centros = cd.listarCentrosXProvincia(Login.user);
        for (Centro centro: centros){
            JCcentros.addItem(centro);
              } 
       }
    }
}
