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
public class PenyimpananUang extends Tabungan{
    private double tingkatBunga;
    
    public PenyimpananUang(int saldo, double tingkatBunga){
        this.saldo = saldo;
        this.tingkatBunga = tingkatBunga;
    }
    
    public double cekUang(){
        super.saldo=(int) (super.saldo+(super.saldo*tingkatBunga));
        return super.saldo;
    }
}
