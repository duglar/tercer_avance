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
@Table(name = "tbltipopersona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbltipopersona.findAll", query = "SELECT t FROM Tbltipopersona t"),
    @NamedQuery(name = "Tbltipopersona.findBySectipopersona", query = "SELECT t FROM Tbltipopersona t WHERE t.sectipopersona = :sectipopersona"),
    @NamedQuery(name = "Tbltipopersona.findByDescripcion", query = "SELECT t FROM Tbltipopersona t WHERE t.descripcion = :descripcion")})
public class Tbltipopersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECTIPOPERSONA")
    private Integer sectipopersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Tbltipopersona() {
    }

    public Tbltipopersona(Integer sectipopersona) {
        this.sectipopersona = sectipopersona;
    }

    public Tbltipopersona(Integer sectipopersona, String descripcion) {
        this.sectipopersona = sectipopersona;
        this.descripcion = descripcion;
    }

    public Integer getSectipopersona() {
        return sectipopersona;
    }

    public void setSectipopersona(Integer sectipopersona) {
        this.sectipopersona = sectipopersona;
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
        hash += (sectipopersona != null ? sectipopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbltipopersona)) {
            return false;
        }
        Tbltipopersona other = (Tbltipopersona) object;
        if ((this.sectipopersona == null && other.sectipopersona != null) || (this.sectipopersona != null && !this.sectipopersona.equals(other.sectipopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbltipopersona[ sectipopersona=" + sectipopersona + " ]";
    }
    
}
