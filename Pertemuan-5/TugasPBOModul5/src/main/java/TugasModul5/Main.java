/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     BAGIAN 1: SOAL HEWAN & OVERRIDING     ");
        System.out.println("==========================================");

        Kucing kucing = new Kucing();
        kucing.nama = "Mimi";
        kucing.jenis = "Mamalia (Kucing Anggora)";
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Gobi";
        anjing.jenis = "Mamalia (Anjing Husky)";
        anjing.tampilkanInfo();

        System.out.println("\n==========================================");
        System.out.println("     BAGIAN 2: HIERARKI 3 LEVEL KENDARAAN ");
        System.out.println("==========================================");

        Mobil mobil = new Mobil();
        mobil.nama = "Honda Civic";
        mobil.kecepatan = 200;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        System.out.println("[ Data Mobil ]");
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki Ninja";
        motor.kecepatan = 160;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak";
        System.out.println("[ Data Sepeda Motor ]");
        motor.tampilkanInfo();
    }
    
}
