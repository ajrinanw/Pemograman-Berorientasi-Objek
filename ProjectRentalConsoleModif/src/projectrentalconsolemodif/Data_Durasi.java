/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolemodif;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jey
 */
public class Data_Durasi {
    
    //Data Member
    static Map<String, List<String>> data = new HashMap<String, List<String>>();
    static int lamaRental;
    
    static void tambahMember() {
        
        List<String> data1 = new ArrayList<String>();
        data1.add("Mr. X");
        data1.add("Silver");
        
        List<String> data2 = new ArrayList<String>();
        data2.add("Mr. Y");
        data2.add("Gold");
        
        List<String> data3 = new ArrayList<String>();
        data3.add("Mr. Z");
        data3.add("Platinum");
        
        data.put("M001", data1);
        data.put("M002", data2);
        data.put("M003", data3);
    }
    
    static void mencariMember(String idMember) {       
         
        if(data.containsKey(idMember)) {
            
            for(Map.Entry<String, List<String>> entry : data.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\nID Member                        |: " + key);
                System.out.println("Nama Member                      |: " + values.get(0));
                System.out.println("Jenis Member                     |: " + values.get(1));
                
                }
            }
        } else {
                System.out.println("Belum terdaftar sebagai member");
        }
    }
    
    static String JenisMember(String idMember) {
        
        String jenisMember = null;
        if(data.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : data.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int durasi(int tglRental, int blnRental, int thnRental, int tglKembali, int blnKembali, int thnKembali) {
        
        if(thnKembali >= thnRental) {
            if(blnKembali >= blnRental) {
                
                    LocalDateTime rental = LocalDateTime.of(thnRental, blnRental, tglRental, 23, 59, 59);
                    LocalDateTime kembali = LocalDateTime.of(thnKembali, blnKembali, tglKembali, 23, 59, 59);

                    Duration duration = Duration.between(rental, kembali);
        
                    lamaRental = (int) duration.toDays();
                 
            } else {
                System.out.println("Inputan tidak valid, silahkan ulangi");
            }
        } else {
            System.out.println("Inputan tidak valid, silahkan ulangi");
        }
        
        return lamaRental;
    }
}
