/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Entity
@Table(name = "tblingreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblingreso.findAll", query = "SELECT t FROM Tblingreso t"),
    @NamedQuery(name = "Tblingreso.findBySecingreso", query = "SELECT t FROM Tblingreso t WHERE t.secingreso = :secingreso"),
    @NamedQuery(name = "Tblingreso.findBySecventa", query = "SELECT t FROM Tblingreso t WHERE t.secventa = :secventa"),
    @NamedQuery(name = "Tblingreso.findBySectipoingreso", query = "SELECT t FROM Tblingreso t WHERE t.sectipoingreso = :sectipoingreso"),
    @NamedQuery(name = "Tblingreso.findByFecha", query = "SELECT t FROM Tblingreso t WHERE t.fecha = :fecha")})
public class Tblingreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECINGRESO")
    private Integer secingreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECVENTA")
    private int secventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECTIPOINGRESO")
    private int sectipoingreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Tblingreso() {
    }

    public Tblingreso(Integer secingreso) {
        this.secingreso = secingreso;
    }

    public Tblingreso(Integer secingreso, int secventa, int sectipoingreso, Date fecha) {
        this.secingreso = secingreso;
        this.secventa = secventa;
        this.sectipoingreso = sectipoingreso;
        this.fecha = fecha;
    }

    public Integer getSecingreso() {
        return secingreso;
    }

    public void setSecingreso(Integer secingreso) {
        this.secingreso = secingreso;
    }

    public int getSecventa() {
        return secventa;
    }

    public void setSecventa(int secventa) {
        this.secventa = secventa;
    }

    public int getSectipoingreso() {
        return sectipoingreso;
    }

    public void setSectipoingreso(int sectipoingreso) {
        this.sectipoingreso = sectipoingreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secingreso != null ? secingreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblingreso)) {
            return false;
        }
        Tblingreso other = (Tblingreso) object;
        if ((this.secingreso == null && other.secingreso != null) || (this.secingreso != null && !this.secingreso.equals(other.secingreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblingreso[ secingreso=" + secingreso + " ]";
    }
    
}
