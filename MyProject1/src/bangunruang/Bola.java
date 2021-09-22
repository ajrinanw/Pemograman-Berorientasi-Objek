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
public class Bola {
    public int r;
    
    public void hitungVolBola(){
        double volume = (4/3) * 3.14 * r * r * r;
        System.out.println("Volume Bola : " + volume);
    }
    
    public void hitungLuasSelimutBola(){
        double selimut = 4 * 3.14 * r * r;
        System.out.println("Luas Selimut Bola : " + selimut);
    }
}
