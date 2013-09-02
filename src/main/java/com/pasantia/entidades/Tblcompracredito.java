/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Entity
@Table(name = "tblcompracredito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcompracredito.findAll", query = "SELECT t FROM Tblcompracredito t"),
    @NamedQuery(name = "Tblcompracredito.findBySecompracredito", query = "SELECT t FROM Tblcompracredito t WHERE t.secompracredito = :secompracredito"),
    @NamedQuery(name = "Tblcompracredito.findByFechaPago", query = "SELECT t FROM Tblcompracredito t WHERE t.fechaPago = :fechaPago"),
    @NamedQuery(name = "Tblcompracredito.findByPagado", query = "SELECT t FROM Tblcompracredito t WHERE t.pagado = :pagado")})
public class Tblcompracredito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECOMPRACREDITO")
    private Integer secompracredito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAGADO")
    private int pagado;

    public Tblcompracredito() {
    }

    public Tblcompracredito(Integer secompracredito) {
        this.secompracredito = secompracredito;
    }

    public Tblcompracredito(Integer secompracredito, Date fechaPago, int pagado) {
        this.secompracredito = secompracredito;
        this.fechaPago = fechaPago;
        this.pagado = pagado;
    }

    public Integer getSecompracredito() {
        return secompracredito;
    }

    public void setSecompracredito(Integer secompracredito) {
        this.secompracredito = secompracredito;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secompracredito != null ? secompracredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcompracredito)) {
            return false;
        }
        Tblcompracredito other = (Tblcompracredito) object;
        if ((this.secompracredito == null && other.secompracredito != null) || (this.secompracredito != null && !this.secompracredito.equals(other.secompracredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblcompracredito[ secompracredito=" + secompracredito + " ]";
    }
    
}
