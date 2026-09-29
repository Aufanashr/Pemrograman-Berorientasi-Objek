/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ResponsiUTS;

/**
 *
 * @author LENOVO
 */
public class Produk {
    //Enkapsulasi
    private String namaProduk;
    private double harga;
    
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    //Getter & Setter Nama Produk
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    //Getter & Setter Harga
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public void tampilkaninfo(){
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : " + (long) harga);
    }

    void tampilkanInfo() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : " + harga);
    }
} 