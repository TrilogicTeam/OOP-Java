/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author ALI
 */
public class Bayaran {
    public int hitungBayaran(Pegawai peg){
        int uang=peg.infoGaji();
        if(peg instanceof Manager) 
            uang+=((Manager)peg).infoTunjangan();
        else if(peg instanceof Programmer) 
            uang+=((Programmer)peg).infoBonus();
        return uang;
    }
}
