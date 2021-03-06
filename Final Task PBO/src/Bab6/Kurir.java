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
public class Kurir extends Pegawai {
    
    public Kurir(String nama, int gaji) {
        super(nama, gaji);
    }
    public void info(){
        System.out.println("Nama Kurir : " + super.nama);
        System.out.println("Gaji       : " + super.gaji);
    }
    @Override
    public int infoGaji(){
        return super.gaji;
    }
    
}
