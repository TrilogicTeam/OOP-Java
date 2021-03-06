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
public class Latihan3Truk {

    private double muatan;
    private double muatanmaks;

    public Latihan3Truk(double beratmaks){
    muatanmaks=beratmaks;
    }
    public double getMuatan(){
       return muatan; 
    }
    public double getMuatanMaks(){
        return muatanmaks;
    }
    public boolean tambahMuatan(double berat){
        if(muatanmaks>=muatan){
            muatan=muatan+berat;
            return true;
        }else{
            return false;
        }
    }

}

