/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tblsucursal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface SucursalDAO {
    public Boolean insertarsucursal(Tblsucursal Tblsucursal);
    public Boolean actualizarsucursal(Tblsucursal Tblsucursal);
    public Boolean eliminarsucursal(Tblsucursal Tblsucursal);
    public List<Tblsucursal> buscarsucursal();  
}
