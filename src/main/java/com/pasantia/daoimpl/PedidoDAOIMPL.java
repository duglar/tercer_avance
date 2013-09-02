/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tblpedido;
import com.pasantia.dao.PedidoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class PedidoDAOIMPL  implements PedidoDAO{
    @Override
    public Boolean insertarpedido(Tblpedido Tblpedido) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblpedido);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarpedido pedido " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarpedido(Tblpedido Tblpedido) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblpedido);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarpedido pedido " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarpedido (Tblpedido Tblpedido) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblpedido);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarpedido  pedido " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblpedido> buscarpedido() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblpedido> pedidos = new ArrayList<Tblpedido>();
        try {
            Query q = session.createQuery("from Tblpedido");
            pedidos = q.list();
        } catch (Exception e) {
            pedidos = null;
            System.err.println("Error al buscar buscarpedido: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return pedidos;
    
    }
    
}
