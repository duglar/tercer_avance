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
@Table(name = "tblcompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcompra.findAll", query = "SELECT t FROM Tblcompra t"),
    @NamedQuery(name = "Tblcompra.findBySeccompra", query = "SELECT t FROM Tblcompra t WHERE t.seccompra = :seccompra"),
    @NamedQuery(name = "Tblcompra.findBySecpuntodeventa", query = "SELECT t FROM Tblcompra t WHERE t.secpuntodeventa = :secpuntodeventa"),
    @NamedQuery(name = "Tblcompra.findBySecproveedor", query = "SELECT t FROM Tblcompra t WHERE t.secproveedor = :secproveedor"),
    @NamedQuery(name = "Tblcompra.findByTotal", query = "SELECT t FROM Tblcompra t WHERE t.total = :total"),
    @NamedQuery(name = "Tblcompra.findByTotalCantidad", query = "SELECT t FROM Tblcompra t WHERE t.totalCantidad = :totalCantidad"),
    @NamedQuery(name = "Tblcompra.findByDescripcion", query = "SELECT t FROM Tblcompra t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tblcompra.findByFecha", query = "SELECT t FROM Tblcompra t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Tblcompra.findBySecformapago", query = "SELECT t FROM Tblcompra t WHERE t.secformapago = :secformapago")})
public class Tblcompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCOMPRA")
    private Integer seccompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPUNTODEVENTA")
    private int secpuntodeventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPROVEEDOR")
    private int secproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTAL")
    private String total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTAL_CANTIDAD")
    private String totalCantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECFORMAPAGO")
    private int secformapago;

    public Tblcompra() {
    }

    public Tblcompra(Integer seccompra) {
        this.seccompra = seccompra;
    }

    public Tblcompra(Integer seccompra, int secpuntodeventa, int secproveedor, String total, String totalCantidad, String descripcion, Date fecha, int secformapago) {
        this.seccompra = seccompra;
        this.secpuntodeventa = secpuntodeventa;
        this.secproveedor = secproveedor;
        this.total = total;
        this.totalCantidad = totalCantidad;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.secformapago = secformapago;
    }

    public Integer getSeccompra() {
        return seccompra;
    }

    public void setSeccompra(Integer seccompra) {
        this.seccompra = seccompra;
    }

    public int getSecpuntodeventa() {
        return secpuntodeventa;
    }

    public void setSecpuntodeventa(int secpuntodeventa) {
        this.secpuntodeventa = secpuntodeventa;
    }

    public int getSecproveedor() {
        return secproveedor;
    }

    public void setSecproveedor(int secproveedor) {
        this.secproveedor = secproveedor;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalCantidad() {
        return totalCantidad;
    }

    public void setTotalCantidad(String totalCantidad) {
        this.totalCantidad = totalCantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSecformapago() {
        return secformapago;
    }

    public void setSecformapago(int secformapago) {
        this.secformapago = secformapago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seccompra != null ? seccompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcompra)) {
            return false;
        }
        Tblcompra other = (Tblcompra) object;
        if ((this.seccompra == null && other.seccompra != null) || (this.seccompra != null && !this.seccompra.equals(other.seccompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblcompra[ seccompra=" + seccompra + " ]";
    }
    
}
