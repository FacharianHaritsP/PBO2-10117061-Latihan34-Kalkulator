/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan34.kalkulator;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Membuat kalkulator secara objek orientasi
 * 
 */
public class Kalkulator {

    public double value1;
    public double value2;

    public double tambahBilangan() {
        return value1+value2;
    }

    public double kurangBilangan() {
        return value1-value2;
    }

    public double kaliBilangan() {
        return value1*value2;
    }

    public double bagiBilangan() {
        return value1/value2;
    }

    public double sisaBilangan() {
        return value1%value2;
    }

}
