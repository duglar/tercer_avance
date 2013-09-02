/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblmunicipio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface MunicipioDAO {
     public Boolean insertarmunimipio(Tblmunicipio Tblmunicipio);
    public Boolean actualizarmunicipio(Tblmunicipio Tblmunicipio);
    public Boolean eliminarmunicipio(Tblmunicipio Tblmunicipio);
    public List<Tblmunicipio> buscarmunicipio(); 
    
}
