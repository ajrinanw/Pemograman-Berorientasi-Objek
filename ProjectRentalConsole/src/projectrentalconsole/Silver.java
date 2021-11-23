/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;

/**
 *
 * @author Jey
 */
public class Silver extends Data_Durasi {
    protected int biayaRental, disc, poin, tagihanRental, totalDisc, totalRental, banyakPoin;
    
    Silver(){
        this.biayaRental = 25000;
        this.disc = 1;
        this.poin = 1;
    }
    
    protected int totalTagihan(int durasi){
        tagihanRental = durasi * biayaRental;
        totalDisc = tagihanRental * (disc / 100);
        totalRental = tagihanRental - totalDisc;
        
        return totalRental;
    }
    
    protected int totalPoin(int durasi){
        banyakPoin = durasi * poin;
        
        return banyakPoin;
    }
}
