/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblbarrio;
import com.pasantia.dao.BarrioDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class BarrioDAOIMPLE implements BarrioDAO{
    
    @Override
    public Boolean insertarBarrio(Tblbarrio Tblbarrio) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblbarrio);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarbarrio barrio " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

    @Override
    public Boolean actualizarBarrio(Tblbarrio Tblbarrio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblbarrio);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarbarrio barrio " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

    @Override
    public Boolean eliminarBarrio(Tblbarrio Tblbarrio) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblbarrio);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarbarrio barrio " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

    @Override
    public List<Tblbarrio> buscarBarrio() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblbarrio> barrios = new ArrayList<Tblbarrio>();
        try {
            Query q = session.createQuery("from Tblbarrio");
          barrios = q.list();
        } catch (Exception e) {
           barrios = null;
            System.err.println("Error al buscar buscarbarrios: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return barrios;
    }

   
    
    
}
