/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.classes;

/**
 *
 * @author Mariano
 */
public class FormataData {
    
    public String FormataData(String data){
        String dataFormatada;
        
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6);
        
        dataFormatada = ano + "-" + mes + "-" + dia;
        
        return dataFormatada;
    }
    
    public String DataBr(String dataFormatada){
        String data;
        String ano = dataFormatada.substring(0, 4);
        String mes = dataFormatada.substring(5, 6);
        String dia = dataFormatada.substring(7);
        data = dia  + "/" + mes + "/" + ano;
        return data;
    }
    
}
