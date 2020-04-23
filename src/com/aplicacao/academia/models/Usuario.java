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
@Table (name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByNomeUsuario", query = "SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario"),
    @NamedQuery(name = "Usuario.findByLoginUsuario", query = "SELECT u FROM Usuario u WHERE u.loginUsuario = :loginUsuario"),
    @NamedQuery(name = "Usuario.findBySenhaUsuario", query = "SELECT u FROM Usuario u WHERE u.senhaUsuario = :senhaUsuario"),
    @NamedQuery(name = "Usuario.findBySenhaUsuario", query = "SELECT u FROM Usuario u WHERE u.tipoUsuario = :tipoUsuario")
})
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idUsuario;
    
    @Basic(optional = false)
    @Column(name = "usuarionome")
    private String nomeUsuario;
    
    @Basic(optional = false)
    @Column(name = "loguinusuario")
    private String loginUsuario;
    
    @Basic(optional = false)
    @Column(name = "senhausuario")
    private String senhaUsuario;
    
    @Basic(optional = false)
    @Column(name = "perfilusuario")
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, String loginUsuario, String senhaUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.idUsuario;
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
        final Usuario other = (Usuario) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        return true;
    }
}
