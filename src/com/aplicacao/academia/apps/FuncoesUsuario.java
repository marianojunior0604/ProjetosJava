/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.apps;

import com.aplicacao.academia.DAL.ModuloConexao;
import com.aplicacao.academia.models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class FuncoesUsuario {
    Connection conexao = ModuloConexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean CadastraUsuario(Usuario usuario){
        boolean adicionado = false;
        String sql = "INSERT INTO `usuario` (`usuarionome`, `loguinusuario`, `senhausuario`, `perfilusuario`) VALUES (?, ?, ?, ?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, usuario.getLoginUsuario());
            pst.setString(3, usuario.getSenhaUsuario());
            pst.setString(4, usuario.getTipoUsuario());
            
            pst.execute();
            
            adicionado = true;
            return adicionado;
        } catch (Exception e) {
            
            return adicionado;
        }
    }
    
    public boolean AtualizaUsuario(Usuario usuario){
        boolean atualizou = false;
        String sql = "UPDATE `usuario` SET `usuarionome` = ?, `loguinusuario` = ?, `senhausuario` = ?, `perfilusuario` = ? WHERE `idusuario` = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, usuario.getLoginUsuario());
            pst.setString(3, usuario.getSenhaUsuario());
            pst.setString(4, usuario.getTipoUsuario());
            pst.setInt(5, usuario.getIdUsuario());
            pst.executeLargeUpdate();
            atualizou = true;
            return atualizou;
        } catch (Exception e) {
            return atualizou;
        }
    }
    
    public Usuario PesquisaUsuario(String nome){
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM `usuario` WHERE `usuarionome` = ?";
        //System.out.println(sql);
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                //System.out.println();
                int idusuario = rs.getInt(1);
                String nomeusuario = rs.getString(2);
                String loginusuario = rs.getString(3);
                String senhausuario = rs.getString(4);
                String tipousuario = rs.getString(5);
                
                usuario.setIdUsuario(idusuario);
                usuario.setNomeUsuario(nomeusuario);
                usuario.setLoginUsuario(loginusuario);
                usuario.setSenhaUsuario(senhausuario);
                usuario.setTipoUsuario(tipousuario);
                return usuario;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado", "Atenção", 1);
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean ExcluirUsuario(int idUsuario){
        boolean excluido = false;
        String sql = "DELETE FROM `usuario` WHERE `idusuario` = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idUsuario);
            pst.execute();
            excluido = true;
            return excluido;
        } catch (Exception e) {
            return excluido;
        }
    }
    
}
