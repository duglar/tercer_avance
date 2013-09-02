/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblvisitapedidos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface VisitapedidosDAO {
    public Boolean insertarvisitapedido(Tblvisitapedidos Tblvisitapedidos );
    public Boolean actualizarvisitapedido(Tblvisitapedidos Tblvisitapedidos);
    public Boolean  eliminarvisitapedido(Tblvisitapedidos Tblvisitapedidos);
    public List<Tblvisitapedidos> buscarvisitapedido(); 
}
