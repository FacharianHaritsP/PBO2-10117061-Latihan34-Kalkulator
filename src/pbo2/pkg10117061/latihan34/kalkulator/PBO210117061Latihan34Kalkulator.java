/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan34.kalkulator;

import java.util.Scanner;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Membuat kalkulator secara objek orientasi
 * 
 */
public class PBO210117061Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baru = new Scanner(System.in);
        Kalkulator jembatan = new Kalkulator();

        System.out.println("===Aplikasi kalulator bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        jembatan.value1 = baru.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        jembatan.value2 = baru.nextDouble();

        System.out.println("\nHasil Pertambahan : "+ jembatan.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+ jembatan.kurangBilangan());
        System.out.println("Hasil Perkalian\t: "+ jembatan.kaliBilangan());
        System.out.println("Hasil Pembagian\t: "+ jembatan.bagiBilangan());
        System.out.println("Hasil Sisa\t: "+ jembatan.sisaBilangan());
        
        
    }

}
