/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Entity
@Table(name = "tblusuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuario.findAll", query = "SELECT t FROM Tblusuario t"),
    @NamedQuery(name = "Tblusuario.findBySecusuario", query = "SELECT t FROM Tblusuario t WHERE t.secusuario = :secusuario"),
    @NamedQuery(name = "Tblusuario.findByLogin", query = "SELECT t FROM Tblusuario t WHERE t.login = :login"),
    @NamedQuery(name = "Tblusuario.findByPassword", query = "SELECT t FROM Tblusuario t WHERE t.password = :password"),
    @NamedQuery(name = "Tblusuario.findBySecrol", query = "SELECT t FROM Tblusuario t WHERE t.secrol = :secrol"),
    @NamedQuery(name = "Tblusuario.findBySesion", query = "SELECT t FROM Tblusuario t WHERE t.sesion = :sesion"),
    @NamedQuery(name = "Tblusuario.findBySecpersona", query = "SELECT t FROM Tblusuario t WHERE t.secpersona = :secpersona")})
public class Tblusuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECUSUARIO")
    private Integer secusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECROL")
    private int secrol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SESION")
    private String sesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPERSONA")
    private int secpersona;

    public Tblusuario() {
    }

    public Tblusuario(Integer secusuario) {
        this.secusuario = secusuario;
    }

    public Tblusuario(Integer secusuario, String login, String password, int secrol, String sesion, int secpersona) {
        this.secusuario = secusuario;
        this.login = login;
        this.password = password;
        this.secrol = secrol;
        this.sesion = sesion;
        this.secpersona = secpersona;
    }

    public Integer getSecusuario() {
        return secusuario;
    }

    public void setSecusuario(Integer secusuario) {
        this.secusuario = secusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSecrol() {
        return secrol;
    }

    public void setSecrol(int secrol) {
        this.secrol = secrol;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public int getSecpersona() {
        return secpersona;
    }

    public void setSecpersona(int secpersona) {
        this.secpersona = secpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secusuario != null ? secusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblusuario)) {
            return false;
        }
        Tblusuario other = (Tblusuario) object;
        if ((this.secusuario == null && other.secusuario != null) || (this.secusuario != null && !this.secusuario.equals(other.secusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblusuario[ secusuario=" + secusuario + " ]";
    }
    
}
