package SistemaDeVacunacion.Vistas;
import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CentrosHabilitados extends javax.swing.JFrame {
    CentroData cd = new CentroData();
    /** Creates new form Main */
    public CentrosHabilitados() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Quiero vacunarme");
        cargarJCcentros();
    }

    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
    return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JCcentros = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbAcceder = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCprovincia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JCcentros.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JCcentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCcentrosActionPerformed(evt);
            }
        });
        getContentPane().add(JCcentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 270, 290, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setText("Seleccione el centro de salud");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jbAcceder.setBackground(new java.awt.Color(15, 75, 94));
        jbAcceder.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jbAcceder.setText("Acceder");
        jbAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jbAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 109, 42));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 75, 94));
        jLabel3.setText("Consulte las direcciones de los");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Seleccione una Provincia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        JCprovincia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JCprovincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        JCprovincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCprovinciaActionPerformed(evt);
            }
        });
        getContentPane().add(JCprovincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 200, 290, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 75, 94));
        jLabel5.setText("CENTROS HABILITADOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
       new Main().setVisible(true);
       dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAccederActionPerformed
        String Scen = String.valueOf(JCcentros.getSelectedItem()).substring(0,2);
        int id = Integer.parseInt(Scen);
        Centro cen = cd.buscarCentroXId(id);
        JOptionPane.showMessageDialog(null, "DATOS DEL CENTRO\nProvincia: "+cen.getProvincia()+".\nLocalidad: "+cen.getLocalidad()+".\nDireccion: "+cen.getDomicilio()+".\nCapacidad: "+cen.getCapacidad()+" personas por día.");
    }//GEN-LAST:event_jbAccederActionPerformed

    private void JCprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCprovinciaActionPerformed
        JCcentros.removeAllItems();
        cargarJCcentros();
    }//GEN-LAST:event_JCprovinciaActionPerformed

    private void JCcentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCcentrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCcentrosActionPerformed

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
            java.util.logging.Logger.getLogger(CentrosHabilitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentrosHabilitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentrosHabilitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentrosHabilitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentrosHabilitados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Centro> JCcentros;
    private javax.swing.JComboBox<String> JCprovincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAcceder;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables

        private void cargarJCcentros (){
            JCcentros.removeAllItems();
            List <Centro> centros = new ArrayList<>();
        centros = cd.listarCentrosXProvincia(String.valueOf(JCprovincia.getSelectedItem()));
        for (Centro centro: centros){
            JCcentros.addItem(centro);
        }
    }
}
