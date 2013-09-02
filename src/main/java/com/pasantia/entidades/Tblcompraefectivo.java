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
@Table(name = "tblcompraefectivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblcompraefectivo.findAll", query = "SELECT t FROM Tblcompraefectivo t"),
    @NamedQuery(name = "Tblcompraefectivo.findBySeccompraefectivo", query = "SELECT t FROM Tblcompraefectivo t WHERE t.seccompraefectivo = :seccompraefectivo"),
    @NamedQuery(name = "Tblcompraefectivo.findBySeccompra", query = "SELECT t FROM Tblcompraefectivo t WHERE t.seccompra = :seccompra"),
    @NamedQuery(name = "Tblcompraefectivo.findByFechaPago", query = "SELECT t FROM Tblcompraefectivo t WHERE t.fechaPago = :fechaPago"),
    @NamedQuery(name = "Tblcompraefectivo.findByPagado", query = "SELECT t FROM Tblcompraefectivo t WHERE t.pagado = :pagado")})
public class Tblcompraefectivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SECCOMPRAEFECTIVO")
    private Integer seccompraefectivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCOMPRA")
    private int seccompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAGADO")
    private int pagado;

    public Tblcompraefectivo() {
    }

    public Tblcompraefectivo(Integer seccompraefectivo) {
        this.seccompraefectivo = seccompraefectivo;
    }

    public Tblcompraefectivo(Integer seccompraefectivo, int seccompra, Date fechaPago, int pagado) {
        this.seccompraefectivo = seccompraefectivo;
        this.seccompra = seccompra;
        this.fechaPago = fechaPago;
        this.pagado = pagado;
    }

    public Integer getSeccompraefectivo() {
        return seccompraefectivo;
    }

    public void setSeccompraefectivo(Integer seccompraefectivo) {
        this.seccompraefectivo = seccompraefectivo;
    }

    public int getSeccompra() {
        return seccompra;
    }

    public void setSeccompra(int seccompra) {
        this.seccompra = seccompra;
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
        hash += (seccompraefectivo != null ? seccompraefectivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblcompraefectivo)) {
            return false;
        }
        Tblcompraefectivo other = (Tblcompraefectivo) object;
        if ((this.seccompraefectivo == null && other.seccompraefectivo != null) || (this.seccompraefectivo != null && !this.seccompraefectivo.equals(other.seccompraefectivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasantia.entidades.Tblcompraefectivo[ seccompraefectivo=" + seccompraefectivo + " ]";
    }
    
}
