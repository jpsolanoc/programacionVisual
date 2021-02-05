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
public class GestionContable extends javax.swing.JFrame {

    private Utilidades utilidades;
    private Personabd controladorPersona;
    private Persona personaEditarEliminar;
    private GestionPersona gestionPersona;
    
    /**
     * Creates new form GestionPersonaV1
     */
    public GestionContable() {
        initComponents();
        utilidades = new Utilidades();
        controladorPersona = new Personabd();
        gestionPersona = new GestionPersona(txtCedula, txtNombres, txtApellidos, txtDireccion, txtCorreo, txtTelefono,utilidades,this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabGeneral = new javax.swing.JTabbedPane();
        panelCliente = new javax.swing.JPanel();
        txtTituloCliente = new javax.swing.JLabel();
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
        btnBuscarCedula = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTraer = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollCliente = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        lblBuscarCliente = new javax.swing.JLabel();
        comboParametroBusqueda = new javax.swing.JComboBox<>();
        txtParametroBusqueda = new javax.swing.JTextField();
        btnBuscarPersona = new javax.swing.JButton();
        panelProveedores = new javax.swing.JPanel();
        txtTituloProveedores = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        txtTituloInventario = new javax.swing.JLabel();
        panelVenta = new javax.swing.JPanel();
        txtTituloVenta = new javax.swing.JLabel();
        menuGeneral = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuBuscarPersona = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Personas");
        setResizable(false);

        txtTituloCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTituloCliente.setText("Resgistro personas");

        panelCuerpoRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuerpo Registro"));

        lblCedula.setText("Cedula:");

        lblNombre.setText("Nombres:");

        lblApellido.setText("Apellidos:");

        lblDireccion.setText("Direccion:");

        lblTelefono.setText("Telefono:");

        lblCorreo.setText("Correo:");

        txtCedula.setToolTipText("Ingrese una cédula correcta.");

        btnBuscarCedula.setText("Buscar");
        btnBuscarCedula.setToolTipText("Buscar persona por cédula.");
        btnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar Apellido");

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
                            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarCedula))
                            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(btnBuscarCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido)
                    .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
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
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnTraer.setText("Traer");
        btnTraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Formulario");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollCliente.setViewportView(tablaCliente);

        lblBuscarCliente.setText("Buscar Cliente");

        comboParametroBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombres", "Apellidos", "Telefono", "Correo" }));

        btnBuscarPersona.setText("Buscar");

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtTituloCliente))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnGuardar)
                        .addGap(67, 67, 67)
                        .addComponent(btnEditar)
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminar)
                        .addGap(49, 49, 49)
                        .addComponent(btnTraer)
                        .addGap(62, 62, 62)
                        .addComponent(btnLimpiar))
                    .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelClienteLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lblBuscarCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtParametroBusqueda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscarPersona))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelClienteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnTraer)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGap(8, 8, 8)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarCliente)
                    .addComponent(comboParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabGeneral.addTab("Clientes", panelCliente);

        txtTituloProveedores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTituloProveedores.setText("Resgistro proveedores");

        javax.swing.GroupLayout panelProveedoresLayout = new javax.swing.GroupLayout(panelProveedores);
        panelProveedores.setLayout(panelProveedoresLayout);
        panelProveedoresLayout.setHorizontalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedoresLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txtTituloProveedores)
                .addContainerGap(874, Short.MAX_VALUE))
        );
        panelProveedoresLayout.setVerticalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloProveedores)
                .addContainerGap(826, Short.MAX_VALUE))
        );

        tabGeneral.addTab("Proveedores", panelProveedores);

        txtTituloInventario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTituloInventario.setText("Resgistro inventario");

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txtTituloInventario)
                .addContainerGap(902, Short.MAX_VALUE))
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloInventario)
                .addContainerGap(826, Short.MAX_VALUE))
        );

        tabGeneral.addTab("Inventario", panelInventario);

        txtTituloVenta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTituloVenta.setText("Resgistro de venta");

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txtTituloVenta)
                .addContainerGap(913, Short.MAX_VALUE))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloVenta)
                .addContainerGap(826, Short.MAX_VALUE))
        );

        tabGeneral.addTab("Venta", panelVenta);

        menuArchivo.setText("Archivo");

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        jMenu2.setText("Acciones Persona");

        menuBuscarPersona.setText("Buscar");
        menuBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarPersonaActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscarPersona);

        menuArchivo.add(jMenu2);

        menuGeneral.add(menuArchivo);

        menuEditar.setText("Editar");
        menuGeneral.add(menuEditar);

        jMenu1.setText("Acerca de");
        menuGeneral.add(jMenu1);

        setJMenuBar(menuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabGeneral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabGeneral)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (controladorPersona.getPersonaCedula(txtCedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "La persona con ese número de cédula ya se encuentra registrada en el sistema.");
        } else {
            Persona personaGuardar = gestionPersona.guardarEditar();
            if (personaGuardar != null) {
                if (controladorPersona.registrarPersona(personaGuardar)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
                    gestionPersona.limpiarCamposPersona();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed



    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (personaEditarEliminar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditarEliminar.getIdPersona());
            if (controladorPersona.actualizar(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                gestionPersona.limpiarCamposPersona();
                personaEditarEliminar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnTraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerActionPerformed
        // TODO add your handling code here:
        List<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditarEliminar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtCedula.setText(personaEditarEliminar.getCedula());
        txtNombres.setText(personaEditarEliminar.getNombre());
        txtApellidos.setText(personaEditarEliminar.getApellidos());
        txtDireccion.setText(personaEditarEliminar.getDireccion());
        txtCorreo.setText(personaEditarEliminar.getCorreo());
        txtTelefono.setText(personaEditarEliminar.getTelefono());
    }//GEN-LAST:event_btnTraerActionPerformed

    public void buscarPersonaPorCedula(){
       Persona persona = controladorPersona.getPersonaCedula(txtCedula.getText());
        if (persona != null) {
            txtNombres.setText(persona.getNombre());
            txtApellidos.setText(persona.getApellidos());
            txtDireccion.setText(persona.getDireccion());
            txtCorreo.setText(persona.getCorreo());
            txtTelefono.setText(persona.getTelefono());
            personaEditarEliminar = persona;
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro la persona con ese número de cédula en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCedula.setText("");
            txtCedula.requestFocus();
        } 
    }
    
    private void btnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaActionPerformed
        // TODO add your handling code here:
        buscarPersonaPorCedula();
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed
    //Eliminar una persona de la base de datos.
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:asdasd
        if (personaEditarEliminar != null) {
            if (controladorPersona.eliminar(personaEditarEliminar)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada con éxito del sitema.");
                gestionPersona.limpiarCamposPersona();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar la persona seleccionada.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay persona seleccionada para eliminar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        gestionPersona.limpiarCamposPersona();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarPersonaActionPerformed
        // TODO add your handling code here:
        buscarPersonaPorCedula();
    }//GEN-LAST:event_menuBuscarPersonaActionPerformed
    //Metodo para limpiar campos
   

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
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCedula;
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTraer;
    private javax.swing.JComboBox<String> comboParametroBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollCliente;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscarCliente;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuBuscarPersona;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuBar menuGeneral;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelCuerpoRegistro;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JTabbedPane tabGeneral;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTituloCliente;
    private javax.swing.JLabel txtTituloInventario;
    private javax.swing.JLabel txtTituloProveedores;
    private javax.swing.JLabel txtTituloVenta;
    // End of variables declaration//GEN-END:variables
}