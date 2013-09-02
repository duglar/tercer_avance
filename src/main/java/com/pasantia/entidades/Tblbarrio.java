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
@Table(name = "tblbarrio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblbarrio.findAll", query = "SELECT t FROM Tblbarrio t"),
    @NamedQuery(name = "Tblbarrio.findBySecbarrio", query = "SELECT t FROM Tblbarrio t WHERE t.secbarrio = :secbarrio"),
    @NamedQuery(name = "Tblbarrio.findByNombre", query = "SELECT t FROM Tblbarrio t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tblbarrio.findBySecmunicipio", query = "SELECT t FROM Tblbarrio t WHERE t.secmunicipio = :secmunicipio")})
public class Tblbarrio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECBARRIO")
    private Integer secbarrio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECMUNICIPIO")
    private int secmunicipio;

    public Tblbarrio() {
    }

    public Tblbarrio(Integer secbarrio) {
        this.secbarrio = secbarrio;
    }

    public Tblbarrio(Integer secbarrio, String nombre, int secmunicipio) {
        this.secbarrio = secbarrio;
        this.nombre = nombre;
        this.secmunicipio = secmunicipio;
    }

    public Integer getSecbarrio() {
        return secbarrio;
    }

    public void setSecbarrio(Integer secbarrio) {
        this.secbarrio = secbarrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSecmunicipio() {
        return secmunicipio;
    }

    public void setSecmunicipio(int secmunicipio) {
        this.secmunicipio = secmunicipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secbarrio != null ? secbarrio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblbarrio)) {
            return false;
        }
        Tblbarrio other = (Tblbarrio) object;
        if ((this.secbarrio == null && other.secbarrio != null) || (this.secbarrio != null && !this.secbarrio.equals(other.secbarrio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblbarrio[ secbarrio=" + secbarrio + " ]";
    }
    
}
