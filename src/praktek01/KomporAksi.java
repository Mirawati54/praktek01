/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ACER
 */
public class KomporAksi {
    public static void main (String[] args){
        Kompor Pendi = new Kompor ();
        Kompor Esty = new Kompor ();
        Kompor Wati = new Kompor();
        
        Pendi.merk = "Miyako" ;
        Pendi.warna = "Hitam" ;
        Pendi.jenis = "DuaTungku";
        Pendi.type = "522s" ;
        Pendi.bentuk = "Segipanjang";
        
        Esty.merk = "Quantum" ;
        Esty.warna = "putih" ;
        Esty.jenis = "DuaTungku";
        Esty.type = "525s" ;
        Esty.bentuk = "Segiempat";
        
        
        Wati.merk = "Rinai" ;
        Wati.warna = "Hitam" ;
        Wati.jenis = "DuaTungku";
        Wati.type = "558s" ;
        Wati.bentuk = "persegi";
        
        Pendi.cetakInfo();
        Esty.cetakInfo();
        Wati.cetakInfo();
        
        
     
        
    }
    
}
