/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;

import com.pasantia.entidades.Tbltipoegreso;
import com.pasantia.dao.TipoegresoDAO;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class TipoegresoDAOIMPL  implements TipoegresoDAO{
@Override
    public Boolean insertartipoegreso(Tbltipoegreso Tbltipoegreso) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tbltipoegreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertaripoegreso tipoegreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizartipoegreso(Tbltipoegreso Tbltipoegreso  ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tbltipoegreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizartipoegreso tipoegreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminartipoegreso(Tbltipoegreso Tbltipoegreso ) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tbltipoegreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminartipoegresotipoegreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tbltipoegreso>  buscartipoegreso() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tbltipoegreso> tipoegresos = new ArrayList<Tbltipoegreso>();
        try {
            Query q = session.createQuery("from Tbltipoegreso");
           tipoegresos= q.list();
        } catch (Exception e) {
            tipoegresos = null;
            System.err.println("Error al buscar buscartipoegreso: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return tipoegresos;
    
    }    
}
