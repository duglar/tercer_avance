/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblpedido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface PedidoDAO {
    public Boolean insertarpedido(Tblpedido Tblpedido);
    public Boolean actualizarpedido(Tblpedido Tblpedido);
    public Boolean eliminarpedido(Tblpedido Tblpedido);
    public List<Tblpedido> buscarpedido(); 
}
