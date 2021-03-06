/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4;

/**
 *
 * @author ALI
 */
public class Percobaan2 {
    
    public class pegawai{
        private String nama;
        public double gaji;
    }
    public class manager extends pegawai{
        public String departemen;
        
        public void IsiData(String n, String d){
            departemen=d;
        }
    }
  
}
