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
@Table(name = "tblproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblproducto.findAll", query = "SELECT t FROM Tblproducto t"),
    @NamedQuery(name = "Tblproducto.findBySecproducto", query = "SELECT t FROM Tblproducto t WHERE t.secproducto = :secproducto"),
    @NamedQuery(name = "Tblproducto.findByNombreProducto", query = "SELECT t FROM Tblproducto t WHERE t.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Tblproducto.findBySecproveedor", query = "SELECT t FROM Tblproducto t WHERE t.secproveedor = :secproveedor"),
    @NamedQuery(name = "Tblproducto.findBySeccategoria", query = "SELECT t FROM Tblproducto t WHERE t.seccategoria = :seccategoria"),
    @NamedQuery(name = "Tblproducto.findBySecmarca", query = "SELECT t FROM Tblproducto t WHERE t.secmarca = :secmarca"),
    @NamedQuery(name = "Tblproducto.findBySecpreciocompra", query = "SELECT t FROM Tblproducto t WHERE t.secpreciocompra = :secpreciocompra"),
    @NamedQuery(name = "Tblproducto.findBySecunidad", query = "SELECT t FROM Tblproducto t WHERE t.secunidad = :secunidad"),
    @NamedQuery(name = "Tblproducto.findByCodigo", query = "SELECT t FROM Tblproducto t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "Tblproducto.findByCantidad", query = "SELECT t FROM Tblproducto t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Tblproducto.findByPrecioCompra", query = "SELECT t FROM Tblproducto t WHERE t.precioCompra = :precioCompra")})
public class Tblproducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECPRODUCTO")
    private Integer secproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPROVEEDOR")
    private int secproveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCATEGORIA")
    private int seccategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECMARCA")
    private int secmarca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPRECIOCOMPRA")
    private int secpreciocompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECUNIDAD")
    private int secunidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private int codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PRECIO_COMPRA")
    private String precioCompra;

    public Tblproducto() {
    }

    public Tblproducto(Integer secproducto) {
        this.secproducto = secproducto;
    }

    public Tblproducto(Integer secproducto, String nombreProducto, int secproveedor, int seccategoria, int secmarca, int secpreciocompra, int secunidad, int codigo, int cantidad, String precioCompra) {
        this.secproducto = secproducto;
        this.nombreProducto = nombreProducto;
        this.secproveedor = secproveedor;
        this.seccategoria = seccategoria;
        this.secmarca = secmarca;
        this.secpreciocompra = secpreciocompra;
        this.secunidad = secunidad;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
    }

    public Integer getSecproducto() {
        return secproducto;
    }

    public void setSecproducto(Integer secproducto) {
        this.secproducto = secproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getSecproveedor() {
        return secproveedor;
    }

    public void setSecproveedor(int secproveedor) {
        this.secproveedor = secproveedor;
    }

    public int getSeccategoria() {
        return seccategoria;
    }

    public void setSeccategoria(int seccategoria) {
        this.seccategoria = seccategoria;
    }

    public int getSecmarca() {
        return secmarca;
    }

    public void setSecmarca(int secmarca) {
        this.secmarca = secmarca;
    }

    public int getSecpreciocompra() {
        return secpreciocompra;
    }

    public void setSecpreciocompra(int secpreciocompra) {
        this.secpreciocompra = secpreciocompra;
    }

    public int getSecunidad() {
        return secunidad;
    }

    public void setSecunidad(int secunidad) {
        this.secunidad = secunidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secproducto != null ? secproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblproducto)) {
            return false;
        }
        Tblproducto other = (Tblproducto) object;
        if ((this.secproducto == null && other.secproducto != null) || (this.secproducto != null && !this.secproducto.equals(other.secproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblproducto[ secproducto=" + secproducto + " ]";
    }
    
}
