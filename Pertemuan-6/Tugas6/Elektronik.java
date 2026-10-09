/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author LENOVO
 */
class Elektronik extends Produk {

    public Elektronik(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public int hitungDiskon() {
        return (int) (harga * 0.15);
    }
}
