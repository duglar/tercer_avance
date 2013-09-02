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
@Table(name = "tblformapago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblformapago.findAll", query = "SELECT t FROM Tblformapago t"),
    @NamedQuery(name = "Tblformapago.findBySecformapago", query = "SELECT t FROM Tblformapago t WHERE t.secformapago = :secformapago"),
    @NamedQuery(name = "Tblformapago.findByDescripcion", query = "SELECT t FROM Tblformapago t WHERE t.descripcion = :descripcion")})
public class Tblformapago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECFORMAPAGO")
    private Integer secformapago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Tblformapago() {
    }

    public Tblformapago(Integer secformapago) {
        this.secformapago = secformapago;
    }

    public Tblformapago(Integer secformapago, String descripcion) {
        this.secformapago = secformapago;
        this.descripcion = descripcion;
    }

    public Integer getSecformapago() {
        return secformapago;
    }

    public void setSecformapago(Integer secformapago) {
        this.secformapago = secformapago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secformapago != null ? secformapago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblformapago)) {
            return false;
        }
        Tblformapago other = (Tblformapago) object;
        if ((this.secformapago == null && other.secformapago != null) || (this.secformapago != null && !this.secformapago.equals(other.secformapago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblformapago[ secformapago=" + secformapago + " ]";
    }
    
}
