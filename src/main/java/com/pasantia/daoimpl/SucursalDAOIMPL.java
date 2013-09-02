/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblsucursal;
import com.pasantia.dao.SucursalDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class SucursalDAOIMPL implements SucursalDAO {
    @Override
    public Boolean insertarsucursal(Tblsucursal Tblsucursal) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblsucursal);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarsucursal sucursal " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarsucursal(Tblsucursal Tblsucursal  ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblsucursal);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarsucursal sucursal " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarsucursal(Tblsucursal Tblsucursal ) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblsucursal);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarsucursal sucursal " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblsucursal>  buscarsucursal() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblsucursal> sucursales = new ArrayList<Tblsucursal>();
        try {
            Query q = session.createQuery("from Tblsucursal");
           sucursales= q.list();
        } catch (Exception e) {
           sucursales= null;
            System.err.println("Error al buscar buscarsucursal: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return sucursales;
    
    }
}
