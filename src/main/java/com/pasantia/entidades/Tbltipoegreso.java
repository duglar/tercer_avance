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
@Table(name = "tbltipoegreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbltipoegreso.findAll", query = "SELECT t FROM Tbltipoegreso t"),
    @NamedQuery(name = "Tbltipoegreso.findBySectipoingreso", query = "SELECT t FROM Tbltipoegreso t WHERE t.sectipoingreso = :sectipoingreso"),
    @NamedQuery(name = "Tbltipoegreso.findByConceptoEgreso", query = "SELECT t FROM Tbltipoegreso t WHERE t.conceptoEgreso = :conceptoEgreso")})
public class Tbltipoegreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECTIPOINGRESO")
    private Integer sectipoingreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "CONCEPTO_EGRESO")
    private String conceptoEgreso;

    public Tbltipoegreso() {
    }

    public Tbltipoegreso(Integer sectipoingreso) {
        this.sectipoingreso = sectipoingreso;
    }

    public Tbltipoegreso(Integer sectipoingreso, String conceptoEgreso) {
        this.sectipoingreso = sectipoingreso;
        this.conceptoEgreso = conceptoEgreso;
    }

    public Integer getSectipoingreso() {
        return sectipoingreso;
    }

    public void setSectipoingreso(Integer sectipoingreso) {
        this.sectipoingreso = sectipoingreso;
    }

    public String getConceptoEgreso() {
        return conceptoEgreso;
    }

    public void setConceptoEgreso(String conceptoEgreso) {
        this.conceptoEgreso = conceptoEgreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectipoingreso != null ? sectipoingreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbltipoegreso)) {
            return false;
        }
        Tbltipoegreso other = (Tbltipoegreso) object;
        if ((this.sectipoingreso == null && other.sectipoingreso != null) || (this.sectipoingreso != null && !this.sectipoingreso.equals(other.sectipoingreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbltipoegreso[ sectipoingreso=" + sectipoingreso + " ]";
    }
    
}
