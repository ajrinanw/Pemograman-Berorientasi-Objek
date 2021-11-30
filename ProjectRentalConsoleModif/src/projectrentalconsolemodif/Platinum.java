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
public class Platinum extends Gold{
    private int pulsa, banyakPulsa;
    
    public void setpulsa(int Ps){
        this.pulsa = Ps;
    }
    
    Platinum(){
        setbiayaRental(45000);
        setdiskon(3);
        setpoin(10);
        setcashback(10000);
        setpulsa(5000);
    }
   
    protected int totalPulsa(int durasi){
        banyakPulsa = durasi * pulsa;
        
        return banyakPulsa;
    }
}
