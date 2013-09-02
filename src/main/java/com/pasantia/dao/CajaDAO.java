/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblcaja;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface CajaDAO {
     public Boolean insertarCaja(Tblcaja Tblcaja);
    public Boolean actualizarCaja(Tblcaja Tblcaja);
    public Boolean eliminarCaja(Tblcaja Tblcaja);
    public List<Tblcaja> buscarCaja();    

    
}
