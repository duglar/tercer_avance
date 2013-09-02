/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblcompraefectivo;
import com.pasantia.dao.CompraefectivoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class CompraefectivoDAOIMPLE  implements CompraefectivoDAO{
    @Override
    public Boolean insertarcompraefectivo(Tblcompraefectivo Tblcompraefectivo) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblcompraefectivo);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarcompraefectivo compraefectivo " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarcompraefectivo(Tblcompraefectivo Tblcompraefectivo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblcompraefectivo);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarcompraefectivo compraefectivo " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarcompraefectivo(Tblcompraefectivo Tblcompraefectivo) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblcompraefectivo);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarcompraefectivocompraefectivo " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblcompraefectivo> buscarcompraefectivo() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblcompraefectivo> compraefectivo= new ArrayList<Tblcompraefectivo>();
        try {
            Query q = session.createQuery("from  tblcompraefectivo");
            compraefectivo = q.list();
        } catch (Exception e) {
             compraefectivo = null;
            System.err.println("Error al buscar buscar compraefectivo: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return  compraefectivo;
    
    }
}
