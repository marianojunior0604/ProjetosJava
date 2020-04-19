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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Cliente.findByFoneClinte", query = "SELECT c FROM Cliente c WHERE c.foneCliente = :foneCliente"),
    @NamedQuery(name = "Cliente.findByEndeCliente", query = "SELECT c FROM Cliente c WHERE c.endecliente = :endeCliente"),
    @NamedQuery(name = "Cliente.findByNiverCliente", query = "SELECT c FROM Cliente c WHERE c.niveCliente = :niveCliente")
})
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idCliente;
    
    @Basic(optional = false)
    @Column(name = "nomecliente")
    private String nomeCliente;
    
    @Basic(optional = false)
    @Column(name = "endecliente")
    private String endecliente;
    
    @Basic(optional = false)
    @Column(name = "fonecliente")
    private String foneCliente;
    
    @Basic(optional = false)
    @Column(name = "nivercliente")
    private String niveCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nomeCliente, String endecliente, String foneCliente, String niveCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endecliente = endecliente;
        this.foneCliente = foneCliente;
        this.niveCliente = niveCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndecliente() {
        return endecliente;
    }

    public void setEndecliente(String endecliente) {
        this.endecliente = endecliente;
    }

    public String getFoneCliente() {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public String getNiveCliente() {
        return niveCliente;
    }

    public void setNiveCliente(String niveCliente) {
        this.niveCliente = niveCliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.idCliente;
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }
    
    
    
}
