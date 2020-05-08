/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granpet.DAL;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class CapturaEndereco {
    
    private String banco;
    private String usuario;
    private String senha;
    private String caminho;
     
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
      this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        Path cmn = Paths.get("DadosExtras/User.txt");
        try {
            byte[] txt = Files.readAllBytes(cmn);
            String user = new String(txt);
            this.usuario = user;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados, Nome de usuario erro:" + e);
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Path cmn = Paths.get("DadosExtras/Senha.txt");
        try {
            byte[] txt = Files.readAllBytes(cmn);
            String pass = new String(txt);
            this.senha = pass;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados, Senha do banco erro:" + e);
        }
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        Path cmn = Paths.get("DadosExtras/Endereco.txt");
        try {
            byte[] txt = Files.readAllBytes(cmn);
            String end = new String(txt);
            this.caminho = end;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar o banco de dados, Caminho especificado erro:" + e);
        }
    }
    
}
