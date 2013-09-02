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
@Table(name = "tbltipodocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbltipodocumento.findAll", query = "SELECT t FROM Tbltipodocumento t"),
    @NamedQuery(name = "Tbltipodocumento.findBySectipodocumento", query = "SELECT t FROM Tbltipodocumento t WHERE t.sectipodocumento = :sectipodocumento"),
    @NamedQuery(name = "Tbltipodocumento.findByDescripcion", query = "SELECT t FROM Tbltipodocumento t WHERE t.descripcion = :descripcion")})
public class Tbltipodocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECTIPODOCUMENTO")
    private Integer sectipodocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Tbltipodocumento() {
    }

    public Tbltipodocumento(Integer sectipodocumento) {
        this.sectipodocumento = sectipodocumento;
    }

    public Tbltipodocumento(Integer sectipodocumento, String descripcion) {
        this.sectipodocumento = sectipodocumento;
        this.descripcion = descripcion;
    }

    public Integer getSectipodocumento() {
        return sectipodocumento;
    }

    public void setSectipodocumento(Integer sectipodocumento) {
        this.sectipodocumento = sectipodocumento;
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
        hash += (sectipodocumento != null ? sectipodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbltipodocumento)) {
            return false;
        }
        Tbltipodocumento other = (Tbltipodocumento) object;
        if ((this.sectipodocumento == null && other.sectipodocumento != null) || (this.sectipodocumento != null && !this.sectipodocumento.equals(other.sectipodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbltipodocumento[ sectipodocumento=" + sectipodocumento + " ]";
    }
    
}
