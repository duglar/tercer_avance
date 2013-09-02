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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Entity
@Table(name = "tblentregapedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblentregapedido.findAll", query = "SELECT t FROM Tblentregapedido t"),
    @NamedQuery(name = "Tblentregapedido.findBySecentregapedido", query = "SELECT t FROM Tblentregapedido t WHERE t.secentregapedido = :secentregapedido"),
    @NamedQuery(name = "Tblentregapedido.findByLunes", query = "SELECT t FROM Tblentregapedido t WHERE t.lunes = :lunes"),
    @NamedQuery(name = "Tblentregapedido.findByMartes", query = "SELECT t FROM Tblentregapedido t WHERE t.martes = :martes"),
    @NamedQuery(name = "Tblentregapedido.findByMiercoles", query = "SELECT t FROM Tblentregapedido t WHERE t.miercoles = :miercoles"),
    @NamedQuery(name = "Tblentregapedido.findByJueves", query = "SELECT t FROM Tblentregapedido t WHERE t.jueves = :jueves"),
    @NamedQuery(name = "Tblentregapedido.findByViernes", query = "SELECT t FROM Tblentregapedido t WHERE t.viernes = :viernes"),
    @NamedQuery(name = "Tblentregapedido.findBySabado", query = "SELECT t FROM Tblentregapedido t WHERE t.sabado = :sabado"),
    @NamedQuery(name = "Tblentregapedido.findByDomingo", query = "SELECT t FROM Tblentregapedido t WHERE t.domingo = :domingo"),
    @NamedQuery(name = "Tblentregapedido.findBySecpedido", query = "SELECT t FROM Tblentregapedido t WHERE t.secpedido = :secpedido")})
public class Tblentregapedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECENTREGAPEDIDO")
    private Integer secentregapedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LUNES")
    private int lunes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MARTES")
    private int martes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MIERCOLES")
    private int miercoles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JUEVES")
    private int jueves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VIERNES")
    private int viernes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SABADO")
    private int sabado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOMINGO")
    private int domingo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPEDIDO")
    private int secpedido;

    public Tblentregapedido() {
    }

    public Tblentregapedido(Integer secentregapedido) {
        this.secentregapedido = secentregapedido;
    }

    public Tblentregapedido(Integer secentregapedido, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int domingo, int secpedido) {
        this.secentregapedido = secentregapedido;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.secpedido = secpedido;
    }

    public Integer getSecentregapedido() {
        return secentregapedido;
    }

    public void setSecentregapedido(Integer secentregapedido) {
        this.secentregapedido = secentregapedido;
    }

    public int getLunes() {
        return lunes;
    }

    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    public int getMartes() {
        return martes;
    }

    public void setMartes(int martes) {
        this.martes = martes;
    }

    public int getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    public int getJueves() {
        return jueves;
    }

    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    public int getViernes() {
        return viernes;
    }

    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    public int getSabado() {
        return sabado;
    }

    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

    public int getDomingo() {
        return domingo;
    }

    public void setDomingo(int domingo) {
        this.domingo = domingo;
    }

    public int getSecpedido() {
        return secpedido;
    }

    public void setSecpedido(int secpedido) {
        this.secpedido = secpedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secentregapedido != null ? secentregapedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblentregapedido)) {
            return false;
        }
        Tblentregapedido other = (Tblentregapedido) object;
        if ((this.secentregapedido == null && other.secentregapedido != null) || (this.secentregapedido != null && !this.secentregapedido.equals(other.secentregapedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblentregapedido[ secentregapedido=" + secentregapedido + " ]";
    }
    
}
