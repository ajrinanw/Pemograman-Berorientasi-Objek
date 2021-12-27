/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanDataKaryawan;

import java.util.Scanner;

/**
 *
 * @author Jey
 */
public abstract class Menus {
    int pilihan = 30;
    
    public static void menuUtama(){
        System.out.println("---- Menu Program ----");
        System.out.println("1.Tambah data");
        System.out.println("2.Hapus Data");
        System.out.println("3.Cari Data");
        System.out.println("4.Lihat Data");
        System.out.println("5.Exit");
    }
    
    public static void subMenu(){
        System.out.println("\nPilih Submenu : ");
        System.out.println("1. Kembali ke menu utama");
    }
    
    public abstract int pilSubMenu();
}

class Menu extends Menus {

    public int pilSubMenu() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nMenu Pilihan : ");
        pilihan = input.nextInt();
        return pilihan;
    }
    
}