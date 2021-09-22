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
public class Kerucut {
    public int r;
    public int t;
    public int s;
    
    public void hitungVolKerucut(){
        double volume = (3.14 * r * r * t) / 3;
        System.out.println("Volume Kerucut : " + volume);
    }
    
    public void hitungLuasSelimutKeucut(){
        double selimut = 3.14 * r * (r + s);
        System.out.println("Luas Selimut Kerucut : " + selimut);
    }
}
