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
@Table(name = "tblcliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcliente.findAll", query = "SELECT t FROM Tblcliente t"),
    @NamedQuery(name = "Tblcliente.findBySeccliente", query = "SELECT t FROM Tblcliente t WHERE t.seccliente = :seccliente"),
    @NamedQuery(name = "Tblcliente.findByNombres", query = "SELECT t FROM Tblcliente t WHERE t.nombres = :nombres"),
    @NamedQuery(name = "Tblcliente.findByApellidos", query = "SELECT t FROM Tblcliente t WHERE t.apellidos = :apellidos"),
    @NamedQuery(name = "Tblcliente.findByCedula", query = "SELECT t FROM Tblcliente t WHERE t.cedula = :cedula"),
    @NamedQuery(name = "Tblcliente.findByDireccion", query = "SELECT t FROM Tblcliente t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Tblcliente.findByTelefono", query = "SELECT t FROM Tblcliente t WHERE t.telefono = :telefono"),
    @NamedQuery(name = "Tblcliente.findByEmail", query = "SELECT t FROM Tblcliente t WHERE t.email = :email")})
public class Tblcliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECCLIENTE")
    private Integer seccliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CEDULA")
    private String cedula;
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

    public Tblcliente() {
    }

    public Tblcliente(Integer seccliente) {
        this.seccliente = seccliente;
    }

    public Tblcliente(Integer seccliente, String nombres, String apellidos, String cedula, String direccion, String telefono, String email) {
        this.seccliente = seccliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getSeccliente() {
        return seccliente;
    }

    public void setSeccliente(Integer seccliente) {
        this.seccliente = seccliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seccliente != null ? seccliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcliente)) {
            return false;
        }
        Tblcliente other = (Tblcliente) object;
        if ((this.seccliente == null && other.seccliente != null) || (this.seccliente != null && !this.seccliente.equals(other.seccliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblcliente[ seccliente=" + seccliente + " ]";
    }
    
}
