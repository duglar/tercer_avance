/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblmarca;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface MarcaDAO {
    public Boolean insertarmarca(Tblmarca Tblmarca);
    public Boolean actualizarmarca(Tblmarca Tblmarca);
    public Boolean eliminarmarca(Tblmarca Tblmarca);
    public List<Tblmarca> buscarmarca(); 
}
