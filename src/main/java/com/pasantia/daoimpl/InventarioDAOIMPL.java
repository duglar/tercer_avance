/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblinventario;
import com.pasantia.dao.InventarioDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class InventarioDAOIMPL implements InventarioDAO {
     @Override
    public Boolean insertarinventario(Tblinventario Tblinventario) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblinventario);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarinventario nventario " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarinventario(Tblinventario  Tblinventario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblinventario);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizainventario inventario " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarinventario(Tblinventario Tblinventario) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblinventario);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarinventario  inventario " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblinventario> buscarinventario() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblinventario> inventarios = new ArrayList<Tblinventario>();
        try {
            Query q = session.createQuery("from Tblinventario");
            inventarios = q.list();
        } catch (Exception e) {
          inventarios = null;
            System.err.println("Error al buscar buscarinventario: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
        return inventarios;
      }
}
