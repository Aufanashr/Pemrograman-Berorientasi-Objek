/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul4;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {

        Pekerja pekerja = new Pekerja(
                "Aufa",
                19,
                "Programmer",
                5000000
        );

        System.out.println(pekerja.toString());

        pekerja.setNama("Aufa Abid");

        System.out.println("\nSetelah nama diubah:");
        System.out.println(pekerja.toString());
        
        System.out.println(pekerja.nama);
        System.out.println(pekerja.usia);
        System.out.println(pekerja.gaji);
        
    }
}