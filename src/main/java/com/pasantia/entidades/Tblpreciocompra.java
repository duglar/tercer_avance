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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Entity
@Table(name = "tblpreciocompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpreciocompra.findAll", query = "SELECT t FROM Tblpreciocompra t"),
    @NamedQuery(name = "Tblpreciocompra.findBySecpreciocompra", query = "SELECT t FROM Tblpreciocompra t WHERE t.secpreciocompra = :secpreciocompra"),
    @NamedQuery(name = "Tblpreciocompra.findByFecha", query = "SELECT t FROM Tblpreciocompra t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Tblpreciocompra.findByPrecio", query = "SELECT t FROM Tblpreciocompra t WHERE t.precio = :precio"),
    @NamedQuery(name = "Tblpreciocompra.findByActivo", query = "SELECT t FROM Tblpreciocompra t WHERE t.activo = :activo")})
public class Tblpreciocompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECPRECIOCOMPRA")
    private Integer secpreciocompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PRECIO")
    private String precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ACTIVO")
    private String activo;

    public Tblpreciocompra() {
    }

    public Tblpreciocompra(Integer secpreciocompra) {
        this.secpreciocompra = secpreciocompra;
    }

    public Tblpreciocompra(Integer secpreciocompra, Date fecha, String precio, String activo) {
        this.secpreciocompra = secpreciocompra;
        this.fecha = fecha;
        this.precio = precio;
        this.activo = activo;
    }

    public Integer getSecpreciocompra() {
        return secpreciocompra;
    }

    public void setSecpreciocompra(Integer secpreciocompra) {
        this.secpreciocompra = secpreciocompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secpreciocompra != null ? secpreciocompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblpreciocompra)) {
            return false;
        }
        Tblpreciocompra other = (Tblpreciocompra) object;
        if ((this.secpreciocompra == null && other.secpreciocompra != null) || (this.secpreciocompra != null && !this.secpreciocompra.equals(other.secpreciocompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblpreciocompra[ secpreciocompra=" + secpreciocompra + " ]";
    }
    
}
