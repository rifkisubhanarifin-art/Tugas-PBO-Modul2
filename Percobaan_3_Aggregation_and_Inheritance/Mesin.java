/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_3_Aggregation_and_Inheritance;

/**
 *
 * @author ASUS
 */
public class Mesin extends KomponenMobil{
    public Mesin (String namaMesin){
        super(namaMesin);
    }
    public void nyalakanMesin(){
        System.out.println(namaKomponen + " dinyalakan");
    }
}
