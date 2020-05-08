/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granpet.funcoes;

import com.granpet.DAL.ModuloConector;
import com.granpet.classes.Cliente;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class FuncoesCliente {

    Connection conexao = ModuloConector.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Cliente cliente = new Cliente();

    public boolean SalvaCliente(Cliente cliente) {
        String sql = "INSERT INTO `tblcliente` (`nomeCliente`, `racaCliente`, `aniversarioCliente`, `proprietarioCliente`, `enderecoCliente`, `foneCliente`, `anotacoesCliente`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        //boolean salvou = false;
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNomeCliente());
            pst.setString(2, cliente.getRacaCliente());
            pst.setString(3, cliente.getDataNascimento());
            pst.setString(4, cliente.getProprCliente());
            pst.setString(5, cliente.getEnderecoCliente());
            pst.setString(6, cliente.getFoneCliente());
            pst.setString(7, cliente.getObsCliente());

            boolean salvo = pst.execute();
            if (salvo) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar as informações" + e, "Alerta", 1);
            return false;
        }
    }

    public Cliente PesquisaCliente(String nome) {
        String sql = "SELECT * FROM `tblcliente` WHERE `nomeCliente` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            //System.out.println(rs.next());
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                //System.out.println(rs.getInt(1));
                cliente.setNomeCliente(rs.getString(2));
                cliente.setRacaCliente(rs.getString(4));
                cliente.setProprCliente(rs.getString(5));
                cliente.setFoneCliente(rs.getString(6));

                //System.out.println(cliente.getIdCliente());
                return cliente;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Alerta", 0);
                return null;
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados" + e, "Atenção", 0);
            return null;
        }
    }

    public boolean ExcluiCliente(int idCliente) {
        String sql = "DELETE FROM `tblcliente` WHERE `idCliente` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idCliente);

            boolean exclui = pst.execute();
            if (exclui) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados" + e, "Atenção", 0);
            return false;
        }
    }
    
    public void AtualizaCliente(Cliente cliente){
        String sql = "UPDATE `tblcliente` SET `nomeCliente` = ?,`idadeCliente` = ?,`racaCliente` = ?,`proprietarioCliente` = ?,`foneCliente` = ?,`tipoServico` = ?,`precoServico` = ? WHERE  `idCliente` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cliente.getNomeCliente());
            pst.setString(3, cliente.getRacaCliente());
            pst.setString(4, cliente.getProprCliente());
            pst.setString(5, cliente.getFoneCliente());
            pst.setInt(8, cliente.getIdCliente());
            
            boolean atualizou = pst.execute();
            if (atualizou) {
                JOptionPane.showMessageDialog(null, "Cliente ataulizado com sucesso", "Alerta", 0);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados" + e, "Atenção", 0);
        }
    }

    public List<Cliente> ListaCliente(){
        ArrayList clientes = new ArrayList();
        String sql = "SELECT * FROM `tblcliente`";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRacaCliente(rs.getString("racaCliente"));
                cliente.setProprCliente(rs.getString("proprietarioCliente"));
                cliente.setFoneCliente(rs.getString("foneCliente"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de dados " + e, "Atenção", 0);
            return null;
        }
    }
    
    public List<Cliente> TabelaClientes(){
        ArrayList clientes = new ArrayList();
        String sql = "SELECT * FROM `tblcliente`";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRacaCliente(rs.getString("racaCliente"));
                cliente.setProprCliente(rs.getString("proprietarioCliente"));
                cliente.setFoneCliente(rs.getString("foneCliente"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de dados " + e, "Atenção", 0);
            return null;
        }
    }
    
}
