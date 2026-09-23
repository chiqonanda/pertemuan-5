/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class BukuKomik extends Buku {
    protected String volume;
    
    public BukuKomik(String idBuku, String judul, String penulis, int tahunTerbit, String volume) {
        super(idBuku, judul, penulis, tahunTerbit);
        this.volume = volume;
    }
    
    public String getVolume(){
        return volume;
    }
    
    public void setVolume(String volume){
        this.volume = volume;
    }
    
    public void tampilkanBukuKomik(){
        System.out.println("===============");
        System.out.println("Kategori Buku Komik");
        super.tampilkanInfoPerpustakaan();
        System.out.println("===============");
    }
    
}
