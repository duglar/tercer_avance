/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblvisitapedidos;
import com.pasantia.dao.VisitapedidosDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class VisitaspedidosDAOIMPL  implements VisitapedidosDAO{
    @Override
    public Boolean insertarvisitapedido(Tblvisitapedidos Tblvisitapedidos) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblvisitapedidos);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarvisitapedidos visitapedidos " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarvisitapedido(Tblvisitapedidos Tblvisitapedidos  ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblvisitapedidos);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarvisitapedidos visitapedidos " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarvisitapedido(Tblvisitapedidos Tblvisitapedidos ) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblvisitapedidos);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarvisitapedidos visitapedidos " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblvisitapedidos>  buscarvisitapedido() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblvisitapedidos> visitapedidos = new ArrayList<Tblvisitapedidos>();
        try {
            Query q = session.createQuery("from Tblvisitapedidos");
            visitapedidos= q.list();
        } catch (Exception e) {
             visitapedidos = null;
            System.err.println("Error al buscar buscarvisitapedidos: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return  visitapedidos;
    
    }   
}
