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
@Table(name = "tblmunicipio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblmunicipio.findAll", query = "SELECT t FROM Tblmunicipio t"),
    @NamedQuery(name = "Tblmunicipio.findBySecmunicipio", query = "SELECT t FROM Tblmunicipio t WHERE t.secmunicipio = :secmunicipio"),
    @NamedQuery(name = "Tblmunicipio.findByNombre", query = "SELECT t FROM Tblmunicipio t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tblmunicipio.findBySecdepartamento", query = "SELECT t FROM Tblmunicipio t WHERE t.secdepartamento = :secdepartamento")})
public class Tblmunicipio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECMUNICIPIO")
    private Integer secmunicipio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECDEPARTAMENTO")
    private int secdepartamento;

    public Tblmunicipio() {
    }

    public Tblmunicipio(Integer secmunicipio) {
        this.secmunicipio = secmunicipio;
    }

    public Tblmunicipio(Integer secmunicipio, String nombre, int secdepartamento) {
        this.secmunicipio = secmunicipio;
        this.nombre = nombre;
        this.secdepartamento = secdepartamento;
    }

    public Integer getSecmunicipio() {
        return secmunicipio;
    }

    public void setSecmunicipio(Integer secmunicipio) {
        this.secmunicipio = secmunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSecdepartamento() {
        return secdepartamento;
    }

    public void setSecdepartamento(int secdepartamento) {
        this.secdepartamento = secdepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secmunicipio != null ? secmunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblmunicipio)) {
            return false;
        }
        Tblmunicipio other = (Tblmunicipio) object;
        if ((this.secmunicipio == null && other.secmunicipio != null) || (this.secmunicipio != null && !this.secmunicipio.equals(other.secmunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblmunicipio[ secmunicipio=" + secmunicipio + " ]";
    }
    
}
