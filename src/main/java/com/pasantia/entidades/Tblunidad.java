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
@Table(name = "tblunidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblunidad.findAll", query = "SELECT t FROM Tblunidad t"),
    @NamedQuery(name = "Tblunidad.findBySecunidad", query = "SELECT t FROM Tblunidad t WHERE t.secunidad = :secunidad"),
    @NamedQuery(name = "Tblunidad.findByUnidades", query = "SELECT t FROM Tblunidad t WHERE t.unidades = :unidades")})
public class Tblunidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECUNIDAD")
    private Integer secunidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "UNIDADES")
    private String unidades;

    public Tblunidad() {
    }

    public Tblunidad(Integer secunidad) {
        this.secunidad = secunidad;
    }

    public Tblunidad(Integer secunidad, String unidades) {
        this.secunidad = secunidad;
        this.unidades = unidades;
    }

    public Integer getSecunidad() {
        return secunidad;
    }

    public void setSecunidad(Integer secunidad) {
        this.secunidad = secunidad;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secunidad != null ? secunidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblunidad)) {
            return false;
        }
        Tblunidad other = (Tblunidad) object;
        if ((this.secunidad == null && other.secunidad != null) || (this.secunidad != null && !this.secunidad.equals(other.secunidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblunidad[ secunidad=" + secunidad + " ]";
    }
    
}
