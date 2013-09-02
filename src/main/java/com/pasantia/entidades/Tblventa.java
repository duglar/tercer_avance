/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "tblventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblventa.findAll", query = "SELECT t FROM Tblventa t"),
    @NamedQuery(name = "Tblventa.findBySecventa", query = "SELECT t FROM Tblventa t WHERE t.secventa = :secventa"),
    @NamedQuery(name = "Tblventa.findByFecha", query = "SELECT t FROM Tblventa t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Tblventa.findBySecpuntodeventa", query = "SELECT t FROM Tblventa t WHERE t.secpuntodeventa = :secpuntodeventa"),
    @NamedQuery(name = "Tblventa.findBySeccliente", query = "SELECT t FROM Tblventa t WHERE t.seccliente = :seccliente"),
    @NamedQuery(name = "Tblventa.findByObservacion", query = "SELECT t FROM Tblventa t WHERE t.observacion = :observacion"),
    @NamedQuery(name = "Tblventa.findBySecvendedor", query = "SELECT t FROM Tblventa t WHERE t.secvendedor = :secvendedor"),
    @NamedQuery(name = "Tblventa.findByTotal", query = "SELECT t FROM Tblventa t WHERE t.total = :total"),
    @NamedQuery(name = "Tblventa.findByTotalcantidad", query = "SELECT t FROM Tblventa t WHERE t.totalcantidad = :totalcantidad"),
    @NamedQuery(name = "Tblventa.findBySecformapago", query = "SELECT t FROM Tblventa t WHERE t.secformapago = :secformapago")})
public class Tblventa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECVENTA")
    private Integer secventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPUNTODEVENTA")
    private int secpuntodeventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCLIENTE")
    private int seccliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECVENDEDOR")
    private int secvendedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL")
    private BigInteger total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTALCANTIDAD")
    private int totalcantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECFORMAPAGO")
    private int secformapago;

    public Tblventa() {
    }

    public Tblventa(Integer secventa) {
        this.secventa = secventa;
    }

    public Tblventa(Integer secventa, Date fecha, int secpuntodeventa, int seccliente, String observacion, int secvendedor, BigInteger total, int totalcantidad, int secformapago) {
        this.secventa = secventa;
        this.fecha = fecha;
        this.secpuntodeventa = secpuntodeventa;
        this.seccliente = seccliente;
        this.observacion = observacion;
        this.secvendedor = secvendedor;
        this.total = total;
        this.totalcantidad = totalcantidad;
        this.secformapago = secformapago;
    }

    public Integer getSecventa() {
        return secventa;
    }

    public void setSecventa(Integer secventa) {
        this.secventa = secventa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSecpuntodeventa() {
        return secpuntodeventa;
    }

    public void setSecpuntodeventa(int secpuntodeventa) {
        this.secpuntodeventa = secpuntodeventa;
    }

    public int getSeccliente() {
        return seccliente;
    }

    public void setSeccliente(int seccliente) {
        this.seccliente = seccliente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getSecvendedor() {
        return secvendedor;
    }

    public void setSecvendedor(int secvendedor) {
        this.secvendedor = secvendedor;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public int getTotalcantidad() {
        return totalcantidad;
    }

    public void setTotalcantidad(int totalcantidad) {
        this.totalcantidad = totalcantidad;
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
        hash += (secventa != null ? secventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblventa)) {
            return false;
        }
        Tblventa other = (Tblventa) object;
        if ((this.secventa == null && other.secventa != null) || (this.secventa != null && !this.secventa.equals(other.secventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblventa[ secventa=" + secventa + " ]";
    }
    
}
