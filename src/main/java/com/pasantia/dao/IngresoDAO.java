/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblingreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface IngresoDAO {
  public Boolean insertaringreso(Tblingreso Tblingreso);
    public Boolean actualizaringreso(Tblingreso Tblingreso);
    public Boolean eliminaringreso(Tblingreso Tblingreso);
    public List<Tblingreso> buscaringreso();  
}
