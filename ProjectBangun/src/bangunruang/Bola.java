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
public class Bola extends BangunRuang {
    // atribut jari-jari
    public double jarijari;
    
    // method untuk hitung volume 
    public double hitungVolume(){
        double volume = (4 * Math.PI * Math.pow(jarijari, 3))/ 3;
        return volume;
    }
    
    // method untuk hitung luas permukaan
    public double hitungLuasPermukaan(){
        double luasPermukaan = 4 * Math.PI * Math.pow(jarijari, 2);
        return luasPermukaan;
    }
}
