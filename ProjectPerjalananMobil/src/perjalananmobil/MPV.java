/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perjalananmobil;

/**
 *
 * @author Jey
 */
public class MPV extends Mobil {
    // atribut jarak dan kecepatan
    public double jarak, kecepatan;
    
    // method untuk hitung Bahan Bakar
    public double hitungBahanBakar(){
        double bahanBakar = jarak / 14 ;
        return bahanBakar;
    }
    
    // method untuk hitung Waktu Tempuh
    public double hitungWaktuTempuh(){
        double waktu = jarak / kecepatan;
        return waktu;
    }
}