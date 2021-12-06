/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Jey
 */
public class PersegiPanjang extends BangunDatar {
    // atribut panjang dan lebar
    public double panjang, lebar;
    
    // method untuk hitung luas
    public double hitungLuas(){
        double luas = panjang * lebar;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}