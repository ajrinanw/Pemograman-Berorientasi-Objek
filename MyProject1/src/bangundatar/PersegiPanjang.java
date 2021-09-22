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
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void hitungLuasPersegiPanjang(){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
    }
    
    public void hitungKelilingPersegiPanjang(){
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
}
