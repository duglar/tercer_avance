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
@Table(name = "tblmarca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblmarca.findAll", query = "SELECT t FROM Tblmarca t"),
    @NamedQuery(name = "Tblmarca.findBySecmarca", query = "SELECT t FROM Tblmarca t WHERE t.secmarca = :secmarca"),
    @NamedQuery(name = "Tblmarca.findByNombreMarca", query = "SELECT t FROM Tblmarca t WHERE t.nombreMarca = :nombreMarca")})
public class Tblmarca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECMARCA")
    private Integer secmarca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE_MARCA")
    private String nombreMarca;

    public Tblmarca() {
    }

    public Tblmarca(Integer secmarca) {
        this.secmarca = secmarca;
    }

    public Tblmarca(Integer secmarca, String nombreMarca) {
        this.secmarca = secmarca;
        this.nombreMarca = nombreMarca;
    }

    public Integer getSecmarca() {
        return secmarca;
    }

    public void setSecmarca(Integer secmarca) {
        this.secmarca = secmarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secmarca != null ? secmarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblmarca)) {
            return false;
        }
        Tblmarca other = (Tblmarca) object;
        if ((this.secmarca == null && other.secmarca != null) || (this.secmarca != null && !this.secmarca.equals(other.secmarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblmarca[ secmarca=" + secmarca + " ]";
    }
    
}
