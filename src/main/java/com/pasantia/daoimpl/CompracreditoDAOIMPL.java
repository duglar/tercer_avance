/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblcompracredito;
import com.pasantia.dao.CompracreditoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class CompracreditoDAOIMPL implements CompracreditoDAO {
    @Override
    public Boolean insertarcompracredito(Tblcompracredito Tblcompracredito) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblcompracredito);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarcompracreditocompracredito " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarcompracredito(Tblcompracredito Tblcompracredito) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblcompracredito);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarcompracredito compracredito " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarcompracredito(Tblcompracredito Tblcompracredito) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblcompracredito);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarcompracredito compracredito " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblcompracredito> buscarcompracredito() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblcompracredito>compracreditos= new ArrayList<Tblcompracredito>();
        try {
            Query q = session.createQuery("from Tblcompracredit");
            compracreditos = q.list();
        } catch (Exception e) {
            compracreditos = null;
            System.err.println("Error al buscar buscarcompracredit: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return compracreditos;
    
    }

}
