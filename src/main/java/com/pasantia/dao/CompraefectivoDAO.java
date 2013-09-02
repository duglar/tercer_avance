/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblcompraefectivo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface CompraefectivoDAO {
    public Boolean insertarcompraefectivo(Tblcompraefectivo Tblcompraefectivo);
    public Boolean actualizarcompraefectivo(Tblcompraefectivo Tblcompraefectivo);
    public Boolean eliminarcompraefectivo(Tblcompraefectivo Tblcompraefectivo);
    public List<Tblcompraefectivo> buscarcompraefectivo();  
}
