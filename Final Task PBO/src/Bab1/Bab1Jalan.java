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
public class Bab1Jalan {

    public void Percobaan1(){
        Percobaan1 anak = new Percobaan1();
        anak.setNrp(5);
        System.out.println(anak.nrp);
    }
    public void Percobaan2(){
        System.out.println("Hanya Source Code Di Bab1 Percobaan2");
    }
    public void Percobaan3(){
        System.out.println("Hanya Source Code Di Bab1 Percobaan3");
    }
    public void Lat1(){
        Latihan1TB tabung = new Latihan1TB(5000);
        System.out.println("Tabungan");
        System.out.println("Saldo Awal : " + tabung.saldo);
        tabung.ambilUang(2300);
        System.out.println("Jumlah Uang Diambil : 2300");
        System.out.println("Saldo sekarang : " + tabung.saldo);
    }
    
    public void Lat2(){
        System.out.println("Mahasiswa");
        Latihan2Mhs mhs=new Latihan2Mhs(12345, "Jono");
        System.out.println("NRP : " + mhs.getNrp());
        System.out.println("Nama : " + mhs.getNama());; 
    }
    
    public void Lat3(){
        System.out.println("Truk");
        Latihan3Truk truk = new Latihan3Truk(1000);
        System.out.println("Muatan Maksimal : "+ truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah Muatan : 500");
        truk.tambahMuatan(300.0);
        System.out.println("Tambah Muatan : 300");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah Muatan : 150");
        System.out.println("Mutan Sekarang = "+ truk.getMuatan());
    }
    
    public void Tugas1(){
        boolean status;
        System.out.println("Tabungan");
        Tugas1Tabungan tabungan = new Tugas1Tabungan(5000);
        System.out.println("Saldo awal : "+tabungan.getSaldo());
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status=tabungan.ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status=tabungan.ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        status=tabungan.ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo Sekarang = "+tabungan.getSaldo());
    }
    
    public void Tugas2(){
        boolean status;
        System.out.println("Truk");
        Tugas2Truk truk = new Tugas2Truk(900);
        
        System.out.println("Muatan Maksimal : "+truk.getMuatanMaks());
        status=truk.tambahMuatan(500.0);
        System.out.print("Tambah Muatan : 500");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        status=truk.tambahMuatan(300.0);
        System.out.print("Tambah Muatan : 300");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        status=truk.tambahMuatan(150.0);
        System.out.print("Tambah Muatan : 150");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        status=truk.tambahMuatan(50.0);
        System.out.print("Tambah Muatan : 50");
        if (status)
            System.out.println("    ok");
        else
            System.out.println("    gagal");
        System.out.println("Muatan Sekarang = "+truk.getMuatan());
    }
     
}
