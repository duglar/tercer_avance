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
@Table(name = "tblcategoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcategoria.findAll", query = "SELECT t FROM Tblcategoria t"),
    @NamedQuery(name = "Tblcategoria.findBySeccategoria", query = "SELECT t FROM Tblcategoria t WHERE t.seccategoria = :seccategoria"),
    @NamedQuery(name = "Tblcategoria.findByNombreCategoria", query = "SELECT t FROM Tblcategoria t WHERE t.nombreCategoria = :nombreCategoria")})
public class Tblcategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECCATEGORIA")
    private Integer seccategoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE_CATEGORIA")
    private String nombreCategoria;

    public Tblcategoria() {
    }

    public Tblcategoria(Integer seccategoria) {
        this.seccategoria = seccategoria;
    }

    public Tblcategoria(Integer seccategoria, String nombreCategoria) {
        this.seccategoria = seccategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getSeccategoria() {
        return seccategoria;
    }

    public void setSeccategoria(Integer seccategoria) {
        this.seccategoria = seccategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seccategoria != null ? seccategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcategoria)) {
            return false;
        }
        Tblcategoria other = (Tblcategoria) object;
        if ((this.seccategoria == null && other.seccategoria != null) || (this.seccategoria != null && !this.seccategoria.equals(other.seccategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblcategoria[ seccategoria=" + seccategoria + " ]";
    }
    
}
