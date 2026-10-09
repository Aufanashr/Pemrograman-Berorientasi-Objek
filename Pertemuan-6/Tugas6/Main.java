/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk elektronik = new Elektronik("Mouse", 200000);
        Produk pakaian = new Pakaian("Jaket", 300000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        System.out.println("Total harga setelah diskon: "
                + keranjang.hitungTotal());
    }
}
