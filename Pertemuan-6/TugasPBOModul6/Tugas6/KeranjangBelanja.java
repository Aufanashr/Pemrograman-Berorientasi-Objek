/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public int hitungTotal() {
        int total = 0;

        for (Produk produk : produkList) {
            total += produk.hargaSetelahDiskon();
        }

        return total;
    }
}