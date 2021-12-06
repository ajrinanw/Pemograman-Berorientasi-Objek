/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perjalananmobil;

/**
 *
 * @author Jey
 */
public class MainClass {
    public static void main(String[] args) {
        Sedan s = new Sedan();
        SUV suv = new SUV();
        MPV mpv = new MPV();
        
        //deklarasi array
        String[][] perjalanan = {
            {"A","Sedan","107","60"},
            {"B","Sedan","538","65"},
            {"C","SUV","662","57"},
            {"D","SUV","471","62"},
            {"E","MPV","541","64"},
            {"F","MPV","433","53"}
        };
        
        for (int i=0; i< perjalanan.length; i++){
            if (perjalanan[i][1] == "Sedan"){
                s.jarak = Double.parseDouble(perjalanan[i][2]);
                s.kecepatan = Double.parseDouble(perjalanan[i][3]);
                s.hitungBahanBakar();
                s.hitungWaktuTempuh();
                System.out.println("\n" + perjalanan[i][0]);
                s.tampilHasil();      
            }
            
            else if (perjalanan[i][1] == "SUV"){
                suv.jarak = Double.parseDouble(perjalanan[i][2]);
                suv.kecepatan = Double.parseDouble(perjalanan[i][3]);
                suv.hitungBahanBakar();
                suv.hitungWaktuTempuh();
                System.out.println("\n" + perjalanan[i][0]);
                suv.tampilHasil();      
            }
            
            else if (perjalanan[i][1] == "MPV"){
                mpv.jarak = Double.parseDouble(perjalanan[i][2]);
                mpv.kecepatan = Double.parseDouble(perjalanan[i][3]);
                mpv.hitungBahanBakar();
                mpv.hitungWaktuTempuh();
                System.out.println("\n" + perjalanan[i][0]);
                mpv.tampilHasil();      
            }
            
            else {
                System.out.println("Tipe tidak ditemukan");
            }
        }
    }   
}