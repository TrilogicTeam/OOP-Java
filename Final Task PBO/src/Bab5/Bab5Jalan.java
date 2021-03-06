/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab5;
import java.awt.Point;
/**
 *
 * @author ALI
 */
public class Bab5Jalan {
    
    public void Percobaan(){
        Percobaan rect= new Percobaan();
        System.out.println("Buat segiempat dengan koordinat (25,25) dan (50,50) ");
        rect.buatSegiempat(25,25,50,50);
        rect.cetakSegiempat();
        System.out.println();
        System.out.println("Buat segiempat dengan point (10,10) dan point (20,20) : ");
        rect.buatSegiempat(new Point (10,10), new Point (20,20));
        rect.cetakSegiempat();
        System.out.println();
        System.out.print("Buat Segi Empat dengan 1 point (10,10),koordinat (50,50)");
        rect.buatSegiempat (new Point(10,10),50,50);
        rect.cetakSegiempat();
    }
    public void Latihan(){
        System.out.println("Masukkan Identitas dosen 1 : Agus");
        Dosen dosen1=new Dosen("Agus");
        
        System.out.println("Masukkan identitas dosen 2 : Budi, NIP. 1458");
        Dosen dosen2=new Dosen("Budi", 1458);
        
        System.out.println("Masukkan identitas dosen 3 : Iwan, NIP. 1215, umur 47");
        Dosen dosen3=new Dosen("Iwan", 1215, 47);
        
        System.out.println("");
        dosen1.Info();
        System.out.println("");
        dosen2.Info();
        System.out.println("");
        dosen3.Info();
        
    }
}
