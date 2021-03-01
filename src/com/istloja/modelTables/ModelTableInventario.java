/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.Persona;
import com.istloja.modelo.Inventario;
import com.istloja.vistas.GestionContable;
import java.util.LinkedList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author johnp
 */
public class ModelTableInventario extends AbstractTableModel {

    private String[] m_colNames = {"COD PRODUCTO", "DESCRIPCIÓN", "PRECIO COMPRA", "PRECIO VENTA", "CAN PRODUCTOS"};
    private List<Inventario> inventarios;
    private GestionContable gContable;

    public ModelTableInventario(List<Inventario> inventarios, GestionContable gContable) {
        this.inventarios = inventarios;
        this.gContable = gContable;
    }

    //Determina el número de filas que tengo en mi tabla.
    @Override
    public int getRowCount() {
        return inventarios.size();
    }

    //Determina el número de columnas que tengo en mi tabla.
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario proveedor = inventarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return proveedor.getCodProducto();
            case 1:
                return proveedor.getDescripcion();
            case 2:
                return proveedor.getPrecioCompra();
            case 3:
                return proveedor.getPrecioVenta();
            case 4:
                return proveedor.getCanProductos();
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gContable.clickInventario(inventarios.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    

  
}
