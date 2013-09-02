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
@Table(name = "tblrol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblrol.findAll", query = "SELECT t FROM Tblrol t"),
    @NamedQuery(name = "Tblrol.findBySecrol", query = "SELECT t FROM Tblrol t WHERE t.secrol = :secrol"),
    @NamedQuery(name = "Tblrol.findByDescripcion", query = "SELECT t FROM Tblrol t WHERE t.descripcion = :descripcion")})
public class Tblrol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECROL")
    private Integer secrol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Tblrol() {
    }

    public Tblrol(Integer secrol) {
        this.secrol = secrol;
    }

    public Tblrol(Integer secrol, String descripcion) {
        this.secrol = secrol;
        this.descripcion = descripcion;
    }

    public Integer getSecrol() {
        return secrol;
    }

    public void setSecrol(Integer secrol) {
        this.secrol = secrol;
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
        hash += (secrol != null ? secrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblrol)) {
            return false;
        }
        Tblrol other = (Tblrol) object;
        if ((this.secrol == null && other.secrol != null) || (this.secrol != null && !this.secrol.equals(other.secrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblrol[ secrol=" + secrol + " ]";
    }
    
}
