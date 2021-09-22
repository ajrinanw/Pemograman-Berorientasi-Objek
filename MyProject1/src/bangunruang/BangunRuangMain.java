/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import bangundatar.PersegiPanjang;

/**
 *
 * @author Jey
 */
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola b = new Bola();
        
        b.r = 10;
        
        b.hitungVolBola();
        b.hitungLuasSelimutBola();
        
        
        System.out.println("-----------------------------------");
         
         
        Tabung t = new Tabung ();
         
        t.r = 10;
        t.t = 20;
         
        t.hitungVolTabung();
        t.hitungLuasSelimutTabung();
        
        
        System.out.println("-----------------------------------");
        
        
        Kerucut k = new Kerucut ();
        
        k.r = 10;
        k.t = 20;
        k.s = 30;
        
        k.hitungVolKerucut();
        k.hitungLuasSelimutKeucut();
    }   
}
