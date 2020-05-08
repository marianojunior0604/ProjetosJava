/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granpet.funcoes;

import com.granpet.aplicacoes.Hash;
import com.granpet.DAL.ModuloConector;
import com.granpet.classes.Usuario;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class FuncoesUsuario {
    
    Connection conexao = ModuloConector.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Usuario usuario = new Usuario();
    
    public Usuario Logar(String login, String senha){
        String sql = "SELECT * FROM `tblusuario` WHERE `nomeUsuario` = ? AND `senhaUsuario` = ?";
        senha = Hash.toHexadecimal(senha.getBytes());
        String pass = "";
        try {
            pass = Hash.toMD5Hash(senha);
            //System.out.println(pass);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FuncoesUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, pass);
            
            rs = pst.executeQuery();
            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNomeUsuario(rs.getString("nomeUsuario"));
                usuario.setSenhaUsuario(rs.getString("senhaUsuario"));
                //logou = true;
                return usuario;
                
            }else{
                return usuario;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e, "Alerta", 0);
            return usuario;
        }
    }
    
    public boolean CadastraUsuario(Usuario usuario) throws NoSuchAlgorithmException{
        boolean cadastrou = false;
        String senhaHexa = Hash.toHexadecimal(usuario.getSenhaUsuario().getBytes());
        String senha = Hash.toMD5Hash(senhaHexa);
        String sql = "INSERT INTO `tblusuario` (`nomeUsuario`, `senhaUsuario`) VALUES (?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, senha);
            cadastrou = pst.execute();
            return cadastrou;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e, "Alerta", 0);
            return cadastrou;
        }
    }
    
    public Usuario PesquisaUsuario(String nome){
        String sql = "SELECT * FROM `tblusuario` WHERE `nomeUsuario` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNomeUsuario(rs.getString("nomeUsuario"));
                usuario.setSenhaUsuario(rs.getString("senhaUsuario"));
                return usuario;
            }
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e, "Alerta", 0);
            return null;
        }
    }
    
    public int AlterarUsuario(Usuario usuario) throws NoSuchAlgorithmException{
        int alterou = 0;
        String sql = "UPDATE `tblusuario` SET `nomeUsuario` = ?,`senhaUsuario` = ? WHERE `idUsuario` = ?";
        String senhaHexa = Hash.toHexadecimal(usuario.getSenhaUsuario().getBytes());
        String senha = Hash.toMD5Hash(senhaHexa);
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, senha);
            pst.setInt(3, usuario.getIdUsuario());
            alterou = pst.executeUpdate();
            return alterou;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e, "Alerta", 0);
            return alterou;
        }
    }
    
    public boolean ExcluiUsuario(int idUsuario){
        boolean excluiu = false;
        String sql = "DELETE FROM `tblusuario` WHERE `idUsuario` = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idUsuario);
            excluiu = pst.execute();
            return excluiu;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e, "Alerta", 0);
            return excluiu;
        }
    }
    
}
