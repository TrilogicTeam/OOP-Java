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
public class Tugas2Truk {
    private double muatan;
    private double muatanmaks;

    public Tugas2Truk(double beratmaks){
    kiloToNewts(beratmaks);
    muatanmaks=beratmaks;
    }
    public double getMuatan(){
       return kiloToNewts(muatan); 
    }
    public double getMuatanMaks(){
        return muatanmaks;
    }
    public boolean tambahMuatan(double berat){
        kiloToNewts(berat);
        if(muatanmaks>muatan+berat){
            muatan=muatan+berat;
            return true;
        }else{
            muatan=muatan;
            return false;
        }
    }
    public double newtsToKilo(double berat){
        return berat/9.8;
    }
    public double kiloToNewts(double berat){
        return berat*9.8;
    }
    
    
    }

