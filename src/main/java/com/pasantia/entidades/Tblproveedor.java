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
@Table(name = "tblproveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblproveedor.findAll", query = "SELECT t FROM Tblproveedor t"),
    @NamedQuery(name = "Tblproveedor.findBySecpreveedor", query = "SELECT t FROM Tblproveedor t WHERE t.secpreveedor = :secpreveedor"),
    @NamedQuery(name = "Tblproveedor.findByNombre", query = "SELECT t FROM Tblproveedor t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tblproveedor.findByTelefono", query = "SELECT t FROM Tblproveedor t WHERE t.telefono = :telefono"),
    @NamedQuery(name = "Tblproveedor.findByDireccion", query = "SELECT t FROM Tblproveedor t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Tblproveedor.findByEmail", query = "SELECT t FROM Tblproveedor t WHERE t.email = :email"),
    @NamedQuery(name = "Tblproveedor.findBySecmunicipio", query = "SELECT t FROM Tblproveedor t WHERE t.secmunicipio = :secmunicipio"),
    @NamedQuery(name = "Tblproveedor.findByNit", query = "SELECT t FROM Tblproveedor t WHERE t.nit = :nit"),
    @NamedQuery(name = "Tblproveedor.findBySecentregapedido", query = "SELECT t FROM Tblproveedor t WHERE t.secentregapedido = :secentregapedido")})
public class Tblproveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECPREVEEDOR")
    private Integer secpreveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DIRECCION")
    private String direccion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECMUNICIPIO")
    private int secmunicipio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NIT")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECENTREGAPEDIDO")
    private int secentregapedido;

    public Tblproveedor() {
    }

    public Tblproveedor(Integer secpreveedor) {
        this.secpreveedor = secpreveedor;
    }

    public Tblproveedor(Integer secpreveedor, String nombre, String telefono, String direccion, String email, int secmunicipio, String nit, int secentregapedido) {
        this.secpreveedor = secpreveedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.secmunicipio = secmunicipio;
        this.nit = nit;
        this.secentregapedido = secentregapedido;
    }

    public Integer getSecpreveedor() {
        return secpreveedor;
    }

    public void setSecpreveedor(Integer secpreveedor) {
        this.secpreveedor = secpreveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSecmunicipio() {
        return secmunicipio;
    }

    public void setSecmunicipio(int secmunicipio) {
        this.secmunicipio = secmunicipio;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getSecentregapedido() {
        return secentregapedido;
    }

    public void setSecentregapedido(int secentregapedido) {
        this.secentregapedido = secentregapedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secpreveedor != null ? secpreveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblproveedor)) {
            return false;
        }
        Tblproveedor other = (Tblproveedor) object;
        if ((this.secpreveedor == null && other.secpreveedor != null) || (this.secpreveedor != null && !this.secpreveedor.equals(other.secpreveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblproveedor[ secpreveedor=" + secpreveedor + " ]";
    }
    
}
