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
@Table(name = "tbldetallecompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldetallecompra.findAll", query = "SELECT t FROM Tbldetallecompra t"),
    @NamedQuery(name = "Tbldetallecompra.findBySecdetallecompra", query = "SELECT t FROM Tbldetallecompra t WHERE t.secdetallecompra = :secdetallecompra"),
    @NamedQuery(name = "Tbldetallecompra.findBySecproducto", query = "SELECT t FROM Tbldetallecompra t WHERE t.secproducto = :secproducto"),
    @NamedQuery(name = "Tbldetallecompra.findBySeccompra", query = "SELECT t FROM Tbldetallecompra t WHERE t.seccompra = :seccompra"),
    @NamedQuery(name = "Tbldetallecompra.findByCantidad", query = "SELECT t FROM Tbldetallecompra t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Tbldetallecompra.findBySubtotal", query = "SELECT t FROM Tbldetallecompra t WHERE t.subtotal = :subtotal")})
public class Tbldetallecompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECDETALLECOMPRA")
    private Integer secdetallecompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPRODUCTO")
    private int secproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCOMPRA")
    private int seccompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CANTIDAD")
    private String cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SUBTOTAL")
    private String subtotal;

    public Tbldetallecompra() {
    }

    public Tbldetallecompra(Integer secdetallecompra) {
        this.secdetallecompra = secdetallecompra;
    }

    public Tbldetallecompra(Integer secdetallecompra, int secproducto, int seccompra, String cantidad, String subtotal) {
        this.secdetallecompra = secdetallecompra;
        this.secproducto = secproducto;
        this.seccompra = seccompra;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Integer getSecdetallecompra() {
        return secdetallecompra;
    }

    public void setSecdetallecompra(Integer secdetallecompra) {
        this.secdetallecompra = secdetallecompra;
    }

    public int getSecproducto() {
        return secproducto;
    }

    public void setSecproducto(int secproducto) {
        this.secproducto = secproducto;
    }

    public int getSeccompra() {
        return seccompra;
    }

    public void setSeccompra(int seccompra) {
        this.seccompra = seccompra;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secdetallecompra != null ? secdetallecompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldetallecompra)) {
            return false;
        }
        Tbldetallecompra other = (Tbldetallecompra) object;
        if ((this.secdetallecompra == null && other.secdetallecompra != null) || (this.secdetallecompra != null && !this.secdetallecompra.equals(other.secdetallecompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbldetallecompra[ secdetallecompra=" + secdetallecompra + " ]";
    }
    
}
