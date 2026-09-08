/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul3;

/**
 *
 * @author LENOVO
 */

public class Main {
    public static void main(String[] args) {
        // Buat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022);

        System.out.println(" Data Mobil Awal ");
        mobil1.displayInfo();

        // Mengubah nilai atribut lewat Setter
        mobil1.setModel("Innova");
        mobil1.setTahun(2023);

        System.out.println(" Data Mobil Setelah Diubah ");
        mobil1.displayInfo();
    }
}
