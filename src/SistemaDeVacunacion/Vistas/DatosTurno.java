package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Icono;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class DatosTurno extends javax.swing.JFrame {

    public static int dni;
    private List<String> localidades;
    private List<Centro> centros;

    /**
     * Creates new form Main
     */
    public DatosTurno() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SISTEMA DE VACUNACIÓN - Incribirme");

        localidades = CentroData.listarLocalidadesXProvincia(combo_provincia.getSelectedItem().toString().trim());
        cargarCombo(localidades, combo_localidad);

        try {
            centros = CentroData.listarCentrosXLocalidad(combo_localidad.getSelectedItem().toString());
            cargarCombo(centros, combo_centro);
        } catch (Exception e) {
            combo_centro.removeAllItems();
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }

    private void cargarCombo(List lista, JComboBox combo) {

        DefaultComboBoxModel model = new DefaultComboBoxModel(lista.toArray());

        combo.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        boton_continuar = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        combo_provincia = new javax.swing.JComboBox<>();
        combo_localidad = new javax.swing.JComboBox<>();
        combo_centro = new javax.swing.JComboBox<>();
        jbInfo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(15, 75, 94));
        label_titulo.setText("Datos para el turno");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 30));

        boton_continuar.setBackground(new java.awt.Color(15, 75, 94));
        boton_continuar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_continuar.setForeground(new java.awt.Color(255, 255, 255));
        boton_continuar.setText("INSCRIBIR");
        boton_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_continuarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 40));

        boton_volver.setBackground(new java.awt.Color(15, 75, 94));
        boton_volver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_volver.setText("<- Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });
        getContentPane().add(boton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 40));

        combo_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán" }));
        combo_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_provinciaActionPerformed(evt);
            }
        });
        getContentPane().add(combo_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 230, 30));

        combo_localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_localidadActionPerformed(evt);
            }
        });
        getContentPane().add(combo_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 230, 30));

        combo_centro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_centroActionPerformed(evt);
            }
        });
        getContentPane().add(combo_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 230, 30));

        jbInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        jbInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInfoActionPerformed(evt);
            }
        });
        getContentPane().add(jbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 325, 40, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Centro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Localidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Provincia:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        label_info.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_info.setForeground(new java.awt.Color(0, 0, 0));
        label_info.setText("Elija el centro en dónde desea recibir la dosis a continuación:");
        getContentPane().add(label_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    private void boton_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_continuarActionPerformed
        if(combo_centro.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un centro para inscribirse", "Centro no seleccionado", 0, Icono.ERROR);
        } else {
            //CitaData.cargarCitasPorCentroYDni(Integer.parseInt(jtDoc.getText()), (Integer.parseInt(String.valueOf(JCcentros.getSelectedItem()).substring(0, 2))));
        }
    }//GEN-LAST:event_boton_continuarActionPerformed

    private void combo_centroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_centroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_centroActionPerformed

    private void combo_localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_localidadActionPerformed
        try {
            centros = CentroData.listarCentrosXLocalidad(combo_localidad.getSelectedItem().toString());
            cargarCombo(centros, combo_centro);
        } catch (Exception e) {
            combo_centro.removeAllItems();
        }
    }//GEN-LAST:event_combo_localidadActionPerformed

    private void combo_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_provinciaActionPerformed
        localidades = CentroData.listarLocalidadesXProvincia(combo_provincia.getSelectedItem().toString().trim());
        cargarCombo(localidades, combo_localidad);

        try {
            centros = CentroData.listarCentrosXLocalidad(combo_localidad.getSelectedItem().toString());
            cargarCombo(centros, combo_centro);
        } catch (Exception e) {
            combo_centro.removeAllItems();
        }
    }//GEN-LAST:event_combo_provinciaActionPerformed

    private void jbInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInfoActionPerformed
        try {
            String Scen = String.valueOf(combo_centro.getSelectedItem()).substring(0, 2);
            int id = Integer.parseInt(Scen);
            Centro cen = CentroData.buscarCentroXId(id);
            JOptionPane.showMessageDialog(null, "DATOS DEL CENTRO\nProvincia: " + cen.getProvincia() + ".\nLocalidad: " + cen.getLocalidad() + ".\nDireccion: " + cen.getDomicilio() + ".\nCapacidad: " + cen.getCapacidad() + " personas por día.");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbInfoActionPerformed

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
            java.util.logging.Logger.getLogger(DatosTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosTurno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_continuar;
    private javax.swing.JButton boton_volver;
    private javax.swing.JComboBox<String> combo_centro;
    private javax.swing.JComboBox<String> combo_localidad;
    private javax.swing.JComboBox<String> combo_provincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbInfo;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables

}
