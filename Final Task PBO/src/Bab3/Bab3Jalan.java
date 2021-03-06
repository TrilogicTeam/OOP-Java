/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3;
import Bab3perbankan.*;
/**
 *
 * @author ALI
 */
public class Bab3Jalan {
    
    public void Percobaan1(){
        System.out.println("Hanya Source Kode Di Bab3 Percobaan1");
    }
    public void Percobaan2(){
        System.out.println("Hanya Source Kode Di Bab3 Percobaan2");
    }
    public void Percobaan3(){
        System.out.println("Hanya Source Code Di Bab3Sekolah");
    }
    public void Latihan(){
        int tmp;
        boolean status;
        Nasabah nasabah=new Nasabah("Agus","Daryanto");
        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() +" "+ nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan(5000));
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Awal : " + tmp);
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status=nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000 ");
        if(status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status=nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000 ");
        if(status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        status=nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600 ");
        if(status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Sekarang : "+ tmp);
    }
    
    public void Tugas(){
        int tmp;
        boolean status;
        Nasabah nasabah=new Nasabah("Agus","Daryanto");
        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() +" "+ nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan(5000));
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Awal : " + tmp);
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status=nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000 ");
        if(status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status=nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000 ");
        if(status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        status=nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600 ");
        if(status)
            System.out.println("Ok");
        else
            System.out.println("Gagal");
        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Sekarang : "+ tmp);
    }
    
}
    

