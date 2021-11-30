/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolemodif;

import java.util.Scanner;
/**
 *
 * @author Wahyudi
 */
public class ProjectRentalConsoleModif extends Data_Durasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Silver s = new Silver();
        Gold g = new Gold();
        Platinum p = new Platinum();
        

        tambahMember();
        
        String idMember;
        int tglRental, blnRental, thnRental, tglKembali, blnKembali, thnKembali;
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("+ ========================= Console Game Rental ========================= +");
        
        System.out.print("\nMasukkan ID Member               |: ");
        idMember = input.nextLine();
        
        System.out.print("\nMasukkan Tanggal Pinjam (1 - 31) |: ");
        tglRental = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)   |: ");
        blnRental = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam (xxxx)     |: ");
        thnRental = input.nextInt();
        
        System.out.print("\nMasukkan Tanggal Kembali (1 - 31)|: ");
        tglKembali = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali (1 - 12)  |: ");
        blnKembali = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali (xxxx)    |: ");
        thnKembali = input.nextInt();
        
        //mencari dan output data member
        System.out.println("\n+ ----------------------------------------------------------------------- +");
        mencariMember(idMember);
        
        //output
        System.out.println("\n+ ----------------------------------------------------------------------- +");
        System.out.println("\nTanggal Pinjam                   |: " + tglRental + " - " + blnRental + " - " + thnRental);
        System.out.println("Tanggal Kembali                  |: " + tglKembali + " - " + blnKembali + " - " + thnKembali);
        
        int durasiRental = durasi(tglRental, blnRental, thnRental, tglKembali, blnKembali, thnKembali );
        System.out.println("Lama Sewa                        |: " + durasiRental + " hari");
           
        String jenisMember = JenisMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("\nTotal Sewa                       |: Rp. " + s.totalTagihan(durasiRental));
            System.out.println("Jumlah Poin                      |: " + s.totalPoin(durasiRental));
        
        } else if(jenisMember == "Gold") {
            System.out.println("\nTotal Sewa                       |: Rp. " + g.totalTagihan(durasiRental));
            System.out.println("Jumlah Poin                      |: " + g.totalPoin(durasiRental));
            System.out.println("Jumlah Cashback                  |: Rp. " + g.getcashback());
            
        } else if(jenisMember == "Platinum") {
            System.out.println("\nTotal Sewa                       |: Rp. " + p.totalTagihan(durasiRental));
            System.out.println("Jumlah Poin                      |: " + p.totalPoin(durasiRental));
            System.out.println("Jumlah Cashback                  |: Rp. " + p.getcashback());
            System.out.println("Bonus Pulsa                      |: Rp. " + p.totalPulsa(durasiRental));
            
        } else {
            System.out.println("");
        }
        
        
    }  
}
