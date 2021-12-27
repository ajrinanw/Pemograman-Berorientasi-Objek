/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanDataKaryawan;

/**
 *
 * @author Jey
 */
public interface Interface {
    int usia = 30;
    String golongan = "A";
    
    public abstract void tambahKaryawan(Program data);
    public abstract void hapusKaryawan(String kode);
    public abstract void cariKaryawan(String kode);
    public abstract void printKaryawan();
}
