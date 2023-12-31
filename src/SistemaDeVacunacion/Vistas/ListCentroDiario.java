
package SistemaDeVacunacion.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Cita;
import java.util.HashMap;
import java.util.Map;


public class ListCentroDiario extends javax.swing.JFrame {

    private CitaData ciData; 
    private DefaultTableModel modelo;
    public ListCentroDiario() {
        initComponents();
        modelo = new DefaultTableModel();
        ciData = new CitaData();
        CentroData cd = new CentroData();
        Centro centro = new Centro();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jbConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("VACUNAS ⦁\tListar diariamente, todos los centros de vacunación, y la cantidad de dosis aplicadas en cada uno.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 46, 121, 39));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione la fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Centro de salud", "Cantidad de dosis aplicadas"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 340, 280));

        jCalendar1.setDecorationBackgroundVisible(false);
        jCalendar1.setMinSelectableDate(new java.util.Date(1672545666000L));
        jCalendar1.setWeekOfYearVisible(false);
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jbConsultar.setBackground(new java.awt.Color(15, 75, 94));
        jbConsultar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 40, 50));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 75, 94));
        jLabel4.setText("VACUNAS APLICADAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 75, 94));
        jLabel5.setText("VACUNAS APLICADAS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new EstadisticasListado().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        borrarFilaTabla();
        cargaVacunados();
        
    }//GEN-LAST:event_jbConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ListCentroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCentroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCentroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCentroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCentroDiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables

  private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i); 
        }
    }     
    
    private void cargaVacunados() {
    List<Cita> citas = ciData.obtenerVacunasAplicadasDiaria(jCalendar1.getDate());
    
    Map<String, Map<String, Integer>> conteoPorCentro = new HashMap<>();
    
    for (Cita cita : citas) {
        String estado = cita.getEstadoCita();
        String centro = (cita.getId() + " " + cita.getLocalidad()).toString();
        
        if (!conteoPorCentro.containsKey(centro)) {
           conteoPorCentro.put(centro, new HashMap<>());
        }

        Map<String, Integer> conteo = conteoPorCentro.get(centro);

        conteo.put(estado, conteo.getOrDefault(estado, 0) + 1);
    }

        modelo = new DefaultTableModel(new Object[]{"Centro", "Cumplidas"}, 0);

    
        for (Map.Entry<String, Map<String, Integer>> entry : conteoPorCentro.entrySet()) {
        String centro = entry.getKey();
        int cumplidas = entry.getValue().getOrDefault("CUM", 0);
        

        Object[] rowData = {centro, cumplidas};
        modelo.addRow(rowData);
    }

    jTable.setModel(modelo);
}





}
