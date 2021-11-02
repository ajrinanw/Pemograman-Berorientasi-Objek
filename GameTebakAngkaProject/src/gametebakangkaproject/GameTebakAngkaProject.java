/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;
/**
 *
 * @author Jey
 */
public class GameTebakAngkaProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int angka = 0 + (int)(Math.random() * 100);
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        System.out.print("Angka tebakan anda : ");
        int tebakan = scanner.nextInt();
        
        while(tebakan != angka) {
            if(tebakan > angka) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            }
            else{
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
            
            System.out.print("Angka tebakan anda : ");
            tebakan = scanner.nextInt();
        }
        
        System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
    }
    
}
