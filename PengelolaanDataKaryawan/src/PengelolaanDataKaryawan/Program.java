/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanDataKaryawan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jey
 */
public class Program implements Interface{
    
    int gajiPokok,tunjanganKel,tunjanganPegawai, tunjanganAnak, gajiKotor, index = 0;
    double potongan, gajiBersih;
    boolean found = false;
    
    String kdKaryawan, nmKaryawan, alamat, tglLahir, gol;
    int status, jmlAnak, usia;


    //constructor -- override
    Program(String kdKaryawan, String nmKaryawan, String alamat, String tglLahir, String gol, int status, int jmlAnak) {
        this.kdKaryawan = kdKaryawan;
        this.nmKaryawan = nmKaryawan;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
        this.gol = gol;
        this.status = status;
        this.jmlAnak = jmlAnak;
    }

    Program() {
        
    }
    
    public void hitungUsia(int i) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        Date date = formatter.parse(dataKaryawan.get(i).tglLahir);
        LocalDate birthDay = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Period period = Period.between(birthDay, LocalDate.now());
        this.usia = period.getYears();
    }
    
    public void hitungGaji(int i) {
        
          switch (dataKaryawan.get(i).gol) {
            case "a":
            case "A":
                gajiPokok = 5000000;
                break;
            case "b":
            case "B":
                gajiPokok = 6000000;
                break;
            case "c":
            case "C":
                gajiPokok = 7000000;
                break;
        }
        
        switch(dataKaryawan.get(i).status){
            case 1 : 
                this.tunjanganKel = gajiPokok* 10/100;
                break;
        }
        
        switch(dataKaryawan.get(i).status){
            case 1 :
                if(dataKaryawan.get(i).jmlAnak > 0){
                    tunjanganAnak = gajiPokok * 5/100 * dataKaryawan.get(i).jmlAnak;
                }
                break;
        }
        
        
        if(usia > 30){
            tunjanganPegawai = gajiPokok * 15/100; 
        }

        gajiKotor = gajiPokok + tunjanganKel + tunjanganAnak + tunjanganPegawai;
        
        potongan = gajiKotor * 25/1000;
        
        gajiBersih = gajiKotor - potongan;
        
    }
    
    ArrayList<Program> dataKaryawan = new ArrayList<>();
            
    
    @Override
    public void tambahKaryawan(Program data) {
        dataKaryawan.add(data);
    }
    
    @Override
    public void hapusKaryawan(String kode) {
        for(int i = 0; i < dataKaryawan.size(); i++) {
            if(dataKaryawan.get(i).kdKaryawan.equals(kode)){
                found = true;
                index = i;
            }
        }   
        
        if(found == true) {
            dataKaryawan.remove(index);
            System.out.println("\nData Karyawan " + kode + " berhasil dihapus");
        } else {
            System.out.println("Data Karyawan tidak ditemukan");
        }
    }
    
    @Override
    public void cariKaryawan(String kode) {
        boolean found = false;
        int index = -1;
        for(int i = 0; i < dataKaryawan.size(); i++){            
            if(dataKaryawan.get(i).kdKaryawan.equals(kode)){
                index = i;
                found = true;
                
            }
        }
        
        hitungGaji(index);
        try {
            hitungUsia(index);
        } catch (ParseException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(found == true) {
            
            System.out.println("\n=========================================================");
            System.out.println("                  DATA PROFIL KARYAWAN                   ");
            System.out.println("---------------------------------------------------------");

            System.out.println("Kode Karyawan           : " + dataKaryawan.get(index).kdKaryawan);
            System.out.println("Nama Karyawan           : " + dataKaryawan.get(index).nmKaryawan);
            System.out.println("Golongan                : " + dataKaryawan.get(index).gol);
            System.out.println("Usia                    : " + usia);

            switch(dataKaryawan.get(index).status){
                case 0 :
                    System.out.println("Status Menikah          : Belum Menikah");
                    System.out.println("---------------------------------------------------------");
                    break;

                case 1 :
                    System.out.println("Status Menikah          : Sudah Menikah");
                    System.out.println("Jumlah Anak             : " + dataKaryawan.get(index).jmlAnak);
                    System.out.println("---------------------------------------------------------");
            }
            System.out.println("Gaji Pokok              : Rp" + gajiPokok);

            if(dataKaryawan.get(index).status == 1){
                System.out.println("Tunjangan Suami/Istri   : Rp" + tunjanganKel );
            }if(usia > 30){
                System.out.println("Tunjangan Pegawai       : Rp" + tunjanganPegawai);
            }if(jmlAnak > 0){
                System.out.println("Tunjangan Anak          : Rp" + tunjanganAnak); 
            }
            System.out.println("--------------------------------------------------------- +");
            System.out.println("Gaji Kotor              : Rp" + gajiKotor);
            System.out.println("Potongan                : Rp" + potongan);
            System.out.println("--------------------------------------------------------- -");
            System.out.println("Gaji Bersih             : Rp" + gajiBersih);
            
        } else {
            System.out.println("Data Karyawan tidak ditemukan");
        }
    }

    @Override
    public void printKaryawan(){
        
        String leftAlign = "| %-10s | %-25s | %-7s | %-7s | %-17s | %-13s |%n";
        
        System.out.println("\n==================================================================================================");
        System.out.println("                                   DATA KARYAWAN");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.printf(leftAlign, "KODE KARY", "NAMA KARYAWAN", "GOL", "USIA", "STATUS NIKAH", "JUMLAH ANAK");
        

            for(int i=0; i < dataKaryawan.size(); i++){  
                try {
                    hitungUsia(i);
                } catch (ParseException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String kdKaryawan = dataKaryawan.get(i).kdKaryawan;
                String nmKaryawan = dataKaryawan.get(i).nmKaryawan;
                String gol = dataKaryawan.get(i).gol;
                String status = "Belum Menikah";
                int jmlAnak = 0;

                if( dataKaryawan.get(i).status == 1){
                    status = "Sudah Menikah";
                    jmlAnak = dataKaryawan.get(i).jmlAnak;
                }else if( dataKaryawan.get(i).status == 0){
                    status = "Belum Menikah";
                    jmlAnak = 0;
                }

                System.out.printf(leftAlign, kdKaryawan, nmKaryawan, gol, usia, status, jmlAnak );
        }
    }
}

   