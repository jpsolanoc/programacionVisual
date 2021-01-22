/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class GestionPersonaV1 extends javax.swing.JFrame {

    private Utilidades utilidades;
    private Personabd controladorPersona;
    /**
     * Creates new form GestionPersonaV1
     */
    public GestionPersonaV1() {
        initComponents();
        utilidades = new Utilidades();
        controladorPersona = new Personabd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        panelCuerpoRegistro = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTraer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Personas");
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTitulo.setText("Resgistro personas");

        panelCuerpoRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuerpo Registro"));

        lblCedula.setText("Cedula:");

        lblNombre.setText("Nombres:");

        lblApellido.setText("Apellidos:");

        lblDireccion.setText("Direccion:");

        lblTelefono.setText("Telefono:");

        lblCorreo.setText("Correo:");

        javax.swing.GroupLayout panelCuerpoRegistroLayout = new javax.swing.GroupLayout(panelCuerpoRegistro);
        panelCuerpoRegistro.setLayout(panelCuerpoRegistroLayout);
        panelCuerpoRegistroLayout.setHorizontalGroup(
            panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido))
                        .addGap(23, 23, 23)
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos)))
                    .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion))
                    .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo))))
                .addContainerGap())
        );
        panelCuerpoRegistroLayout.setVerticalGroup(
            panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnEliminar.setText("Eliminar");

        btnTraer.setText("Traer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(64, 64, 64)
                .addComponent(btnEditar)
                .addGap(70, 70, 70)
                .addComponent(btnEliminar)
                .addGap(77, 77, 77)
                .addComponent(btnTraer)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnTraer))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo cedula no tiene datos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtCedula.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return;
        }
        if (!utilidades.validadorDeCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "la cedula ingresada no es valida","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo nombres no tiene datos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtNombres.requestFocus();
            return;
        }if (txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo apellidos no tiene datos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocus();
            return;
        }
        if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo direccion no tiene datos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtDireccion.requestFocus();
            return;
        }
        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo telefono no tiene datos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return;
        }
        if (!utilidades.validarNumeros(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados en el telefono no son validos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return;
        }
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo correo no tiene datos.","ERROR",JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return;
        }
        Persona persona = new Persona();
        persona.setCedula(txtCedula.getText());
        persona.setNombre(txtNombres.getText());
        persona.setApellidos(txtApellidos.getText());
        persona.setDireccion(txtDireccion.getText());
        persona.setCorreo(txtCorreo.getText());
        persona.setTelefono(txtTelefono.getText());
        System.out.println(persona.toString());
        if (controladorPersona.registrarPersona(persona)) {
            JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPersonaV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPersonaV1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnTraer;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelCuerpoRegistro;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
