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
public class Gold extends Silver{
    private int cashback;
    
    public void setcashback(int Cb){
        this.cashback = Cb;
    }

    Gold(){
        setbiayaRental(30000);
        setdiskon(2);
        setpoin(5);
        setcashback(5000);
    }
    
    public int getcashback(){
        return this.cashback;
    }
    
}
