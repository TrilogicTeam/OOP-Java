/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3perbankan;
/**
 *
 * @author ALI
 */
public class Nasabah {
     private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAkhir=namaAkhir;
        this.namaAwal=namaAwal;
        
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan=tabungan;
    }
}
