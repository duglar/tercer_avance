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
@Table(name = "tblegreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblegreso.findAll", query = "SELECT t FROM Tblegreso t"),
    @NamedQuery(name = "Tblegreso.findBySecegreso", query = "SELECT t FROM Tblegreso t WHERE t.secegreso = :secegreso"),
    @NamedQuery(name = "Tblegreso.findBySeccompra", query = "SELECT t FROM Tblegreso t WHERE t.seccompra = :seccompra"),
    @NamedQuery(name = "Tblegreso.findBySectipoegreso", query = "SELECT t FROM Tblegreso t WHERE t.sectipoegreso = :sectipoegreso"),
    @NamedQuery(name = "Tblegreso.findByFecha", query = "SELECT t FROM Tblegreso t WHERE t.fecha = :fecha")})
public class Tblegreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECEGRESO")
    private Integer secegreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCOMPRA")
    private int seccompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECTIPOEGRESO")
    private int sectipoegreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Tblegreso() {
    }

    public Tblegreso(Integer secegreso) {
        this.secegreso = secegreso;
    }

    public Tblegreso(Integer secegreso, int seccompra, int sectipoegreso, Date fecha) {
        this.secegreso = secegreso;
        this.seccompra = seccompra;
        this.sectipoegreso = sectipoegreso;
        this.fecha = fecha;
    }

    public Integer getSecegreso() {
        return secegreso;
    }

    public void setSecegreso(Integer secegreso) {
        this.secegreso = secegreso;
    }

    public int getSeccompra() {
        return seccompra;
    }

    public void setSeccompra(int seccompra) {
        this.seccompra = seccompra;
    }

    public int getSectipoegreso() {
        return sectipoegreso;
    }

    public void setSectipoegreso(int sectipoegreso) {
        this.sectipoegreso = sectipoegreso;
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
        hash += (secegreso != null ? secegreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblegreso)) {
            return false;
        }
        Tblegreso other = (Tblegreso) object;
        if ((this.secegreso == null && other.secegreso != null) || (this.secegreso != null && !this.secegreso.equals(other.secegreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblegreso[ secegreso=" + secegreso + " ]";
    }
    
}
