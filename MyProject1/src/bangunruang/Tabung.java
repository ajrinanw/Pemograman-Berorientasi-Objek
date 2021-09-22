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
public class Tabung {
    public int r;
    public int t;
    
    public void hitungVolTabung(){
        double volume = 3.14 * r * r * t;
        System.out.println("Volume Tabung : " + volume);
    }
    
    public void hitungLuasSelimutTabung(){
        double selimut = 2 * 3.14 * r * t;
        double alas = 3.14 * r * r;
        double luasSelimut = selimut + alas;
        System.out.println("Luas Selimut Tabung : " + luasSelimut);
               
    }
}
