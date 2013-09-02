/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;


import com.pasantia.dao.CajaDAO;
import com.pasantia.dao.CajaDAO;
import com.pasantia.entidades.Tblcaja;
import com.pasantia.hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author El autor es Jennifer
 */

@Stateless
public class CajaDAOIMPL implements CajaDAO{

    @Override
    public Boolean insertarCaja(Tblcaja Tblcaja) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblcaja);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarcaja caja " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

    @Override
    public Boolean actualizarCaja(Tblcaja Tblcaja) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblcaja);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarcaja caja " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

    @Override
    public Boolean eliminarCaja(Tblcaja Tblcaja) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblcaja);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarcaja caja " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

    @Override
    public List<Tblcaja> buscarCaja() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblcaja> cajas = new ArrayList<Tblcaja>();
        try {
            Query q = session.createQuery("from Tblcaja");
          cajas = q.list();
        } catch (Exception e) {
            cajas = null;
            System.err.println("Error al buscar buscarcajas: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return cajas;
    }

   
    
}
