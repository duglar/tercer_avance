/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.dao.DepartamentoDAO;
import com.pasantia.entidades.Tbldepartamento;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class DepartamentoDAOIMPL  implements DepartamentoDAO {
    
    
    @Override
    public Boolean insertardepartamento(Tbldepartamento tbldepartamento) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(tbldepartamento);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertardepartamento Departamento " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizardepartamento(Tbldepartamento tbldepartamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(tbldepartamento);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizardepartamento departamento " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminardepartamento(Tbldepartamento tbldepartamento) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(tbldepartamento);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminartbldepartamento   departamento " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tbldepartamento> buscardepartamento() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tbldepartamento> departamentos = new ArrayList<Tbldepartamento>();
        try {
            Query q = session.createQuery("from Tbldepatamento");
            departamentos = q.list();
        } catch (Exception e) {
            departamentos = null;
            System.err.println("Error al buscar buscardepartamentos: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return departamentos;
    
    }

   
    
}
