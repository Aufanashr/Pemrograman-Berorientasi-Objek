/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Objek dari kelas Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        System.out.println("--- Informasi Mobil ---");
        mobil.tampilkanInfo();

        System.out.println(); // Baris baru

        // Objek dari kelas SepedaMotor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        System.out.println("--- Informasi Sepeda Motor ---");
        motor.tampilkanInfo();
    }
}
