/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblcategoria;
import java.util.List;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public interface CategoriaDAO {
   
    public Boolean insertarCategoria(Tblcategoria tblcategoria);
    public Boolean actualizarCategoria(Tblcategoria tblcategoria);
    public Boolean eliminarCategoria(Tblcategoria tblcategoria);
   public List<Tblcategoria> buscarCategoria();    
}
