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
@Table(name = "tblpais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpais.findAll", query = "SELECT t FROM Tblpais t"),
    @NamedQuery(name = "Tblpais.findBySecpais", query = "SELECT t FROM Tblpais t WHERE t.secpais = :secpais"),
    @NamedQuery(name = "Tblpais.findByNombre", query = "SELECT t FROM Tblpais t WHERE t.nombre = :nombre")})
public class Tblpais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECPAIS")
    private Integer secpais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;

    public Tblpais() {
    }

    public Tblpais(Integer secpais) {
        this.secpais = secpais;
    }

    public Tblpais(Integer secpais, String nombre) {
        this.secpais = secpais;
        this.nombre = nombre;
    }

    public Integer getSecpais() {
        return secpais;
    }

    public void setSecpais(Integer secpais) {
        this.secpais = secpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secpais != null ? secpais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblpais)) {
            return false;
        }
        Tblpais other = (Tblpais) object;
        if ((this.secpais == null && other.secpais != null) || (this.secpais != null && !this.secpais.equals(other.secpais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblpais[ secpais=" + secpais + " ]";
    }
    
}
