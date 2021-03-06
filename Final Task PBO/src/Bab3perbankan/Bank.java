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
public class Bank {
    private Nasabah nasabah;
    private int jumlahNasabah;
    
    public Bank(){
        
    }
    public void tambahNasabah(String namaAwal, String namaAkhir){
        this.nasabah=nasabah;
        System.out.println("Nama Nasabah"+nasabah.getNamaAkhir()+" "+nasabah.getNamaAkhir());
    }
    public int getjumlahNasabah(){
        return jumlahNasabah;
    }
    public Nasabah getNasabah(int indeks){
        return nasabah;
    }
}
