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
@Table(name = "tblinventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblinventario.findAll", query = "SELECT t FROM Tblinventario t"),
    @NamedQuery(name = "Tblinventario.findBySecinventario", query = "SELECT t FROM Tblinventario t WHERE t.secinventario = :secinventario"),
    @NamedQuery(name = "Tblinventario.findBySecdetalleventa", query = "SELECT t FROM Tblinventario t WHERE t.secdetalleventa = :secdetalleventa"),
    @NamedQuery(name = "Tblinventario.findBySecdetallecompra", query = "SELECT t FROM Tblinventario t WHERE t.secdetallecompra = :secdetallecompra"),
    @NamedQuery(name = "Tblinventario.findByTotalCantidad", query = "SELECT t FROM Tblinventario t WHERE t.totalCantidad = :totalCantidad"),
    @NamedQuery(name = "Tblinventario.findByTotalCompra", query = "SELECT t FROM Tblinventario t WHERE t.totalCompra = :totalCompra"),
    @NamedQuery(name = "Tblinventario.findByTotalCompras", query = "SELECT t FROM Tblinventario t WHERE t.totalCompras = :totalCompras")})
public class Tblinventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECINVENTARIO")
    private Integer secinventario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECDETALLEVENTA")
    private int secdetalleventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECDETALLECOMPRA")
    private int secdetallecompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTAL_CANTIDAD")
    private String totalCantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTAL_COMPRA")
    private String totalCompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTAL_COMPRAS")
    private String totalCompras;

    public Tblinventario() {
    }

    public Tblinventario(Integer secinventario) {
        this.secinventario = secinventario;
    }

    public Tblinventario(Integer secinventario, int secdetalleventa, int secdetallecompra, String totalCantidad, String totalCompra, String totalCompras) {
        this.secinventario = secinventario;
        this.secdetalleventa = secdetalleventa;
        this.secdetallecompra = secdetallecompra;
        this.totalCantidad = totalCantidad;
        this.totalCompra = totalCompra;
        this.totalCompras = totalCompras;
    }

    public Integer getSecinventario() {
        return secinventario;
    }

    public void setSecinventario(Integer secinventario) {
        this.secinventario = secinventario;
    }

    public int getSecdetalleventa() {
        return secdetalleventa;
    }

    public void setSecdetalleventa(int secdetalleventa) {
        this.secdetalleventa = secdetalleventa;
    }

    public int getSecdetallecompra() {
        return secdetallecompra;
    }

    public void setSecdetallecompra(int secdetallecompra) {
        this.secdetallecompra = secdetallecompra;
    }

    public String getTotalCantidad() {
        return totalCantidad;
    }

    public void setTotalCantidad(String totalCantidad) {
        this.totalCantidad = totalCantidad;
    }

    public String getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(String totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(String totalCompras) {
        this.totalCompras = totalCompras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secinventario != null ? secinventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblinventario)) {
            return false;
        }
        Tblinventario other = (Tblinventario) object;
        if ((this.secinventario == null && other.secinventario != null) || (this.secinventario != null && !this.secinventario.equals(other.secinventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblinventario[ secinventario=" + secinventario + " ]";
    }
    
}
