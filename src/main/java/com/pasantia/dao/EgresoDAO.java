/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblegreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface EgresoDAO {
     public Boolean insertaregreso(Tblegreso Tblegreso);
    public Boolean actualizaregreso(Tblegreso Tblegreso);
    public Boolean eliminaregreso(Tblegreso Tblegreso);
    public List<Tblegreso> buscaregreso(); 
}
