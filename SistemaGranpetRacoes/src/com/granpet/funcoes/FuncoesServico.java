/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granpet.funcoes;

import com.granpet.DAL.ModuloConector;
import com.granpet.classes.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Junior
 */
public class FuncoesServico {
    
    Connection conexao = ModuloConector.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    Servico servico = new Servico();
    
    public void CadastraServico(int idCliente, String dataServico, String tipoServico, double valor){
        String sql = "INSERT INTO `tblservico`(`idclienteservico`, `dataservico`, `tiposervico`, `valorservico`) VALUES (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
        } catch (Exception e) {
        }
    }
    
}
