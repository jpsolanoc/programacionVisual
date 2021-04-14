/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

import java.util.Date;

/**
 *
 * @author johnp
 */
public class Inventario {

    private int idInventario;
    private String codProducto;
    private int canProductos;
    private String descripcion;
    private double precioCompraSinIva;
    private double precioCompraConIva;
    private double precioMayorista;
    private double precioClienteFijo;
    private double precioClienteNormal;
    private Date fechaCaducidad;
    private Date fechaRegistro;
    private Date fechaActualizacion;

    //Atributo temporal para definir el numero de productos seleccionados por el cliente.
    private int cantidadProductosVender;

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public int getCanProductos() {
        return canProductos;
    }

    public void setCanProductos(int canProductos) {
        this.canProductos = canProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompraSinIva() {
        return precioCompraSinIva;
    }

    public void setPrecioCompraSinIva(double precioCompraSinIva) {
        this.precioCompraSinIva = precioCompraSinIva;
    }

    public double getPrecioCompraConIva() {
        return precioCompraConIva;
    }

    public void setPrecioCompraConIva(double precioCompraConIva) {
        this.precioCompraConIva = precioCompraConIva;
    }

    public double getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(double precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public double getPrecioClienteFijo() {
        return precioClienteFijo;
    }

    public void setPrecioClienteFijo(double precioClienteFijo) {
        this.precioClienteFijo = precioClienteFijo;
    }

    public double getPrecioClienteNormal() {
        return precioClienteNormal;
    }

    public void setPrecioClienteNormal(double precioClienteNormal) {
        this.precioClienteNormal = precioClienteNormal;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getCantidadProductosVender() {
        return cantidadProductosVender;
    }

    public void setCantidadProductosVender(int cantidadProductosVender) {
        this.cantidadProductosVender = cantidadProductosVender;
    }

    
    
    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", codProducto=" + codProducto + ", canProductos=" + canProductos + ", descripcion=" + descripcion + ", precioCompraSinIva=" + precioCompraSinIva + ", precioCompraConIva=" + precioCompraConIva + ", precioMayorista=" + precioMayorista + ", precioClienteFijo=" + precioClienteFijo + ", precioClienteNormal=" + precioClienteNormal + ", fechaCaducidad=" + fechaCaducidad + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + '}';
    }

}
