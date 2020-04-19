/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mariano
 */

@Entity
@Table(name = "pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p"),
    @NamedQuery(name = "Pagamento.findByIdPagamento", query = "SELECT p FROM Pagamento p WHERE p.idPagamento = :idPagamento"),
    @NamedQuery(name = "Pagamento.findByPagamentoIdUsuario", query = "SELECT p FROM Pagamento p WHERE p.usuarioIdPagamento = :usuarioIdPagamento"),
    @NamedQuery(name = "Pagamento.findByDataPagamento", query = "SELECT p FROM Pagamento p WHERE p.dataPagamento = :dataPagamento"),
    @NamedQuery(name = "Pagamento.findByValorPagamento", query = "SELECT p FROM Pagamento p WHERE p.valorPagamento = :valorPagamento"),
    @NamedQuery(name = "Pagamento.findByMesReferencia", query = "SELECT p FROM Pagamento p WHERE p.mesReferencia = : mesReferencia")
})
public class Pagamento implements Serializable{
    
    @Id
    @Column(name = "idpagamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idPagamento;
    
    @Basic(optional = false)
    @Column(name = "usuario_idusuario")
    private int usuarioIdPagamento;
    
    @Basic(optional = false)
    @Column(name = "datapagamento")
    private String dataPagamento;
    
    @Basic(optional = false)
    @Column(name = "valorpagamento")
    private float valorPagamento;
    
    @Basic(optional = false)
    @Column(name = "mesreferencia")
    private String mesReferencia;

    public Pagamento() {
    }

    public Pagamento(int idPagamento, int usuarioIdPagamento, String dataPagamento, float valorPagamento, String mesReferencia) {
        this.idPagamento = idPagamento;
        this.usuarioIdPagamento = usuarioIdPagamento;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
        this.mesReferencia = mesReferencia;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public int getUsuarioIdPagamento() {
        return usuarioIdPagamento;
    }

    public void setUsuarioIdPagamento(int usuarioIdPagamento) {
        this.usuarioIdPagamento = usuarioIdPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.idPagamento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pagamento other = (Pagamento) obj;
        if (this.idPagamento != other.idPagamento) {
            return false;
        }
        return true;
    }
    
    
    
}
