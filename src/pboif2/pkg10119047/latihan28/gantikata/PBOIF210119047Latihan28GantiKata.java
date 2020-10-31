/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan28.gantikata;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI DAPAT MENGGANTI KATA
 */

public class PBOIF210119047Latihan28GantiKata {
    
    //mengubah string
    public static String ganti(String kalimat, String ubah, String ganti){
       ganti = kalimat.replace(ubah, ganti);
       return  ganti;
    }
    /**
     * @param args the command line arguments
     */
    //utama
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat, ubah, ganti;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");
        
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        
        System.out.print("Ganti Kata : ");
        ubah = input.next();
        
        System.out.print("Menjadi Kata : ");
        ganti = input.next();
        
        System.out.println("");
        System.out.println("====Hasil Formating====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + ganti(kalimat, ubah, ganti));
    }
    
}
