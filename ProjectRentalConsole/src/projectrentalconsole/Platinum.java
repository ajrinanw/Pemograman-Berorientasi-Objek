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
public class Platinum extends Gold{
    int pulsa, banyakPulsa;
    
    Platinum(){
        this.biayaRental = 45000;
        this.disc = 3;
        this.poin = 10;
        this.cashback = 10000;
        this.pulsa = 5000;
    }
   
    protected int totalPulsa(int durasi){
        banyakPulsa = durasi * pulsa;
        
        return banyakPulsa;
    }
}
