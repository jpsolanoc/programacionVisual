/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.conexionbd.Conexion;
import com.istloja.modelo.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.istloja.modelo.NotaVenta;
import com.istloja.utilidad.Utilidades;

/**
 *
 * @author jpsolanoc
 */
public class NotaVentadb {
    
     
    public Utilidades utilidades;

    public NotaVentadb() {
        utilidades = new Utilidades();
    }
    
    
     public boolean registrarNotaVenta(NotaVenta notaVenta) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        String sql;
        sql ="INSERT INTO `ejercicio`.`nota_venta` (`numero_nota_venta`, `persona_id_persona`, `fecha_venta`, `sub_total`, `iva`, `total`, `tipo_pago`) "
                + "VALUES "
                + "('"+notaVenta.getNumeroNotaVenta()+"',"
                + " '"+notaVenta.getPersonaIdPersona()+"', "
                + "'"+utilidades.devolverFecha(notaVenta.getFechaVenta())+"',"
                + " '"+notaVenta.getSubTotal()+"',"
                + " '"+notaVenta.getIva()+"', "
                + "'"+notaVenta.getTotal()+"',"
                + " '"+notaVenta.getTipoPago()+"');";
        try {
            //Es una instancia de la conexion previamente creada.
            Conexion conexion = new Conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }
    
}
