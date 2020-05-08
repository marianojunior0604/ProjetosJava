/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granpet.classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Junior
 */
public class ModeloTabela extends AbstractTableModel {
    
    private List<Cliente> clientes = new ArrayList();
    private int ncolunas;

    public int getNcolunas() {
        return ncolunas;
    }

    public void setNcolunas(int ncolunas) {
        this.ncolunas = ncolunas;
    }
    
    public ModeloTabela(){
        
    }
    
    public String getColumnName(String[] nomes){
        return "";
    }
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return ncolunas;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Cliente c = clientes.get(i);
        return c;
    }
    
    public void adicionar(Cliente c){
        clientes.add(c);
        fireTableRowsInserted(clientes.size() - 1, clientes.size() - 1);
    }
    
}
