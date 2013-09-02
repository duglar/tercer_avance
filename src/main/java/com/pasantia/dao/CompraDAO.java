/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblcompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface CompraDAO {
    public Boolean insertarCompra(Tblcompra tblCompra);
    public Boolean actualizarCompra(Tblcompra tblCompra);
    public Boolean eliminarCompra(Tblcompra tblcompra);
    public List<Tblcompra> buscarCompra();  
}
