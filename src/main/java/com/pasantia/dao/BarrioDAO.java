/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblbarrio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface BarrioDAO {
    public Boolean insertarBarrio(Tblbarrio Tblbarrio);
    public Boolean actualizarBarrio(Tblbarrio Tblbarrio);
    public Boolean eliminarBarrio(Tblbarrio Tblbarrio);
    public List<Tblbarrio> buscarBarrio();    
    
}
