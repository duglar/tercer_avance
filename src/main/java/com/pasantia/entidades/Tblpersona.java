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
@Table(name = "tblpersona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpersona.findAll", query = "SELECT t FROM Tblpersona t"),
    @NamedQuery(name = "Tblpersona.findBySecpersona", query = "SELECT t FROM Tblpersona t WHERE t.secpersona = :secpersona"),
    @NamedQuery(name = "Tblpersona.findByPrimerNombre", query = "SELECT t FROM Tblpersona t WHERE t.primerNombre = :primerNombre"),
    @NamedQuery(name = "Tblpersona.findBySegundoNombre", query = "SELECT t FROM Tblpersona t WHERE t.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Tblpersona.findByPrimerApellido", query = "SELECT t FROM Tblpersona t WHERE t.primerApellido = :primerApellido"),
    @NamedQuery(name = "Tblpersona.findBySegundoApellido", query = "SELECT t FROM Tblpersona t WHERE t.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Tblpersona.findByTelefono", query = "SELECT t FROM Tblpersona t WHERE t.telefono = :telefono"),
    @NamedQuery(name = "Tblpersona.findByDireccion", query = "SELECT t FROM Tblpersona t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Tblpersona.findByEmail", query = "SELECT t FROM Tblpersona t WHERE t.email = :email"),
    @NamedQuery(name = "Tblpersona.findBySecsexo", query = "SELECT t FROM Tblpersona t WHERE t.secsexo = :secsexo"),
    @NamedQuery(name = "Tblpersona.findBySectipopersona", query = "SELECT t FROM Tblpersona t WHERE t.sectipopersona = :sectipopersona"),
    @NamedQuery(name = "Tblpersona.findBySecmunicipio", query = "SELECT t FROM Tblpersona t WHERE t.secmunicipio = :secmunicipio"),
    @NamedQuery(name = "Tblpersona.findBySecdocumento", query = "SELECT t FROM Tblpersona t WHERE t.secdocumento = :secdocumento")})
public class Tblpersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECPERSONA")
    private Integer secpersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
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
    @Column(name = "SECSEXO")
    private int secsexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECTIPOPERSONA")
    private int sectipopersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECMUNICIPIO")
    private int secmunicipio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECDOCUMENTO")
    private int secdocumento;

    public Tblpersona() {
    }

    public Tblpersona(Integer secpersona) {
        this.secpersona = secpersona;
    }

    public Tblpersona(Integer secpersona, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion, String email, int secsexo, int sectipopersona, int secmunicipio, int secdocumento) {
        this.secpersona = secpersona;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.secsexo = secsexo;
        this.sectipopersona = sectipopersona;
        this.secmunicipio = secmunicipio;
        this.secdocumento = secdocumento;
    }

    public Integer getSecpersona() {
        return secpersona;
    }

    public void setSecpersona(Integer secpersona) {
        this.secpersona = secpersona;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
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

    public int getSecsexo() {
        return secsexo;
    }

    public void setSecsexo(int secsexo) {
        this.secsexo = secsexo;
    }

    public int getSectipopersona() {
        return sectipopersona;
    }

    public void setSectipopersona(int sectipopersona) {
        this.sectipopersona = sectipopersona;
    }

    public int getSecmunicipio() {
        return secmunicipio;
    }

    public void setSecmunicipio(int secmunicipio) {
        this.secmunicipio = secmunicipio;
    }

    public int getSecdocumento() {
        return secdocumento;
    }

    public void setSecdocumento(int secdocumento) {
        this.secdocumento = secdocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secpersona != null ? secpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblpersona)) {
            return false;
        }
        Tblpersona other = (Tblpersona) object;
        if ((this.secpersona == null && other.secpersona != null) || (this.secpersona != null && !this.secpersona.equals(other.secpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblpersona[ secpersona=" + secpersona + " ]";
    }
    
}
