/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4perbankan;

/**
 *
 * @author ALI
 */
public class PengambilanUang extends Tabungan{
    private int proteksi;
    
    public PengambilanUang(int saldo){
        super.saldo=saldo;
    }
    
    public PengambilanUang(int saldo, int tingkatBunga){
        super.saldo=saldo;
        proteksi=tingkatBunga;
    }
    
    public int getSaldo(){
        return super.saldo;
    }
    
    public boolean ambilUang(int jumlah){
        int bantu = super.saldo -proteksi;
        if(bantu>=jumlah){
            super.saldo=(int) (super.saldo-jumlah);
            return true;
        }else{
                    return false;}
    }
}
