/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TugasModul3;

/**
 *
 * @author LENOVO
 */

public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    // Constructor
    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    // Getter & Setter Merk
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    // Getter & Setter Model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    // Getter & Setter Tahun
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    // Method displayInfo()
    public void displayInfo() {
        System.out.println("Merk  : " + getMerk());
        System.out.println("Model : " + getModel());
        System.out.println("Tahun : " + getTahun());
    }
}
