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
@Table(name = "tblsucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblsucursal.findAll", query = "SELECT t FROM Tblsucursal t"),
    @NamedQuery(name = "Tblsucursal.findBySecsucursal", query = "SELECT t FROM Tblsucursal t WHERE t.secsucursal = :secsucursal"),
    @NamedQuery(name = "Tblsucursal.findByNombre", query = "SELECT t FROM Tblsucursal t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tblsucursal.findByDireccion", query = "SELECT t FROM Tblsucursal t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Tblsucursal.findByTelefono", query = "SELECT t FROM Tblsucursal t WHERE t.telefono = :telefono"),
    @NamedQuery(name = "Tblsucursal.findByEmail", query = "SELECT t FROM Tblsucursal t WHERE t.email = :email"),
    @NamedQuery(name = "Tblsucursal.findByNit", query = "SELECT t FROM Tblsucursal t WHERE t.nit = :nit")})
public class Tblsucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECSUCURSAL")
    private Integer secsucursal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TELEFONO")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NIT")
    private String nit;

    public Tblsucursal() {
    }

    public Tblsucursal(Integer secsucursal) {
        this.secsucursal = secsucursal;
    }

    public Tblsucursal(Integer secsucursal, String nombre, String direccion, String telefono, String email, String nit) {
        this.secsucursal = secsucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nit = nit;
    }

    public Integer getSecsucursal() {
        return secsucursal;
    }

    public void setSecsucursal(Integer secsucursal) {
        this.secsucursal = secsucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secsucursal != null ? secsucursal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblsucursal)) {
            return false;
        }
        Tblsucursal other = (Tblsucursal) object;
        if ((this.secsucursal == null && other.secsucursal != null) || (this.secsucursal != null && !this.secsucursal.equals(other.secsucursal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblsucursal[ secsucursal=" + secsucursal + " ]";
    }
    
}
