/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.rerata;

import java.util.Scanner;

/**
 *
 * @author Jey
 */
public class ArrayProcessing {
        int [] bil = new int[100];
        int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Banyaknya data : ");
        this.n = input.nextInt();
            for(int i=0; i<this.n; i++){
                System.out.print("Masukan bil ke - " + (i+1)+ " : ");
                this.bil[i] = input.nextInt();
            }
    }
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMin(int[] data){
        int min = data[0];
        for(int i = 0; i < this.n; i++) {
            if(data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    int cariMax(int[] data){
        int max = data[0];
        for(int i=0; i < this.n; i++){
            if (data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
    
    /* MODIFIKASI PROJECT 2 -SORTING PROJECT-
     void urutkan(int[]data){
        int n = this.n;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        
        for (int i=0; i < n; i++){
            System.out.print(data[i] +" ");
        }   
    }
    */
    
    void output(){
    System.out.println("\n------- Hasil -------");
    System.out.println("Nilai Rata-Rata  : " + hitungRerata(this.bil));
    System.out.println("Nilai minimum    : " + cariMin(this.bil));
    System.out.println("Milai maximum    : " + cariMax(this.bil));
    /* MODIFIKASI PROJECT 2 -SORTING PROJECT-
    System.out.print("Urutan Nilai : ");
    
    urutkan(bil);
    */
    }
}
