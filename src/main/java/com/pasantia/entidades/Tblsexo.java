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
@Table(name = "tblsexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblsexo.findAll", query = "SELECT t FROM Tblsexo t"),
    @NamedQuery(name = "Tblsexo.findBySecsexo", query = "SELECT t FROM Tblsexo t WHERE t.secsexo = :secsexo"),
    @NamedQuery(name = "Tblsexo.findByDescripcion", query = "SELECT t FROM Tblsexo t WHERE t.descripcion = :descripcion")})
public class Tblsexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECSEXO")
    private Integer secsexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Tblsexo() {
    }

    public Tblsexo(Integer secsexo) {
        this.secsexo = secsexo;
    }

    public Tblsexo(Integer secsexo, String descripcion) {
        this.secsexo = secsexo;
        this.descripcion = descripcion;
    }

    public Integer getSecsexo() {
        return secsexo;
    }

    public void setSecsexo(Integer secsexo) {
        this.secsexo = secsexo;
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
        hash += (secsexo != null ? secsexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblsexo)) {
            return false;
        }
        Tblsexo other = (Tblsexo) object;
        if ((this.secsexo == null && other.secsexo != null) || (this.secsexo != null && !this.secsexo.equals(other.secsexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblsexo[ secsexo=" + secsexo + " ]";
    }
    
}
