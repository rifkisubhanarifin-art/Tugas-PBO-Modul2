/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_3_Aggregation_and_Inheritance;

/**
 *
 * @author ASUS
 */
public class KomponenMobil {
    String namaKomponen;
    public KomponenMobil(String namaKomponen){
        this.namaKomponen = namaKomponen;
    }
    public void tampilkanInfo(){
        System.out.println("Komponen" + namaKomponen);
    }
}
