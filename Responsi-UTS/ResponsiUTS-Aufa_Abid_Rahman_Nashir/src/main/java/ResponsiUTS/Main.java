/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {

        //  Contoh Output 1: Produk 
        System.out.println(" Output Produk ");
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();

        System.out.println();

        //  Contoh Output 2: Pegawai 
        System.out.println(" Output Pegawai ");
        PegawaiTetap budi = new PegawaiTetap("Budi", 5000000, 1000000);
        budi.tampilkanInfo();

        System.out.println();

        //  Contoh Output 3: Polimorfisme 
        System.out.println(" Output Polimorfisme ");
        
        // Referensi kelas induk (Produk) memegang objek kelas turunan (Makanan)
        Produk produkPolimorfisme = new Makanan("Snack", 15000, "2023-12-30");
        
        // Referensi kelas induk (Pegawai) memegang objek kelas turunan (PegawaiKontrak)
        Pegawai pegawaiPolimorfisme = new PegawaiKontrak("Andi", 3000000, 12); 

        // Memanggil metode menggunakan referensi kelas induk
        produkPolimorfisme.tampilkanInfo();
        pegawaiPolimorfisme.tampilkanInfo();
    }
}
