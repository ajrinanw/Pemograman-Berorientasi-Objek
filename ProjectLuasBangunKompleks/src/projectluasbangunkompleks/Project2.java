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
public class Project2 {
    public static void main (String args []) {
        
        double LingkaranBesar = Lingkaran.hitungLuas(14);
        double LingkaranKecil = Lingkaran.hitungLuas(7);
        
        double LuasArsiran = (LingkaranBesar / 2) - LingkaranKecil;
        
        System.out.println("Luas Daerah Berwarna Abu-Abu Adalah : " + LuasArsiran);
    }
}
