/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author Wahyudi
 */
public class Ubin {
    // panjang ubin
    int panjang;
    // lebar ubin
    int lebar;
    
    // method kegiatan 1
//    int hitungLuas(){
//        PersegiPanjang p = new PersegiPanjang();
//        p.panjang = this.panjang;
//        p.lebar = this.lebar;
        
//        return p.hitungLuas();
    
        //method kegiatan 2
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
               
        // hitung luasnya
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
