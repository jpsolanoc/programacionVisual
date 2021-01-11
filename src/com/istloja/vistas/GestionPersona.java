/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author johnp
 */
public class GestionPersona extends JFrame{
    
    private JPanel panel = new JPanel();

    public GestionPersona() {
        //Mostrar Pantalla
        this.show();
        //Titulo de la venta
        this.setTitle("Ventana");
        //Tamanio Inicial de la venta
        this.setSize(400,600);
        //Se agregar un layout distribuir los componentes.
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("VENTA DE REGISTRO DE PERSONAS.");  
        JButton button = new JButton();  
        button.setText("REGISTRAR PERSONAS");  
        panel.add(label);
        panel.add(button);
        //Agrege el panel al Jframe
        this.add(panel);
        //Centrar la pantalla
        this.setLocationRelativeTo(null);  
        //Fin al programa.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       
    }
    
    
    
}
