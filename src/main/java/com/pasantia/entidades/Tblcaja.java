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
@Table(name = "tblcaja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcaja.findAll", query = "SELECT t FROM Tblcaja t"),
    @NamedQuery(name = "Tblcaja.findBySeccaja", query = "SELECT t FROM Tblcaja t WHERE t.seccaja = :seccaja"),
    @NamedQuery(name = "Tblcaja.findBySecegreso", query = "SELECT t FROM Tblcaja t WHERE t.secegreso = :secegreso"),
    @NamedQuery(name = "Tblcaja.findBySecingreso", query = "SELECT t FROM Tblcaja t WHERE t.secingreso = :secingreso"),
    @NamedQuery(name = "Tblcaja.findByTotal", query = "SELECT t FROM Tblcaja t WHERE t.total = :total")})
public class Tblcaja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECCAJA")
    private Integer seccaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECEGRESO")
    private int secegreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECINGRESO")
    private int secingreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TOTAL")
    private String total;

    public Tblcaja() {
    }

    public Tblcaja(Integer seccaja) {
        this.seccaja = seccaja;
    }

    public Tblcaja(Integer seccaja, int secegreso, int secingreso, String total) {
        this.seccaja = seccaja;
        this.secegreso = secegreso;
        this.secingreso = secingreso;
        this.total = total;
    }

    public Integer getSeccaja() {
        return seccaja;
    }

    public void setSeccaja(Integer seccaja) {
        this.seccaja = seccaja;
    }

    public int getSecegreso() {
        return secegreso;
    }

    public void setSecegreso(int secegreso) {
        this.secegreso = secegreso;
    }

    public int getSecingreso() {
        return secingreso;
    }

    public void setSecingreso(int secingreso) {
        this.secingreso = secingreso;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seccaja != null ? seccaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcaja)) {
            return false;
        }
        Tblcaja other = (Tblcaja) object;
        if ((this.seccaja == null && other.seccaja != null) || (this.seccaja != null && !this.seccaja.equals(other.seccaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblcaja[ seccaja=" + seccaja + " ]";
    }
    
}
