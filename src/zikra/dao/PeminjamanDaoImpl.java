/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zikra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import zikra.model.Peminjaman;

/**
 *
 * @author User
 */
public class PeminjamanDaoImpl implements PeminjamanDao {

    @Override
    public void insert(Connection con, Peminjaman peminjaman) throws Exception {
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
    }

    @Override
    public void update(Connection con, Peminjaman peminjaman) throws Exception {
        String sql = "update peminjaman set tglkembali=? "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglkembali());
        ps.setString(2, peminjaman.getKodeanggota());
        ps.setString(3, peminjaman.getKodebuku());
        ps.setString(4, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }

    @Override
    public void delete(Connection con, Peminjaman peminjaman) throws Exception {
        String sql = "delete from peminjaman "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }

    @Override
    public Peminjaman getPeminjaman(Connection con, 
        String kodeanggota, String kodebuku, String tglpinjam) throws Exception {
        String sql = "select * from peminjaman "
               + "where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if (rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }

    @Override
    public List<Peminjaman> getAllPeminjaman(Connection con) throws Exception {
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        Peminjaman peminjaman = null;
        while (rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }

    @Override
    public int getSelisihTanggal(Connection con, String tgl1, String tgl2) throws Exception {
        int hasil = 0;
        String sql = "select datediff(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            hasil = rs.getInt(1);
        }
        return hasil;
    }
    
}
