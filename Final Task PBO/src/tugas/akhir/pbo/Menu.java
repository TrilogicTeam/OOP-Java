/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.pbo;
import Bab1.*;
import Bab2.*;
import Bab3.*;
import Bab4.*;
import Bab5.*;
import Bab6.*;
import java.util.Scanner;
/**
 *
 * @author ALI
 */
public class Menu {
    private String nama;
    private int bab;
    private int subBab;
    
    Scanner input = new Scanner(System.in);
    public void nama(){
        System.out.print("Siapa namamu ? ");
        nama = input.nextLine();
    }
    public void error(){
        System.out.println("Pilihan Yang Anda Pilih Tidak Tersedia !!!");
        back();
    }
    public void back(){
        char opsi;
        System.out.println("");
        System.out.print("Ingin Kembali Ke Menu (y/n) ???");
        opsi = input.next().charAt(0);
        if(opsi=='y'){
            pembuka();
        }else{
            selesai();
        }
    } 
    public void selesai(){
        for(int i=0;i<20;i++){
            System.out.println(" ");
        }
        System.out.println("    === TERIMA KASIH ===");
        System.out.println("+++ MENCOBA PROGRAM SAYA +++");
        System.out.println("        +  == ALI == +");
    }
    
    public void pilihan(int bab, int subbab){
        if(bab==1){
            Bab1Jalan ali = new Bab1Jalan();
            if(subbab==1){ali.Percobaan1();back();
            }else if(subbab==2){ali.Percobaan2();back();
            }else if(subbab==3){ali.Percobaan3();back();
            }else if(subbab==4){ali.Lat1();back();
            }else if(subbab==5){ali.Lat2();back();
            }else if(subbab==6){ali.Lat3();back();
            }else if(subbab==7){ali.Tugas1();back();
            }else if(subbab==8){ali.Tugas2();back();}
            else{error();}
        }else if(bab==2){
            Bab2Jalan ali = new Bab2Jalan();
            if(subbab==1){ali.Percobaan1();back();
            }else if(subbab==2){ali.Percobaan2();back();
            }else if(subbab==3){ali.Latihan();back();}
            else{error();}
        }else if(bab==3){
            Bab3Jalan ali = new Bab3Jalan();
            if(subbab==1){ali.Percobaan1();back();}
            else if(subbab==2){ali.Percobaan2();back();}
            else if(subbab==3){ali.Percobaan3();back();}
            else if(subbab==4){ali.Latihan();back();}
            else if(subbab==5){ali.Tugas();back();}
            else{error();}
        }else if(bab==4){
            Bab4Jalan ali = new Bab4Jalan();
            if(subbab==1){ali.Percobaan1();back();}
            else if(subbab==2){ali.Percobaan2();back();}
            else if(subbab==3){ali.Percobaan3();back();}
            else if(subbab==4){ali.Latihan();back();}
            else if(subbab==5){ali.Tugas();back();}
            else{error();}
        }else if(bab==5){
            Bab5Jalan ali = new Bab5Jalan();
            if(subbab==1){ali.Percobaan();back();}
            else if(subbab==2){ali.Latihan();}
            else{error();}
        }else if(bab==6){
            Bab6Jalan ali = new Bab6Jalan();
            if(subbab==1){ali.Percobaan();back();
            }else if(subbab==2){ ali.Latihan();back();
            }else if(subbab==2){ali.Tugas();back();}
            else{error();}
        }else{error();}
        
    }
    
    public void pembuka(){
        System.out.println("Selamat Datang, " + this.nama);
        System.out.println("Silahkan Pilih Materi PBO");
        System.out.println("1. Pengenalan PBO");
        System.out.println("2. Dasar-Dasar PBO");
        System.out.println("3. Mengelola Class");
        System.out.println("4. Konsep Inheritance");
        System.out.println("5. Overloading dan Overriding");
        System.out.println("6. Polimorfisme");
        System.out.println("7. Keluar");
        System.out.print("Masukkan No Bab = ");
        bab = input.nextInt();
        if(this.bab==1){
            System.out.println("1. Percobaan 1");
            System.out.println("2. Percobaan 2");
            System.out.println("3. Percobaan 3");
            System.out.println("4. Latihan 1");
            System.out.println("5. Latihan 2");
            System.out.println("6. Latihan 3");
            System.out.println("7. Tugas 1 (Tabungan)");
            System.out.println("8. Tugas 2 (Truk)");
            System.out.print("Masukkan no sub bab : ");
            subBab = input.nextInt();
            pilihan(bab,subBab);
        }else if(this.bab==2){
            System.out.println("1. Percobaan 1");
            System.out.println("2. Percobaan 2");
            System.out.println("3. Latihan ");
            System.out.print("Masukkan no sub bab : ");
            subBab = input.nextInt();
            pilihan(bab,subBab);
        }else if(this.bab==3){
            System.out.println("1. Percobaan 1");
            System.out.println("2. Percobaan 2");
            System.out.println("3. Percobaan 3");
            System.out.println("4. Latihan");
            System.out.println("5. Tugas");
            System.out.print("Masukkan no sub bab : ");
            subBab = input.nextInt();
            pilihan(bab,subBab);
        }else if(this.bab==4){
            System.out.println("1. Percobaan 1");
            System.out.println("2. Percobaan 2");
            System.out.println("3. Percobaan 3");
            System.out.println("4. Latihan");
            System.out.println("5. Tugas");
            System.out.print("Masukkan no sub bab : ");
            subBab = input.nextInt();
            pilihan(bab,subBab);
        }else if(this.bab==5){
            System.out.println("1. Percobaan ");
            System.out.println("2. Latihan");
            System.out.print("Masukkan no sub bab : ");
            subBab = input.nextInt();
            pilihan(bab,subBab);
        }else if(this.bab==6){
            System.out.println("1. Percobaan ");
            System.out.println("2. Latihan");
            System.out.println("3. Tugas");
            System.out.print("Masukkan no sub bab : ");
            subBab = input.nextInt();
            pilihan(bab,subBab);
        }
        else if(this.bab==7){selesai();}
        else{error();back();}
        
    }

   
   

}
