/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblinventario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface InventarioDAO {
     public Boolean insertarinventario(Tblinventario Tblinventario);
    public Boolean actualizarinventario(Tblinventario Tblinventario);
    public Boolean eliminarinventario(Tblinventario Tblinventario);
    public List<Tblinventario> buscarinventario(); 
}
