/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.modelo.Persona;
import com.istloja.utilidad.Utilidades;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author johnp
 */
public class GestionPersona {

    private JTextField txtCedula;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private Utilidades utilidades;
    private JFrame frameGestionContable;
    private JComboBox jcbGenero;

    public GestionPersona(JTextField txtCedula, JTextField txtNombres, JTextField txtApellidos, JTextField txtDireccion, JTextField txtCorreo, JTextField txtTelefono, Utilidades utilidades, JFrame frameGestionContable, JComboBox jcbGenero) {
        this.txtCedula = txtCedula;
        this.txtNombres = txtNombres;
        this.txtApellidos = txtApellidos;
        this.txtDireccion = txtDireccion;
        this.txtCorreo = txtCorreo;
        this.txtTelefono = txtTelefono;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
        this.jcbGenero = jcbGenero;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public void limpiarCamposPersona() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtCedula.requestFocus();
        jcbGenero.setSelectedIndex(0);
    }

    public Persona guardarEditar(boolean isEditar) {
        if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombres.requestFocus();
            return null;
        }
        if (txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocus();
            return null;
        }
        if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo direccion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDireccion.requestFocus();
            return null;
        }
        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo telefono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return null;
        }
        if (!utilidades.validarNumeros(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return null;
        }
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return null;
        }
        if (!utilidades.validarCorreo(txtCorreo.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "El correo ingresado no es valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        persona.setGenero(jcbGenero.getSelectedIndex());
        if (isEditar) {
            persona.setFechaActualizacion(new Date());       
        }else{
            persona.setFechaRegistro(new Date());
        }

        return persona;
    }

}
