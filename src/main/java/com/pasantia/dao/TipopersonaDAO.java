/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tbltipopersona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface TipopersonaDAO {
     public Boolean insertartipopersona(Tbltipopersona Tbltipopersona );
    public Boolean actualizartipopersona(Tbltipopersona Tbltipopersona);
    public Boolean eliminartipopersona(Tbltipopersona Tbltipopersona);
    public List<Tbltipopersona> buscartipopersona();    
}
