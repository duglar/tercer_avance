/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tbldetallecompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface DetallecompraDAO {
   public Boolean insertardetallecompra(Tbldetallecompra Tbldetallecompra);
    public Boolean actualizardetallecompra(Tbldetallecompra Tbldetallecompra);
    public Boolean eliminardetallecompra(Tbldetallecompra Tbldepartamento);
    public List<Tbldetallecompra> buscardetallecompra();  
}
