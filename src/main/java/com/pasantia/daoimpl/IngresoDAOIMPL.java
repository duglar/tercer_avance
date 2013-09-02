/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblingreso;
import com.pasantia.dao.IngresoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class IngresoDAOIMPL implements IngresoDAO {
     public Boolean insertaringreso(Tblingreso Tblingreso) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblingreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertaringreso ingreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizaringreso(Tblingreso  Tblingreso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblingreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizaringreso ingreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminaringreso(Tblingreso Tblingreso) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblingreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminaringreso ingreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblingreso> buscaringreso() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblingreso> ingresos= new ArrayList<Tblingreso>();
        try {
            Query q = session.createQuery("from Tblingreso");
          ingresos = q.list();
        } catch (Exception e) {
          ingresos = null;
            System.err.println("Error al buscar buscaringreso: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
        return ingresos;
      }
}
