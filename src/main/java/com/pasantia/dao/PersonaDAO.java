/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblpersona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface PersonaDAO {
 public Boolean insertarpersona(Tblpersona Tblpersona);
    public Boolean actualizarpersona(Tblpersona Tblpersona);
    public Boolean eliminarpersona(Tblpersona Tblpersona);
    public List<Tblpersona> buscarpersona(); 
}
