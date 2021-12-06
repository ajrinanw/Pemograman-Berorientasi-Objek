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
public abstract class Mobil {    
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktuTempuh();
    public void tampilHasil(){
        System.out.println("Perkiraan Bahan Bakar : " + this.hitungBahanBakar());
        System.out.println("Waktu Tempuh          : " + this.hitungWaktuTempuh());
    }
}
