/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblentregapedido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface EntregapedidoDAO {
    public Boolean insertarentregapedido(Tblentregapedido Tblentregapedido);
    public Boolean actualizarentregapedido(Tblentregapedido Tblentregapedido);
    public Boolean eliminarentregapedido(Tblentregapedido Tblentregapedido);
    public List<Tblentregapedido> buscarentregapedido(); 
}
