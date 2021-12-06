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
public class Tabung extends BangunRuang {
    // atribut jari-jari dan tinggi
    public double jarijari, tinggi;
    
    // method untuk hitung volume 
    public double hitungVolume(){
        double volume = Math.PI * Math.pow(jarijari,2) * tinggi;
        return volume;
    }
    
    // method untuk hitung luas permukaan
    public double hitungLuasPermukaan(){
        double luasPermukaan = Math.PI * jarijari * (jarijari + (2 * tinggi));
        return luasPermukaan;
    }
}