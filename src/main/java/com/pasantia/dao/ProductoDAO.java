/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblproducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface ProductoDAO {
     public Boolean insertarproducto(Tblproducto Tblproducto);
    public Boolean actualizarproducto(Tblproducto Tblproducto);
    public Boolean eliminarproducto(Tblproducto Tblproducto);
    public List<Tblproducto> buscarproducto();  
}
