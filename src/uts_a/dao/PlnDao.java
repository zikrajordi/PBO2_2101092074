/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_a.dao;

import java.sql.Connection;
import java.util.List;
import uts_a.model.Pln;


/**
 *
 * @author User
 */
public interface PlnDao {
    void insert(Connection con, Pln pln) throws Exception;
    void update(Connection con, Pln pln) throws Exception;
    void delete(Connection con, Pln pln) throws Exception;
    public Pln getPln(Connection con, String Kode) throws Exception;
    public List<Pln> getAllPln(Connection con) throws Exception;

    public List<Pln> getAllpln(Connection con);
}
