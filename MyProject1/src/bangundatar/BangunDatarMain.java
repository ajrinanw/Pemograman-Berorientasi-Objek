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
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        
        pp.panjang = 25;
        pp.lebar = 38;
        
        pp.hitungLuasPersegiPanjang();
        pp.hitungKelilingPersegiPanjang();
        
        
        System.out.println("------------------------");
        
        
        Persegi p = new Persegi();
        
        p.namapersegi = "A";
        p.sisi = 10;
        
        p.hitungLuasPersegi();
        p.hitungKelilingPersegi();
        
        System.out.println("");
        
        p.namapersegi = "B";
        p.sisi = 15;
        
        p.hitungLuasPersegi();
        p.hitungKelilingPersegi();
        
        
        System.out.println("------------------------");
        
        
        Lingkaran l = new Lingkaran();
        
        l.namalingkaran = "X";
        l.r = 25;
        
        l.hitungLuasLingkaran();
        l.hitungKelilingLingkaran();
        
        System.out.println("");
        
        l.namalingkaran = "Z";
        l.r = 37;
        
        l.hitungLuasLingkaran();
        l.hitungKelilingLingkaran();    
    }
}
