/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasantia.dao;

import com.pasantia.entidades.Tbldepartamento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DUGLAR ZEMANATE
 */
@Local
public interface DepartamentoDAO {
    public Boolean insertardepartamento(Tbldepartamento Tbldepartamento);
    public Boolean actualizardepartamento(Tbldepartamento Tbldepartamento);
    public Boolean eliminardepartamento(Tbldepartamento Tbldepartamento);
    public List<Tbldepartamento> buscardepartamento();  
}
