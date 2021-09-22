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
public class Lingkaran {
    public String namalingkaran;
    public int r;
    
    public void hitungLuasLingkaran(){
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran " + namalingkaran + ":" + luas);
    }
    
    public void hitungKelilingLingkaran(){
        double keliling = 3.14 * 2 * r;
        System.out.println("Keliling Lingkaran " + namalingkaran + ":" + keliling);
    }
}
