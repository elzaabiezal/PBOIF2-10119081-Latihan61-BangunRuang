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
public abstract class BangunRuang {
    private int r;

    public BangunRuang(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }
    
    public abstract double hitungVolume();
    
    public abstract void tampilHasil();
}
