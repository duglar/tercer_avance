/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblcompracredito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface CompracreditoDAO {
    public Boolean insertarcompracredito(Tblcompracredito Tblcompracredito);
    public Boolean actualizarcompracredito(Tblcompracredito Tblcompracredito);
    public Boolean eliminarcompracredito(Tblcompracredito Tblcompracredito);
    public List<Tblcompracredito> buscarcompracredito();  
}
