/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.apps;

import com.aplicacao.academia.DAL.ModuloConexao;
import com.aplicacao.academia.models.Pagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Mariano
 */
public class FuncoesPagamento {
    
    Connection conexao = ModuloConexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Pagamento PesquisaPagamento(int codigo){
        Pagamento pagamento = null;
        
        return pagamento;
    }
    
    public boolean ConfirmarPagamento (Pagamento pagamento){
        boolean pago = false;
        
        return pago;
    }
    
    public boolean AlteraPagamento (int codigo){
        boolean alterado = false;
        
        return alterado;
    }
    
    public boolean ExcluiPagamento (int codigo){
        boolean excluido = false;
        
        return excluido;
    }
    
}
