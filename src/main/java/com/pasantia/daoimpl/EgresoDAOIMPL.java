/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblegreso;
import com.pasantia.dao.EgresoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class EgresoDAOIMPL implements EgresoDAO{
    @Override
    public Boolean insertaregreso(Tblegreso Tblegreso) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblegreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertaregreso egreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizaregreso(Tblegreso  Tblegreso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblegreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizaregreso egreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminaregreso(Tblegreso Tblegreso) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblegreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminaregreso   egreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblegreso> buscaregreso() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblegreso> egresos = new ArrayList<Tblegreso>();
        try {
            Query q = session.createQuery("from Tblegreso");
            egresos = q.list();
        } catch (Exception e) {
           egresos = null;
            System.err.println("Error al buscar buscaregreso: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
        return egresos;
      }
    }
      
    

