/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblformapago;
import com.pasantia.dao.FormapagoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class FormapagoDAOIMPL  implements FormapagoDAO{
    public Boolean insertarformapago(Tblformapago Tblformapago) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblformapago);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarformapago formapago  " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarformapago(Tblformapago  Tblformapago) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblformapago);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarformapago formapago " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarformapago(Tblformapago Tblformapago) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblformapago);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarformapago formapago " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblformapago> buscarformapago() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblformapago> formapagos = new ArrayList<Tblformapago>();
        try {
            Query q = session.createQuery("from Tblformapago");
           formapagos = q.list();
        } catch (Exception e) {
          formapagos = null;
            System.err.println("Error al buscar buscarformapago: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
        return formapagos;
      }
}
