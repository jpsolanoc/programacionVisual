/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.modelo.Inventario;
import com.istloja.conexionbd.Conexion;
import com.istloja.utilidad.Utilidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author johnp
 */
public class Inventariodb {
    // Registrar persona en la base de datos.

    private Utilidades utilidades;

    public Inventariodb() {
        this.utilidades = new Utilidades();
    }

    public boolean registrarProducto(Inventario inventario) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        //INSERT INTO `ejercicio`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('1', '1104268899', 'John', 'Solano', 'Loja', 'jpsolanoc@gmail.com', '072587392');
        String sql;
        System.out.println("FechaCaducidad:" + inventario.getFechaCaducidad());
        if (inventario.getFechaCaducidad() != null) {
            sql = "INSERT INTO `ejercicio`.`inventario` (`cod_producto`, `can_producto`, `descripcion`, `precio_compra_sin_iva`, `precio_compra_con_iva`, `precio_mayorista`, `precio_cliente_fijo`, `precio_cliente_normal`, `fecha_caducidad`, `fecha_registro`, `fecha_actualizacion`) VALUES ("
                    + "'" + inventario.getCodProducto() + "', "
                    + "'" + inventario.getCanProductos() + "', "
                    + "'" + inventario.getDescripcion() + "', "
                    + "'" + inventario.getPrecioCompraSinIva() + "', "
                    + "'" + inventario.getPrecioCompraConIva() + "', "
                    + "'" + inventario.getPrecioMayorista() + "', "
                    + "'" + inventario.getPrecioClienteFijo() + "', "
                    + "'" + inventario.getPrecioClienteNormal() + "', "
                    + "'" + inventario.getFechaCaducidad() + "', "
                    + "'" + inventario.getFechaRegistro() + "', "
                    + "'" + inventario.getFechaActualizacion() + "');";
        } else {
            sql = "INSERT INTO `ejercicio`.`inventario` (`cod_producto`, `can_producto`, `descripcion`, `precio_compra_sin_iva`, `precio_compra_con_iva`, `precio_mayorista`, `precio_cliente_fijo`, `precio_cliente_normal`, `fecha_registro`, `fecha_actualizacion`) VALUES ("
                    + "'" + inventario.getCodProducto() + "', "
                    + "'" + inventario.getCanProductos() + "', "
                    + "'" + inventario.getDescripcion() + "', "
                    + "'" + inventario.getPrecioCompraSinIva() + "', "
                    + "'" + inventario.getPrecioCompraConIva() + "', "
                    + "'" + inventario.getPrecioMayorista() + "', "
                    + "'" + inventario.getPrecioClienteFijo() + "', "
                    + "'" + inventario.getPrecioClienteNormal() + "', "
                    + "'" + utilidades.devolverFecha(new Date()) + "', "
                    + "'" + utilidades.devolverFecha(new Date()) + "');";
        }

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

    //ACtualizar la persona e la base de datos.
    public boolean actualizarInventario(Inventario inventario) {
        System.out.println("Actualizar:" + inventario);
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion      
        String sql;
        if (inventario.getFechaCaducidad() != null) {
            sql = "UPDATE `ejercicio`.`inventario` SET "
                    + "`cod_producto` = '" + inventario.getCodProducto() + "', "
                    + "`can_producto` = '" + inventario.getCanProductos() + "', "
                    + "`descripcion` = '" + inventario.getDescripcion() + "', "
                    + "`precio_compra_sin_iva` = '" + inventario.getPrecioCompraSinIva() + "', "
                    + "`precio_compra_con_iva` = '" + inventario.getPrecioCompraConIva() + "', "
                    + "`precio_mayorista` = '" + inventario.getPrecioMayorista() + "', "
                    + "`precio_cliente_fijo` = '" + inventario.getPrecioClienteFijo() + "', "
                    + "`precio_cliente_normal` = '" + inventario.getPrecioClienteNormal() + "', "
                    + "`fecha_caducidad` = '" + utilidades.devolverFecha(inventario.getFechaCaducidad()) + "', "
                    + "`fecha_registro` = '" + utilidades.devolverFecha(new Date()) + "', "
                    + "`fecha_actualizacion` = '" + utilidades.devolverFecha(new Date()) + "' WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
        } else {
            sql = "UPDATE `ejercicio`.`inventario` SET "
                    + "`cod_producto` = '" + inventario.getCodProducto() + "', "
                    + "`can_producto` = '" + inventario.getCanProductos() + "', "
                    + "`descripcion` = '" + inventario.getDescripcion() + "', "
                    + "`precio_compra_sin_iva` = '" + inventario.getPrecioCompraSinIva() + "', "
                    + "`precio_compra_con_iva` = '" + inventario.getPrecioCompraConIva() + "', "
                    + "`precio_mayorista` = '" + inventario.getPrecioMayorista() + "', "
                    + "`precio_cliente_fijo` = '" + inventario.getPrecioClienteFijo() + "', "
                    + "`precio_cliente_normal` = '" + inventario.getPrecioClienteNormal() + "', "
                    + "`fecha_registro` = '" + utilidades.devolverFecha(new Date()) + "', "
                    + "`fecha_actualizacion` = '" + utilidades.devolverFecha(new Date()) + "' WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
        }
        try {
            Conexion con = new Conexion();
            connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }

    //Eliminar una persona en base al ID de la persona seleccionada de la base de datos.
    public boolean eliminarInventario(Inventario inventario) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `ejercicio`.`inventario` WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
        try {
            connect = new Conexion().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }

//     //Sirve para traer todos los registros de persona de la base de datos 
    public List<Inventario> obtenerProductosInventarioCodigo(String codigo) {
        System.out.println("BusquedaCodigo" + codigo);
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario where cod_producto = '" + codigo + "';";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCanProductos(rs.getInt(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIva(rs.getDouble(5));
                c.setPrecioCompraConIva(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFijo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaInventario;
    }

    public List<Inventario> obtenerProductosInventarioDescripcion(String descripcion) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario where descripcion like \"%" + descripcion + "%\"";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                 c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCanProductos(rs.getInt(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIva(rs.getDouble(5));
                c.setPrecioCompraConIva(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFijo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaInventario;
    }

    public List<Inventario> obtenerProductosInventario() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario;";
        List<Inventario> listaProveedores = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCanProductos(rs.getInt(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIva(rs.getDouble(5));
                c.setPrecioCompraConIva(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFijo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaProveedores;
    }
    
        public Inventario obtenerProductosInventarioCodigoVenta(String codigo) {
        System.out.println("BusquedaCodigo" + codigo);
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario where cod_producto = '" + codigo + "';";
       Inventario c = null;
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCanProductos(rs.getInt(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIva(rs.getDouble(5));
                c.setPrecioCompraConIva(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFijo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return c;
    }


}
