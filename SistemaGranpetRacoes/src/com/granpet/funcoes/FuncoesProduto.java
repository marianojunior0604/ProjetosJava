/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granpet.funcoes;

import com.granpet.DAL.ModuloConector;
import com.granpet.classes.Produto;
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
public class FuncoesProduto {
    
    Connection conexao = ModuloConector.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Produto produto = new Produto();
    
    public boolean CadastraProduto(Produto produto){
     boolean salvou = false;
        //System.out.println(produto.getNomeProduto());
     String sql = "INSERT INTO `tblproduto` (`nomeProduto`, `marcaProduto`, `tipoProduto`, `dataValidade`, `qtdEstoque`, `percentLuco`, `valorCompra`, `valorVenda`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, produto.getNomeProduto());
            pst.setString(2, produto.getMarcaProduto());
            pst.setString(3, produto.getTipoProduto());
            pst.setString(4, produto.getDataValidade());
            pst.setInt(5, produto.getQtdProduto());
            pst.setInt(6, produto.getLucroPercent());
            pst.setDouble(7, produto.getValorCompra());
            pst.setDouble(8, produto.getValorVenda());
            pst.execute();
            salvou = true;
            return salvou;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de dados " + e, "Alerta", 0);
            return salvou;
        }
    }
    
    public Produto BuscaProduto(String nome){
        String sql = "SELECT * FROM `tblproduto` WHERE `nomeProduto` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(0, nome);
            
            rs = pst.executeQuery();
            if (rs.next()) {
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setMarcaProduto(rs.getString("marcaProduto"));
                produto.setTipoProduto(rs.getString("tipoProduto"));
                produto.setDataValidade(rs.getString("dataValidade"));
                produto.setLucroPercent(rs.getInt("percentLuco"));
                produto.setQtdProduto(rs.getInt("qtdEstoque"));
                produto.setValorCompra(rs.getDouble("valorCompra"));
                produto.setValorVenda(rs.getDouble("valorVenda"));
                return produto;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não Encontrado", "Alerta", 0);
                return null;
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados " + e, "Atenção", 0);
            return null;
        }
    }
    
    public void AtualizaProduto(Produto produto){
        String sql = "UPDATE `tblproduto` SET `nomeProduto` = ?,`marcaProduto` = ?,`tipoProduto` = ?,`dataValidade` = ?,"
                + "`qtdEstoque` = ?,`percentLuco` = ?,`valorCompra` = ?,`valorVenda` = ? WHERE `idProduto` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, produto.getNomeProduto());
            pst.setString(2, produto.getMarcaProduto());
            pst.setString(3, produto.getTipoProduto());
            pst.setString(4, produto.getDataValidade());
            pst.setInt(5, produto.getQtdProduto());
            pst.setInt(6, produto.getLucroPercent());
            pst.setDouble(7, produto.getValorCompra());
            pst.setDouble(8, produto.getValorVenda());
            pst.setInt(9, produto.getIdProduto());
            JOptionPane.showMessageDialog(null, "Produto Atualizado com sucesso", "Atenção", 0);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Acessar o Banco de dados " + e, "Alerta", 0);
        }
    }
    
    public void ExcluiProduto(int idProduto){
        String sql = "DELETE FROM `tblproduto` WHERE `idProduto` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idProduto);
            boolean excluiu = pst.execute();
            if (excluiu) {
                JOptionPane.showMessageDialog(null, "Produto Excluido com sucesso", "Aviso", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir o Produto", "Aviso", 0);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados " + e, "Alerta", 0);
        }
    }
    
    public List<Produto> ListaProduto(){
        ArrayList produtos = new ArrayList();
        String sql = "SELECT * FROM `tblproduto`";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setMarcaProduto(rs.getString("marcaProduto"));
                produto.setTipoProduto(rs.getString("tipoProduto"));
                produto.setDataValidade(rs.getString("dataValidade"));
                produto.setLucroPercent(rs.getInt("percentLuco"));
                produto.setQtdProduto(rs.getInt("qtdEstoque"));
                produto.setValorCompra(rs.getDouble("valorCompra"));
                produto.setValorVenda(rs.getDouble("valorVenda"));
                produtos.add(produto);
            }
            return produtos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de dados " + e, "Alerta", 0);
            return null;
        }
    }
}
