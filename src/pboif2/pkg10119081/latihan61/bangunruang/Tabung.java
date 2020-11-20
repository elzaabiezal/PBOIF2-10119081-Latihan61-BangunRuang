/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan61.bangunruang;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Bangun Ruang
 */
public class Tabung extends BangunRuang{
    private int tinggi;

    public Tabung(int r,int tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    public double hitungAlas() {
        return 3.14 * (getR() * getR());
    }

    @Override
    public double hitungVolume() {
        return hitungAlas() * getTinggi();
    }

    @Override
    public void tampilHasil() {
        System.out.println("Volume Tabung : " + hitungVolume() + " cm3");
    }
    
}
