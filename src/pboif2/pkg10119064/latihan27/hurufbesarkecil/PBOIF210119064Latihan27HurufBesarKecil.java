/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menngubah kalimat
 * menjadi huruf kecil dan huruf besar semua
 */
public class PBOIF210119064Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static String convertHurufBesar(String kalimat){
        String kalimatUpper = kalimat.toUpperCase();
        return kalimatUpper;
    }
    
    public static String convertHurufKecil(String kalimat){
        String kalimatlower = kalimat.toLowerCase();
        return kalimatlower;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();
        
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf Besar : " + convertHurufBesar(kalimat));
        System.out.println("Huruf Besar : " + convertHurufKecil(kalimat));
    }
    
}
