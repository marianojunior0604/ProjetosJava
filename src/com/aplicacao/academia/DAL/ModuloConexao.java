/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.DAL;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class ModuloConexao {
    
    CapturaEndereco ce = new CapturaEndereco();
    static Path endeConf = Paths.get("C:/arquivo/Config.txt");
    static String endereco = CapturaEndeConfi();
    static String nomebanc = CapturaEndeConfi();
    static String userbanc = CapturaEndeConfi();
    static String passbanc = CapturaEndeConfi();
    static String camBanco = endereco + "Ender.txt";
    static String nomBanco = nomebanc + "Banco.txt";
    static String usuBanco = userbanc + "User.txt";
    static String senBanco = passbanc + "Senha.txt";
    static Path cmnBanco = Paths.get(nomBanco);
    static Path cmnUsers = Paths.get(usuBanco);
    static Path cmnSenha = Paths.get(senBanco);
    static Path cmnEnder = Paths.get(camBanco);
    
    
    public static String CapturaEndeConfi(){
        try {
            byte[] endeConfi = Files.readAllBytes(endeConf);
            String endereco = new String(endeConfi);
            return endereco;
        } catch (Exception e) {
            return "Erro ao encontrar o arquivo " + e;
        }
    }

    public static String CapturaNomeBanco() {

        try {
            byte[] nomedba = Files.readAllBytes(cmnBanco);
            String msg = new String(nomedba);
            //nomeBanco = msg;
            return msg;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao encontrar o arguivo" + e);
            return "Erro ao encontrar o arguivo " + e;
        }
    }

    public static String CapturaUserBanco() {
        try {
            byte[] nomedba = Files.readAllBytes(cmnUsers);
            String msg = new String(nomedba);
            //nomeBanco = msg;
            return msg;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao encontrar o arguivo" + e);
            return "Erro ao encontrar o arguivo " + e;
        }
    }

    public static String CapturaSenhaBanco() {
        try {
            byte[] nomedba = Files.readAllBytes(cmnSenha);
            String msg = new String(nomedba);
            //nomeBanco = msg;
            return msg;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao encontrar o arguivo" + e);
            return "Erro ao encontrar o arguivo " + e;
        }
    }

    public static String CapturaEndeBanco() {
        try {
            byte[] nomedba = Files.readAllBytes(cmnEnder);
            String msg = new String(nomedba);
            //nomeBanco = msg;
            return msg;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao encontrar o arguivo" + e);
            return "Erro ao encontrar o arguivo " + e;
        }
    }

    public static Connection conector() {

        java.sql.Connection conexao = null;

        String nomeBanco = CapturaNomeBanco();
        String nomeUsers = CapturaUserBanco();
        String senhaUser = CapturaSenhaBanco();
        String enderedba = CapturaEndeBanco();

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://"+ enderedba + "/" + nomeBanco;
        //return url;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, nomeUsers, senhaUser);
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
}
