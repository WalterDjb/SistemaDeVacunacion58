package SistemaDeVacunacion.Vistas;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Cita;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class ListCitasMensual extends javax.swing.JFrame {

private List<Centro> listaCE;
private List<Cita> listaCI;
private CentroData ceData;
private CitaData ciData; 

private DefaultTableModel modelo;
public ListCitasMensual() {
        initComponents();
        modelo = new DefaultTableModel();
        ciData = new CitaData();
        CentroData cd = new CentroData();
        Centro centro = new Centro();
//        armarCabecera();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCAno = new javax.swing.JComboBox<>();
        jCMes1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("LISTADO DE CITAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 122, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 50, 129, 38));

        jTable1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cumplidas", "Vencidas", "Canceladas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 701, 250));

        jbConsultar.setBackground(new java.awt.Color(15, 75, 94));
        jbConsultar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 30, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Mes: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jCAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", " " }));
        jCAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAnoActionPerformed(evt);
            }
        });
        getContentPane().add(jCAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, 30));

        jCMes1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jCMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMes1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 140, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Año: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMes1ActionPerformed

    private void jCAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAnoActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new EstadisticasListado().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        borrarFilaTabla();
        cargaCentrosVacunas();
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
            java.util.logging.Logger.getLogger(ListCitasMensual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCitasMensual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCitasMensual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCitasMensual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCitasMensual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCAno;
    private javax.swing.JComboBox<String> jCMes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables

//    private void armarCabecera() {
//        ArrayList<Object> filaCabecera = new ArrayList<>();
//            filaCabecera.add("Centro");
//            filaCabecera.add("Cumplidas");
//            filaCabecera.add("Vencidas");
//            filaCabecera.add("Canceladas");
//            for(Object it: filaCabecera) {
//                modelo.addColumn(it);
//            }
//            jTable1.setModel(modelo);
//
//        }
    private void cargaCentrosVacunas() {
     int anoSeleccionado = Integer.parseInt(jCAno.getSelectedItem().toString());
     int mesSeleccionado = Integer.parseInt(jCMes1.getSelectedItem().toString());
        
        
     List<Cita> citas = ciData.obtenerCitasPorProvincia(Login.user, anoSeleccionado, mesSeleccionado);
    
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Centro", "Cumplidas", "Vencidas", "Canceladas"}, 0);
        int cumplidas = 0;
        int vencidas = 0;
        int canceladas = 0;

      
        
    for (Cita cita : citas) {
    String estado = cita.getEstadoCita();
        

    
    if ("CUM".equals(estado)) {
        cumplidas++;
    } else if ("VEN".equals(estado)) {
        vencidas++;
    } else if ("CAN".equals(estado)) {
        canceladas++;
    }

    String centro = cita.getId() + " " + cita.getLocalidad();
    Object[] rowData = {centro, cumplidas, vencidas, canceladas};

    
    modelo.addRow(rowData);
 
    }
    jTable1.setModel(modelo);
}

private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i); 
        }
    }

   
     
}

   
