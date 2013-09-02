/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tbltipoegreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface TipoegresoDAO {
     public Boolean insertartipoegreso(Tbltipoegreso Tbltipoegreso);
    public Boolean actualizartipoegreso(Tbltipoegreso Tbltipoegreso);
    public Boolean eliminartipoegreso(Tbltipoegreso Tbltipoegreso);
    public List<Tbltipoegreso> buscartipoegreso();   
}
