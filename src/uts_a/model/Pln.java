/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_a.model;

/**
 *
 * @author User
 */
public class Pln {
    private String kodepelanggan;
    private String namapelanggan;
    private String mbi;
    private String mbl;
    private String tarif;
    private String potongan;
    private String total;
    
    
     public Pln(){
        
    }

    public Pln(String kodepelanggan, String namapelanggan, String mbi, String mbl, String tarif, String potongan
    , String total) {
        this.kodepelanggan = kodepelanggan;
        this.namapelanggan = namapelanggan;
        this.mbi = mbi;
        this.mbl = mbl;
        this.tarif = tarif;
        this.potongan = potongan;
        this.total = total;
    }
    

    public String getKodepelanggan() {
        return kodepelanggan;
    }

    public void setKodepelanggan(String kodepelanggan) {
        this.kodepelanggan = kodepelanggan;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getMbi() {
        return mbi;
    }

    public void setMbi(String mbi) {
        this.mbi = mbi;
    }

    public String getMbl() {
        return mbl;
    }

    public void setMbl(String mbl) {
        this.mbl = mbl;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getPotongan() {
        return potongan;
    }

    public void setPotongan(String potongan) {
        this.potongan = potongan;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

   
}
