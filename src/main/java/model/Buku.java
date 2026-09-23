/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Buku {
    protected final String idBuku;
    protected String judul;
    protected String penulis;
    protected int tahunTerbit;
    
    public Buku (String idBuku, String judul, String penulis, int tahunTerbit){
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getidBuku(){
        return idBuku;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public String getpenulis(){
        return penulis;
    }
    
    public int gettahunTerbit(){
        return tahunTerbit;
    }
    
    public void setjudul(String judul){
        this.judul = judul;
    }
    
    public void setpenulis(String penulis){
        this.penulis = penulis;
    }
    
    public void settahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    
    public void tampilkanInfoPerpustakaan(){
        System.out.println("idBuku : " + idBuku);
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
                
                
    }
    
}
