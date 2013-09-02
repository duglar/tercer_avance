/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblformapago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface FormapagoDAO {
      public Boolean insertarformapago(Tblformapago Tblformapago);
    public Boolean actualizarformapago(Tblformapago Tblformapago);
    public Boolean eliminarformapago(Tblformapago Tblformapago);
    public List<Tblformapago> buscarformapago();
}
