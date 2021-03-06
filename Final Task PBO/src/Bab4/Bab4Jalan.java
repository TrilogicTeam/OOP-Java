/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4;
import Bab4perbankan.*;
/**
 *
 * @author ALI
 */
public class Bab4Jalan {
    class parent{
        public int x=5;
    }
    class child extends parent{
        public int x=10;
    
    public void info(int x){
        System.out.println("Nilai X sebagai parameter = "+x);
        System.out.println("Data member x di class child = " + this.x);
        System.out.println("Data member x di class child = " + super.x);
        }
    }
    public void Percobaan1(){
        child tes = new child();
        tes.info(20);
    }
    public void Percobaan2(){
        System.out.println("Hanya Source Code Di Bab4 Percobaan2");
    }
    public void Percobaan3(){
        System.out.println("Hanya Source Code Di Bab4 Percobaan2");
    }    
    public void Latihan(){
        PenyimpananUang tabungan = new PenyimpananUang(5000,8.5/100);
        System.out.println("Uang yang ditabung : 5000");
        System.out.println("Tingkat bunga sekarang : 8,5%");
        System.out.println("Total uang sekarang : " + tabungan.cekUang());
    }
    
    public void Tugas(){
        PengambilanUang tabungan = new PengambilanUang(5000,1000);
        System.out.println("uang yang ditabung : 5000");
        System.out.println("Uang yang diproteksi : 1000");
        System.out.println("------");
        System.out.println("Uang yang akan diambil : 4500 "+ tabungan.ambilUang(4500));
        System.out.println("Saldo sekarang : "+ tabungan.getSaldo());
        System.out.println("------");
        System.out.println("Uang yang akan diambil : 2500 "+ tabungan.ambilUang(2500));
        System.out.println("Saldo sekarang : "+ tabungan.getSaldo());
    }
}
