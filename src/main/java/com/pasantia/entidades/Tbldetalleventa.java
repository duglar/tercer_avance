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
@Table(name = "tbldetalleventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldetalleventa.findAll", query = "SELECT t FROM Tbldetalleventa t"),
    @NamedQuery(name = "Tbldetalleventa.findBySecdetalleventa", query = "SELECT t FROM Tbldetalleventa t WHERE t.secdetalleventa = :secdetalleventa"),
    @NamedQuery(name = "Tbldetalleventa.findBySecproducto", query = "SELECT t FROM Tbldetalleventa t WHERE t.secproducto = :secproducto"),
    @NamedQuery(name = "Tbldetalleventa.findBySecventa", query = "SELECT t FROM Tbldetalleventa t WHERE t.secventa = :secventa"),
    @NamedQuery(name = "Tbldetalleventa.findBySubtotal", query = "SELECT t FROM Tbldetalleventa t WHERE t.subtotal = :subtotal"),
    @NamedQuery(name = "Tbldetalleventa.findByCantidad", query = "SELECT t FROM Tbldetalleventa t WHERE t.cantidad = :cantidad")})
public class Tbldetalleventa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECDETALLEVENTA")
    private Integer secdetalleventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPRODUCTO")
    private int secproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECVENTA")
    private int secventa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SUBTOTAL")
    private String subtotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CANTIDAD")
    private String cantidad;

    public Tbldetalleventa() {
    }

    public Tbldetalleventa(Integer secdetalleventa) {
        this.secdetalleventa = secdetalleventa;
    }

    public Tbldetalleventa(Integer secdetalleventa, int secproducto, int secventa, String subtotal, String cantidad) {
        this.secdetalleventa = secdetalleventa;
        this.secproducto = secproducto;
        this.secventa = secventa;
        this.subtotal = subtotal;
        this.cantidad = cantidad;
    }

    public Integer getSecdetalleventa() {
        return secdetalleventa;
    }

    public void setSecdetalleventa(Integer secdetalleventa) {
        this.secdetalleventa = secdetalleventa;
    }

    public int getSecproducto() {
        return secproducto;
    }

    public void setSecproducto(int secproducto) {
        this.secproducto = secproducto;
    }

    public int getSecventa() {
        return secventa;
    }

    public void setSecventa(int secventa) {
        this.secventa = secventa;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secdetalleventa != null ? secdetalleventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldetalleventa)) {
            return false;
        }
        Tbldetalleventa other = (Tbldetalleventa) object;
        if ((this.secdetalleventa == null && other.secdetalleventa != null) || (this.secdetalleventa != null && !this.secdetalleventa.equals(other.secdetalleventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbldetalleventa[ secdetalleventa=" + secdetalleventa + " ]";
    }
    
}
