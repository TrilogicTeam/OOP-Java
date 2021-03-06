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
public class Bab6Jalan {
    
    public void Percobaan(){
        Parent tes = new Child();
        System.out.println("Nilai x = " + tes.x);
        tes.info();
    }
    public void Proses(Pegawai peg) {
        if(peg instanceof Manager){
            System.out.println("Lakukan Tugas Sebagai Manager (LIKE A BOSS)");
        }else if(peg instanceof Kurir){
            System.out.println("Lakukan Pengeriman Barang");
        }else System.out.println("Cari Kegiatan lain deh");
    }
    public void Latihan(){
        Manager man = new Manager("Ali",500,80);
        Kurir kur = new Kurir("JNE",100);
        man.info();
        Proses(man);
        kur.info();
        Proses(kur);
    }
    public void Tugas(){
        Manager man = new Manager("Agus",800,50);
        Programmer prog = new Programmer("Budi",600,30);
        Bayaran hr= new Bayaran();
        System.out.println("Bayaran untuk Manager : " + hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer : "+ hr.hitungBayaran(prog));
    }
}
