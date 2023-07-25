/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_a.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uts_a.dao.PlnDao;
import uts_a.dao.PlnDaoImpl;
import uts_a.dao.Koneksi;
import uts_a.model.Pln;
import uts_a.view.FormPln;

/**
 *
 * @author User
 */
public class PlnController {
    private FormPln formPln;
    private Pln pln;
    private PlnDao PlnDao;
    private Connection con;
    private Koneksi koneksi;
    
    public PlnController(FormPln formpln) {
        try {
            this.formPln = formpln;
            PlnDao = new PlnDaoImpl();
            con = new Koneksi().getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlnController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}