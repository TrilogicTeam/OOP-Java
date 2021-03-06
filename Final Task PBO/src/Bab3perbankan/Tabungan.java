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
public class Tabungan {
     private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
        
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        this.saldo=saldo+jumlah;
    }
    public boolean ambilUang(int jumlah){
        if(saldo>=jumlah){
            this.saldo=saldo-jumlah;
            return true;
        }else{
            return false;
        }
        
    }
}
