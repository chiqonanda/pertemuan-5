/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class BukuPelajaran extends Buku {
    protected String tingkatan;
    
    public BukuPelajaran(String idBuku, String judul, String penulis, int tahunTerbit, String tingkatan) {
        super(idBuku, judul, penulis, tahunTerbit);
        this.tingkatan = tingkatan;
    }
    
    public String getTingkatan(){
        return tingkatan;
    }
    
    public void setTingkatan(String tingkatan){
        this.tingkatan = tingkatan;
    }
    
    public void tampilkanBukuPelajaran(){
        System.out.println("========================");
        System.out.println("Kategori Buku Pelajaran");
        super.tampilkanInfoPerpustakaan();
        System.out.println("Tingkatan: " + tingkatan);
        System.out.println("========================");
    }
    
}
