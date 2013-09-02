/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.daoimpl;
import com.pasantia.dao.TipoingresoDAO;
import com.pasantia.entidades.Tbltipoingreso;
import com.pasantia.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DUGLAR ZEMANATE
 */
public class  TipoingresoDAOIMPL  implements TipoingresoDAO  {
    @Override
    public Boolean insertartipoingreso(Tbltipoingreso Tbltipoingreso) {          
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.save(Tbltipoingreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en insertaripoingreso tipoingreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
       
    }

        @Override
    public Boolean actualizartipoingreso(Tbltipoingreso Tbltipoingreso  ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.update(Tbltipoingreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en actualizartipoingreso tipoingreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

        @Override
    public Boolean eliminartipoingreso(Tbltipoingreso Tbltipoingreso ) {
             Session session = HibernateUtil.getSessionFactory().openSession();
        boolean resultado = false;        
        try {
            session.beginTransaction();          
            session.delete(Tbltipoingreso);
            session.flush();
            session.beginTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            System.err.println("Error en eliminartipoegreso tipoingreso " + e.getMessage());
            session.beginTransaction().rollback();
            resultado = false;
        } finally {
            session.close();
        }
        return resultado;
    }

      @Override
    public List<Tbltipoingreso>  buscartipoingreso() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tbltipoingreso> tipoingresos = new ArrayList<Tbltipoingreso>();
        try {
            Query q = session.createQuery("from Tbltipoingreso");
           tipoingresos= q.list();
        } catch (Exception e) {
            tipoingresos = null;
            System.err.println("Error al buscar buscartipoingreso: " + e.getMessage());
            session.beginTransaction().rollback();
        } finally {
            session.close();
        }

        return tipoingresos;
    
    }    
}
