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
@Table(name = "tbldocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldocumento.findAll", query = "SELECT t FROM Tbldocumento t"),
    @NamedQuery(name = "Tbldocumento.findBySecdocumento", query = "SELECT t FROM Tbldocumento t WHERE t.secdocumento = :secdocumento"),
    @NamedQuery(name = "Tbldocumento.findByNumero", query = "SELECT t FROM Tbldocumento t WHERE t.numero = :numero"),
    @NamedQuery(name = "Tbldocumento.findBySectipodocumento", query = "SELECT t FROM Tbldocumento t WHERE t.sectipodocumento = :sectipodocumento")})
public class Tbldocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECDOCUMENTO")
    private Integer secdocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NUMERO")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECTIPODOCUMENTO")
    private int sectipodocumento;

    public Tbldocumento() {
    }

    public Tbldocumento(Integer secdocumento) {
        this.secdocumento = secdocumento;
    }

    public Tbldocumento(Integer secdocumento, String numero, int sectipodocumento) {
        this.secdocumento = secdocumento;
        this.numero = numero;
        this.sectipodocumento = sectipodocumento;
    }

    public Integer getSecdocumento() {
        return secdocumento;
    }

    public void setSecdocumento(Integer secdocumento) {
        this.secdocumento = secdocumento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getSectipodocumento() {
        return sectipodocumento;
    }

    public void setSectipodocumento(int sectipodocumento) {
        this.sectipodocumento = sectipodocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secdocumento != null ? secdocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbldocumento)) {
            return false;
        }
        Tbldocumento other = (Tbldocumento) object;
        if ((this.secdocumento == null && other.secdocumento != null) || (this.secdocumento != null && !this.secdocumento.equals(other.secdocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tbldocumento[ secdocumento=" + secdocumento + " ]";
    }
    
}
