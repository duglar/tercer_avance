/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.dao.EntregapedidoDAO;
import com.pasantia.dao.InventarioDAO;
import com.pasantia.entidades.Tblentregapedido;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */

 
   public class EntregapedidoDAOIMPL implements EntregapedidoDAO{
       
    public Boolean insertarentregapedido(Tblentregapedido Tblentregapedido) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tblentregapedido);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertarentregapedido entregapedido " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizarentregapedido(Tblentregapedido Tblentregapedido) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tblentregapedido);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizarentregapedido entregapedido " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminarentregapedido(Tblentregapedido Tblentregapedido) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tblentregapedido);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminarentregapedido  entregapedido " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tblentregapedido> buscarentregapedido() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tblentregapedido> entregapedidos = new ArrayList<Tblentregapedido>();
        try {
            Query q = session.createQuery("from Tblentregapedido");
            entregapedidos = q.list();
        } catch (Exception e) {
          entregapedidos = null;
            System.err.println("Error al buscar buscarentregapedido: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }
        return entregapedidos;
      }
}


