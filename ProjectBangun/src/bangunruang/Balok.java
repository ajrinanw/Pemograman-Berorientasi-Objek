/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Jey
 */
public class Balok extends BangunRuang {
    // atribut panjang, lebar, dan tinggi
    public double panjang, lebar, tinggi;
    
    // method untuk hitung volume 
    public double hitungVolume(){
        double volume = panjang * lebar * tinggi;
        return volume;
    }
    
    // method untuk hitung luas permukaan
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (tinggi * lebar));
        return luasPermukaan;
    }
}