/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.apps;

import com.aplicacao.academia.DAL.ModuloConexao;
import com.aplicacao.academia.classes.FormataData;
import com.aplicacao.academia.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class FuncoesCliente {

    Connection conexao = ModuloConexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean CadastraCliente(Cliente cliente) {
        boolean cadastrou = false;
        String sql = "INSERT INTO `cliente` (`nomecliente`, `fonecliente`, `nivercliente`, `endecliente`) VALUES (?, ?, ?, ?)";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNomeCliente());
            pst.setString(2, cliente.getFoneCliente());
            pst.setString(3, cliente.getNiveCliente());
            pst.setString(4, cliente.getEndecliente());

            boolean salvou = pst.execute();
            System.out.println(salvou);
            if (salvou != true) {
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso", "Aviso", 1);
                cadastrou = true;
                return cadastrou;
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Cliente", "Alerta", 1);
                return cadastrou;
            }
        } catch (Exception e) {
            return cadastrou;
        }
    }

    public Cliente PesquisaCliente(String nome){
        Cliente cl = new Cliente();
        String sql = "SELECT * FROM `cliente` WHERE `nomecliente` = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            
            rs = pst.executeQuery();
            if (rs.next()) {
                cl.setIdCliente(rs.getInt(1));
                cl.setNomeCliente(rs.getString(2));
                cl.setFoneCliente(rs.getString(3));
                cl.setNiveCliente(rs.getString(4));
                cl.setEndecliente(rs.getString(5));
                
                return cl;
            }else{
                cl = null;
                return cl;
            }
        } catch (Exception e) {
            cl = null;
            return cl;
        }
    }
    
    public boolean AtualizaCliente(Cliente cliente){
        boolean atualizou;
        String sql = "UPDATE `cliente` SET `nomecliente` = ?,`fonecliente` = ?,`nivercliente` = ?,`endecliente` = ? WHERE `idcliente` = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNomeCliente());
            pst.setString(2, cliente.getFoneCliente());
            pst.setString(3, cliente.getNiveCliente());
            pst.setString(4, cliente.getEndecliente());
            pst.setInt(5, cliente.getIdCliente());
            
            pst.executeUpdate();
            atualizou = true;
            return atualizou;
        } catch (Exception e) {
            atualizou = false;
            return atualizou;
        }
    }
    
    public boolean ExcluiCliente(int codigoCliente){
        boolean excluido = false;
        String sql = "DELETE FROM `cliente` WHERE `idcliente` = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, codigoCliente);
            
            pst.execute();
            excluido = true;
            return excluido;
        } catch (Exception e) {
            return excluido;
        }
    }
    
    public List<Cliente> CarregaCliente(){
        Cliente cl = new Cliente();
        String sql = "SELECT * FROM `cliente`";
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                cl.setIdCliente(rs.getInt(1));
                cl.setNomeCliente(rs.getString(2));
                cl.setFoneCliente(rs.getString(3));
                cl.setEndecliente(rs.getString(5));
                FormataData fd = new FormataData();
                String data = fd.DataBr(rs.getString(4));
                cl.setNiveCliente(data);
                clientes.add(cl);
            }
            return clientes;
        } catch (Exception e) {
            clientes = null;
            return clientes;
        }
    }
    
}
