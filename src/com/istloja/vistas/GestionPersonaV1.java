/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class GestionPersonaV1 extends javax.swing.JFrame {

    private Utilidades utilidades;
    private Personabd controladorPersona;
    private Persona personaEditar;

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
        jButton1 = new javax.swing.JButton();
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

        jButton1.setText("Buscar");

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
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos)
                            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jButton1))))
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
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
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
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        btnTraer.setText("Traer");
        btnTraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
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
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Persona personaGuardar = guardarEditar();
        if (personaGuardar != null) {
            if (controladorPersona.registrarPersona(personaGuardar)) {
                JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public Persona guardarEditar() {
        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo cedula no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCedula.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
        if (!utilidades.validadorDeCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "la cedula ingresada no es valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombres.requestFocus();
            return null;
        }
        if (txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocus();
            return null;
        }
        if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo direccion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDireccion.requestFocus();
            return null;
        }
        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo telefono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return null;
        }
        if (!utilidades.validarNumeros(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return null;
        }
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return null;
        }
        if (!utilidades.validarCorreo(txtCorreo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El correo ingresado no es valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return null;
        }
        Persona persona = new Persona();
        persona.setCedula(txtCedula.getText());
        persona.setNombre(txtNombres.getText());
        persona.setApellidos(txtApellidos.getText());
        persona.setDireccion(txtDireccion.getText());
        persona.setCorreo(txtCorreo.getText());
        persona.setTelefono(txtTelefono.getText());
        return persona;
    }


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            if (controladorPersona.actualizar(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                limpiarCampos();
                personaEditar = null;
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnTraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerActionPerformed
        // TODO add your handling code here:
        List<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtCedula.setText(personaEditar.getCedula());
        txtNombres.setText(personaEditar.getNombre());
        txtApellidos.setText(personaEditar.getApellidos());
        txtDireccion.setText(personaEditar.getDireccion());
        txtCorreo.setText(personaEditar.getCorreo());
        txtTelefono.setText(personaEditar.getTelefono());
    }//GEN-LAST:event_btnTraerActionPerformed
    //Metodo para limpiar campos
    public void limpiarCampos() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtCedula.requestFocus();
    }

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
    private javax.swing.JButton jButton1;
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
