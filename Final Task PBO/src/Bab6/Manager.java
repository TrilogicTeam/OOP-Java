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
public class Manager extends Pegawai {
    private int tunjangan;
    
    public Manager(String nama, int gaji, int tunjangan){
        super(nama,gaji);
    }
    public void info(){
        System.out.println("Nama Manger : " + super.nama);
        System.out.println("Gaji        : " + super.gaji);
    }
    @Override
    public int infoGaji(){
        return super.gaji;
    }
    public int infoTunjangan(){
        return this.tunjangan;
    }
}
