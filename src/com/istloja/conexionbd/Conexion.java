/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class Conexion {
    private Connection conexion;
    //declaramos los dadtos de conexion
    private static final String user = "userclases";
    private static final String pass = "12345678$";
    private static final String url = "jdbc:mysql://localhost:3306/ejercicio";

    public Connection conectarBaseDatos() {
        //reseteamos null a la conexion de la BD
        conexion = null;
        try {
            //conexion a la BD
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("ErrorConexion: " + e.getMessage());
        }
        return conexion;
    }
}
