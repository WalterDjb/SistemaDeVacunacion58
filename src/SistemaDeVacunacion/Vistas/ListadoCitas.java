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


public class ListadoCitas extends javax.swing.JFrame {

private List<Centro> listaCE;
private List<Cita> listaCI;
private CentroData ceData;
private CitaData ciData; 

private DefaultTableModel modelo;

public ListadoCitas() {
        initComponents();
        
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCMes = new javax.swing.JComboBox<>();
        jcbProvincia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCMes1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("LISTADO DE CITAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 122, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 701, 140));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione Provincia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jbConsultar.setBackground(new java.awt.Color(15, 75, 94));
        jbConsultar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultar.setText("Consultar");
        getContentPane().add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Seleccione el mes: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jCMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", " " }));
        jCMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMesActionPerformed(evt);
            }
        });
        getContentPane().add(jCMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));

        jcbProvincia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Buenos Aires", "Ciudad Autónoma Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        getContentPane().add(jcbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 160, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setText("Hasta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jCMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        jCMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMes1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Seleccione el Año: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel8.setText("Desde");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMes1ActionPerformed

    private void jCMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMesActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCMes;
    private javax.swing.JComboBox<String> jCMes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbProvincia;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
            filaCabecera.add("Centro");
            filaCabecera.add("Cumplidas");
            filaCabecera.add("Vencidas");
            filaCabecera.add("Canceladas");
            for(Object it: filaCabecera) {
                modelo.addColumn(it);
            }
            jTable1.setModel(modelo);

        }
}
   
