/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab5;

/**
 *
 * @author ALI
 */
public class Dosen extends Orang{
    private int nip;
   
    public Dosen(String nama){
       super(nama);
    }
    public Dosen(String nama, int nip){
        super(nama);
        this.nip=nip;
    }
        
    public Dosen(String nama, int nip, int umur){
        super(nama, umur);
        this.nip=nip;
    }
    public void Info(){
        System.out.println("Nama : "+ super.nama);
        System.out.println("NIP  : "+ this.nip);
        System.out.println("Umur : "+ super.umur);
    }
}
