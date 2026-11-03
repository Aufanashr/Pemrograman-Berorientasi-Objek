/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author LENOVO
 */
public class Pegawai {
    // Enkapsulasi
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, int gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //Getter & Setter namaPegawai
    public String GetNamaPegawai(){
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    //Getter & Setter Gaji
    public double getgaji(){
        return gaji;
    }
    
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji : " + gaji);
    }
}
