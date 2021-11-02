/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;
/**
 *
 * @author Jey
 */
public class PythagorasProject {

    public static void main(String[] args) {
        int menu;
        double hipotenusa, sisi;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("+====================== Menu =================+");
        System.out.println("| 1 | Cek Triple Pythagoras                   |");
        System.out.println("| 2 | Menentukan Sisi Miring Segitiga         |");
        System.out.println("| 3 | Menentukan Sisi Siku - Siku             |");
        System.out.println("| 4 | Exit                                    |");
        System.out.println("+=============================================+\n");
        
        System.out.print("Piihan anda : ");
        menu = scanner.nextInt();
        
        switch(menu) {
            
            case (1) :
                System.out.print("Masukkan sisi a : ");
                int sisiA = scanner.nextInt();
                System.out.print("Masukkan sisi b : ");
                int sisiB = scanner.nextInt();
                System.out.print("Masukkan sisi miring : ");
                int sisiMiring = scanner.nextInt();
                
                if(Math.pow(sisiA, 2) + Math.pow(sisiB, 2) == Math.pow(sisiMiring, 2)) {
                    System.out.println("\nKetiga angka tersebut merupakan triple pythagoras");
                }
                else {
                    System.out.println("\nKetiga angka tersebut bukan merupakan triple pythagoras");
                }
                break;
            
            case(2) :
                System.out.print("Masukkan sisi a : ");
                sisiA = scanner.nextInt();
                System.out.print("Masukkan sisi b : ");
                sisiB = scanner.nextInt();
                
                hipotenusa = Math.sqrt(Math.pow(sisiA, 2)+ Math.pow(sisiB, 2));
                
                System.out.println("\nSisi miring / hipotenusa dari segitiga tersebut adalah " + hipotenusa);
                
                break;
                
            case(3) :
                System.out.print("Masukkan sisi a3 : ");
                sisiA = scanner.nextInt();
                System.out.print("Masukkan sisi miring : ");
                int sisiC = scanner.nextInt();
                
                sisi = Math.sqrt(Math.pow(sisiC, 2) - Math.pow(sisiA, 2));
                
                System.out.println("\nSisi b dari segitiga tersebut adalah  " + sisi);
                
                break;
            
            case(4) :
                System.exit(0);
            
            default :
                System.out.println("Output tidak valid, silakan ulangi");
        }
    }
    
}
