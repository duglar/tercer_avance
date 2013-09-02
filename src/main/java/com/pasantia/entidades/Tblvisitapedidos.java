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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Entity
@Table(name = "tblvisitapedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblvisitapedidos.findAll", query = "SELECT t FROM Tblvisitapedidos t"),
    @NamedQuery(name = "Tblvisitapedidos.findBySecvisitapedidos", query = "SELECT t FROM Tblvisitapedidos t WHERE t.secvisitapedidos = :secvisitapedidos"),
    @NamedQuery(name = "Tblvisitapedidos.findByLunes", query = "SELECT t FROM Tblvisitapedidos t WHERE t.lunes = :lunes"),
    @NamedQuery(name = "Tblvisitapedidos.findByMartes", query = "SELECT t FROM Tblvisitapedidos t WHERE t.martes = :martes"),
    @NamedQuery(name = "Tblvisitapedidos.findByMiercoles", query = "SELECT t FROM Tblvisitapedidos t WHERE t.miercoles = :miercoles"),
    @NamedQuery(name = "Tblvisitapedidos.findByJueves", query = "SELECT t FROM Tblvisitapedidos t WHERE t.jueves = :jueves"),
    @NamedQuery(name = "Tblvisitapedidos.findByViernes", query = "SELECT t FROM Tblvisitapedidos t WHERE t.viernes = :viernes"),
    @NamedQuery(name = "Tblvisitapedidos.findBySabado", query = "SELECT t FROM Tblvisitapedidos t WHERE t.sabado = :sabado"),
    @NamedQuery(name = "Tblvisitapedidos.findByDomingo", query = "SELECT t FROM Tblvisitapedidos t WHERE t.domingo = :domingo"),
    @NamedQuery(name = "Tblvisitapedidos.findBySecproveedor", query = "SELECT t FROM Tblvisitapedidos t WHERE t.secproveedor = :secproveedor")})
public class Tblvisitapedidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECVISITAPEDIDOS")
    private Integer secvisitapedidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LUNES")
    private int lunes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MARTES")
    private int martes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MIERCOLES")
    private int miercoles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JUEVES")
    private int jueves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VIERNES")
    private int viernes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SABADO")
    private int sabado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOMINGO")
    private int domingo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPROVEEDOR")
    private int secproveedor;

    public Tblvisitapedidos() {
    }

    public Tblvisitapedidos(Integer secvisitapedidos) {
        this.secvisitapedidos = secvisitapedidos;
    }

    public Tblvisitapedidos(Integer secvisitapedidos, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado, int domingo, int secproveedor) {
        this.secvisitapedidos = secvisitapedidos;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.secproveedor = secproveedor;
    }

    public Integer getSecvisitapedidos() {
        return secvisitapedidos;
    }

    public void setSecvisitapedidos(Integer secvisitapedidos) {
        this.secvisitapedidos = secvisitapedidos;
    }

    public int getLunes() {
        return lunes;
    }

    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    public int getMartes() {
        return martes;
    }

    public void setMartes(int martes) {
        this.martes = martes;
    }

    public int getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    public int getJueves() {
        return jueves;
    }

    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    public int getViernes() {
        return viernes;
    }

    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    public int getSabado() {
        return sabado;
    }

    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

    public int getDomingo() {
        return domingo;
    }

    public void setDomingo(int domingo) {
        this.domingo = domingo;
    }

    public int getSecproveedor() {
        return secproveedor;
    }

    public void setSecproveedor(int secproveedor) {
        this.secproveedor = secproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secvisitapedidos != null ? secvisitapedidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblvisitapedidos)) {
            return false;
        }
        Tblvisitapedidos other = (Tblvisitapedidos) object;
        if ((this.secvisitapedidos == null && other.secvisitapedidos != null) || (this.secvisitapedidos != null && !this.secvisitapedidos.equals(other.secvisitapedidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblvisitapedidos[ secvisitapedidos=" + secvisitapedidos + " ]";
    }
    
}
