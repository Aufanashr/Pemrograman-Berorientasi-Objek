/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Tugas6;

/**
 *
 * @author LENOVO
 */
abstract class Produk {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract int hitungDiskon();

    public int hargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}