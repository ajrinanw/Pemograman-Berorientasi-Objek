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
public class Persegi {
    public String namapersegi;
    public int sisi;
    
    public void hitungLuasPersegi(){
        int luas = sisi * sisi;
            System.out.println("Luas Persegi " + namapersegi + ":" + luas);
    }
    
    public void hitungKelilingPersegi(){
        int keliling = 4 * sisi;
            System.out.println("Keliling Persegi " + namapersegi + ":" + keliling);
    }
}
