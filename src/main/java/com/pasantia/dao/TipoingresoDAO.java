/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tbltipoingreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface TipoingresoDAO {
      public Boolean insertartipoingreso(Tbltipoingreso Tbltipoingreso);
    public Boolean actualizartipoingreso(Tbltipoingreso Tbltipoingreso);
    public Boolean eliminartipoingreso(Tbltipoingreso Tbltipoingreso);
    public List<Tbltipoingreso> buscartipoingreso();   
}

