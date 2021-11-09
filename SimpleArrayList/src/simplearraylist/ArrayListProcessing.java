/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import java.util.Scanner;
/**
 *
 * @author ey
 */
public class ArrayListProcessing {
    
    ArrayList<String> user = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    void tambahData() {
        System.out.print("Masukkan data string : ");
        user.add(input.nextLine());
        System.out.println("Daftar string dalam array list : " + user);
        input.nextLine();
    }
    
    void cariData() {
        System.out.print("String yang mau dicari : ");
        String search = input.nextLine();
        int result = user.indexOf(search);
        
        if(result > -1) {
            System.out.println("String " + search + " ada di index ke-" + result + " di dalam data");
        
        } else {
            System.out.println("String " + search + "tidak ada dalam data");
        }
    }
    
    void hapusData() {
        System.out.print("String yang mau dihapus ");
        String delete = input.nextLine();
        
        if(binarySearch(user,delete) > -1){
            user.remove(binarySearch(user,delete));
            System.out.println("String " + delete + " sudah dihapus di dalam data");
        } else {
            System.out.println("String " + delete + " tidak ada dalam data");
        }
    }
    
    void showData() {
        System.out.println("Daftar string dalam array list:" + user);
    }
}
