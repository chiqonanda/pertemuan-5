/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.BukuKomik;
import model.BukuPelajaran;

/**
 *
 * @author USER
 */

//(String idBuku, String judul, String penulis, int tahunTerbit, String volume) 
public class Pt4 {

    public static void main(String[] args) {
        BukuKomik bukuKomik1 = new BukuKomik(
        "IDBUKU", "Sang Gagah Merah Putih", "Chiqo", 2020, 2
        );
        
        bukuKomik1.tampilkanBukuKomik();
        
        System.out.println("Ini adalah hebat\n "+ bukuKomik1.getjudul());
    }
    
    
}
