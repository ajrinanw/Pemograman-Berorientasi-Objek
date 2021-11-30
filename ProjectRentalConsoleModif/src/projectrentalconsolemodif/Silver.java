/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolemodif;

/**
 *
 * @author Jey
 */
public class Silver extends Data_Durasi {
    private int biayaRental, disc, poin, tagihanRental, totalDisc, totalRental, banyakPoin;
    
    public void setbiayaRental(int Br){
        this.biayaRental = Br;
    }
    
    public void setdiskon(int Dc){
        this.disc = Dc;
    }
    
    public void setpoin(int P){
        this.poin = P;
    }
    
    Silver(){
        setbiayaRental(25000);
        setdiskon(1);
        setpoin(1);
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
