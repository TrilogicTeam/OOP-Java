/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3Sekolah;

/**
 *
 * @author ALI
 */
public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;
    
    public Kelas(int kode, String nama){
        this.kodeKelas=kode;
        this.namaKelas=nama;
    }
    public void setMhs(Mahasiswa mhs){
        this.mahasiswa=mhs;
    }
}
    
