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
public class Latihan1TB {
    
    public int saldo;
    
    public Latihan1TB(int initsaldo){
       saldo=initsaldo;
    }
    public void ambilUang(int jumlah){
        saldo=saldo-jumlah;
    }

}


