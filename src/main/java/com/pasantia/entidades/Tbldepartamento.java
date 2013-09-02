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
@Table(name = "tbldepartamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldepartamento.findAll", query = "SELECT t FROM Tbldepartamento t"),
    @NamedQuery(name = "Tbldepartamento.findBySecdepartamento", query = "SELECT t FROM Tbldepartamento t WHERE t.secdepartamento = :secdepartamento"),
    @NamedQuery(name = "Tbldepartamento.findByNombre", query = "SELECT t FROM Tbldepartamento t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tbldepartamento.findBySecpais", query = "SELECT t FROM Tbldepartamento t WHERE t.secpais = :secpais")})
public class Tbldepartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECDEPARTAMENTO")
    private Integer secdepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECPAIS")
    private int secpais;

    public Tbldepartamento() {
    }

    public Tbldepartamento(Integer secdepartamento) {
        this.secdepartamento = secdepartamento;
    }

    public Tbldepartamento(Integer secdepartamento, String nombre, int secpais) {
        this.secdepartamento = secdepartamento;
        this.nombre = nombre;
        this.secpais = secpais;
    }

    public Integer getSecdepartamento() {
        return secdepartamento;
    }

    public void setSecdepartamento(Integer secdepartamento) {
        this.secdepartamento = secdepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSecpais() {
        return secpais;
    }

    public void setSecpais(int secpais) {
        this.secpais = secpais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secdepartamento != null ? secdepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldepartamento)) {
            return false;
        }
        Tbldepartamento other = (Tbldepartamento) object;
        if ((this.secdepartamento == null && other.secdepartamento != null) || (this.secdepartamento != null && !this.secdepartamento.equals(other.secdepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbldepartamento[ secdepartamento=" + secdepartamento + " ]";
    }
    
}
