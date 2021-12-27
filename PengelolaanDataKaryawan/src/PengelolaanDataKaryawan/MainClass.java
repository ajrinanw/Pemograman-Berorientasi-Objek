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
public class MainClass extends Menu {

    Scanner input = new Scanner( System.in );
    
    public static void main(String[] args) {
        boolean pilih = true;
        Program program = new Program();
        Menu menu = new Menu();
        
        while(pilih){    
            
            menuUtama();
            Scanner input = new Scanner( System.in );
            
            System.out.print("Menu pilihan: ");
            int in = Integer.parseInt(input.nextLine());
            
            switch(in){
                case 1 : 
                    boolean tambahData = true;
                    while(tambahData){
                        System.out.println("");
                        System.out.println("====================================================================================");
                        System.out.println("                                   Menu Tambah Data                                 ");
                        System.out.println("====================================================================================");
                        
                        System.out.print("\nMasukan Kode Karyawan                                         : ");
                        String kdKaryawan = input.nextLine();
                        
                        System.out.print("Masukan Nama Karyawan                                         : ");
                        String nmKaryawan = input.nextLine();
                        
                        System.out.print("Masukan Alamat                                                : ");
                        String alamat = input.nextLine();
                        
                        System.out.print("Masukan Tanggal Lahir (yyyy-mm-dd)                            : ");
                        String tglLahir = input.nextLine();
                        
                        System.out.print("Masukan Golongan (A/B/C)                                      : ");
                        String gol = input.nextLine();
                        
                        System.out.print("Masukan Status Menikah (0. belum menikah , 1. sudah menikah)  : ");
                        int status = input.nextInt();
                        
                        int jmlAnak;
                        if( status == 1 ){
                            System.out.print("Jumlah Anak                                                   : ");
                            jmlAnak = input.nextInt();
                        } else {
                            status = 0;
                            jmlAnak = 0;
                        }

                        Program data = new Program(kdKaryawan,nmKaryawan,alamat,tglLahir,gol,status,jmlAnak);
                        
                        program.tambahKaryawan(data);
                      
                        subMenu();
                        System.out.println("2. Tambah Data Kembali");
                        menu.pilSubMenu();
                        input.nextLine();
                        
                        switch (menu.pilihan) {
                            case 1:
                                tambahData = false;
                                break;
                            case 2:
                                tambahData = true;
                                break;
                            default:  
                                System.out.println("Pilihan menu tidak tersedia");
                                break;
                        }
                    }
                    break;
                
                    
                case 2 : 
                    boolean hapusData = true;
                    while( hapusData ) {
                        System.out.println("");
                        System.out.println("=========================================================");
                        System.out.println("                       Hapus Data                        ");
                        System.out.println("=========================================================");
                        
                        System.out.print("\nMasukan kode karyawan yg akan di hapus: ");
                        String kdKaryawan = input.nextLine();
                        
                        program.hapusKaryawan(kdKaryawan);
                        
                        subMenu();
                        System.out.println("2. Hapus Data Kembali");
                        menu.pilSubMenu();
                        
                        switch (menu.pilihan) {
                            case 1:
                                hapusData = false;
                                break;
                            case 2:
                                hapusData = true;
                                break;
                            default:  
                                System.out.println("Pilihan menu tidak tersedia");
                                break;
                        } 
                    }
                    break;
                
                    
                case 3 :                     
                    boolean cariData = true;
                    while(cariData){
                        System.out.println("");
                        System.out.println("=========================================================");
                        System.out.println("                        Cari Data                        ");
                        System.out.println("=========================================================");
                        
                        System.out.print("\nMasukan Kode Karyawan : ");
                        String kode = input.nextLine();
               
                        program.cariKaryawan(kode);

                        subMenu();
                        menu.pilSubMenu();
                        
                        switch (menu.pilihan) {
                            case 1:
                                cariData = false;
                                break;
                            default:  
                                System.out.println("Pilihan menu tidak tersedia");
                                break;
                        }  
                    }
                    break;
                
                case 4 : 
                    boolean tampilData = true;
                    while( tampilData ){

                        program.printKaryawan();
                        
                        subMenu();
                        menu.pilSubMenu();
                        
                        switch (menu.pilihan) {
                            case 1:
                                tampilData = false;
                                break;
                            default:  
                                System.out.println("Pilihan menu tidak tersedia");
                                break;
                        }
                    }
                    break;

                    
                case 5 : 
                    System.exit(0);
                
                default: 
                    System.out.println("Menu yang anda pilih tidak tersedia");
                    System.out.println("");
                
            }   
            
        }
    }
        
}
