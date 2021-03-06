/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1;

/**
 *
 * @author ALI
 */
public class Tugas1Tabungan {
    private int saldo;
    
    public Tugas1Tabungan(int initsaldo){
        saldo=initsaldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void simpanUang(int jumlah){
        saldo=saldo+jumlah;
    }
    public boolean ambilUang(int jumlah){
        if (saldo>=jumlah){
            saldo=saldo-jumlah;
            return true;
        }else{
            return false;
        }
    }
    
    
}
