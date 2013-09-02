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
@Table(name = "tblpuntodeventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpuntodeventa.findAll", query = "SELECT t FROM Tblpuntodeventa t"),
    @NamedQuery(name = "Tblpuntodeventa.findBySectipodeventa", query = "SELECT t FROM Tblpuntodeventa t WHERE t.sectipodeventa = :sectipodeventa"),
    @NamedQuery(name = "Tblpuntodeventa.findBySecpersona", query = "SELECT t FROM Tblpuntodeventa t WHERE t.secpersona = :secpersona"),
    @NamedQuery(name = "Tblpuntodeventa.findBySecsucursal", query = "SELECT t FROM Tblpuntodeventa t WHERE t.secsucursal = :secsucursal")})
public class Tblpuntodeventa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECTIPODEVENTA")
    private Integer sectipodeventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPERSONA")
    private int secpersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECSUCURSAL")
    private int secsucursal;

    public Tblpuntodeventa() {
    }

    public Tblpuntodeventa(Integer sectipodeventa) {
        this.sectipodeventa = sectipodeventa;
    }

    public Tblpuntodeventa(Integer sectipodeventa, int secpersona, int secsucursal) {
        this.sectipodeventa = sectipodeventa;
        this.secpersona = secpersona;
        this.secsucursal = secsucursal;
    }

    public Integer getSectipodeventa() {
        return sectipodeventa;
    }

    public void setSectipodeventa(Integer sectipodeventa) {
        this.sectipodeventa = sectipodeventa;
    }

    public int getSecpersona() {
        return secpersona;
    }

    public void setSecpersona(int secpersona) {
        this.secpersona = secpersona;
    }

    public int getSecsucursal() {
        return secsucursal;
    }

    public void setSecsucursal(int secsucursal) {
        this.secsucursal = secsucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectipodeventa != null ? sectipodeventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblpuntodeventa)) {
            return false;
        }
        Tblpuntodeventa other = (Tblpuntodeventa) object;
        if ((this.sectipodeventa == null && other.sectipodeventa != null) || (this.sectipodeventa != null && !this.sectipodeventa.equals(other.sectipodeventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblpuntodeventa[ sectipodeventa=" + sectipodeventa + " ]";
    }
    
}
