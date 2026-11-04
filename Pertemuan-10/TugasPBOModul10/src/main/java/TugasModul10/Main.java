/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul10;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {

        Elektronik elektronik = new Elektronik();
        Makanan makanan = new Makanan();

        double hargaElektronik = 2000000;
        double hargaMakanan = 100000;

        System.out.println("Pajak Elektronik: Rp" +
                elektronik.hitungPajak(hargaElektronik));


        System.out.println("Pajak Makanan: Rp" +
                makanan.hitungPajak(hargaMakanan));
    }
}