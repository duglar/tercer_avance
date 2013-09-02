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
@Table(name = "tblpedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpedido.findAll", query = "SELECT t FROM Tblpedido t"),
    @NamedQuery(name = "Tblpedido.findBySecpedido", query = "SELECT t FROM Tblpedido t WHERE t.secpedido = :secpedido"),
    @NamedQuery(name = "Tblpedido.findBySecproducto", query = "SELECT t FROM Tblpedido t WHERE t.secproducto = :secproducto"),
    @NamedQuery(name = "Tblpedido.findBySecproveedor", query = "SELECT t FROM Tblpedido t WHERE t.secproveedor = :secproveedor"),
    @NamedQuery(name = "Tblpedido.findByTotalpedido", query = "SELECT t FROM Tblpedido t WHERE t.totalpedido = :totalpedido")})
public class Tblpedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECPEDIDO")
    private Integer secpedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPRODUCTO")
    private int secproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPROVEEDOR")
    private int secproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTALPEDIDO")
    private String totalpedido;

    public Tblpedido() {
    }

    public Tblpedido(Integer secpedido) {
        this.secpedido = secpedido;
    }

    public Tblpedido(Integer secpedido, int secproducto, int secproveedor, String totalpedido) {
        this.secpedido = secpedido;
        this.secproducto = secproducto;
        this.secproveedor = secproveedor;
        this.totalpedido = totalpedido;
    }

    public Integer getSecpedido() {
        return secpedido;
    }

    public void setSecpedido(Integer secpedido) {
        this.secpedido = secpedido;
    }

    public int getSecproducto() {
        return secproducto;
    }

    public void setSecproducto(int secproducto) {
        this.secproducto = secproducto;
    }

    public int getSecproveedor() {
        return secproveedor;
    }

    public void setSecproveedor(int secproveedor) {
        this.secproveedor = secproveedor;
    }

    public String getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(String totalpedido) {
        this.totalpedido = totalpedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secpedido != null ? secpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblpedido)) {
            return false;
        }
        Tblpedido other = (Tblpedido) object;
        if ((this.secpedido == null && other.secpedido != null) || (this.secpedido != null && !this.secpedido.equals(other.secpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblpedido[ secpedido=" + secpedido + " ]";
    }
    
}
