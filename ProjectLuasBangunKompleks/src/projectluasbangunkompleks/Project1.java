/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Wahyudi
 */
public class Project1 {
    public static void main(String[] args) {
        double persegi = Persegi.hitungLuas(42);
        double lingkaran = Lingkaran.hitungLuas(21);
        
        double totalLuas = persegi + (lingkaran * 2);
        
        System.out.println("Luas Bangun Datar Tersbut adalah : " + totalLuas);
    }
}
