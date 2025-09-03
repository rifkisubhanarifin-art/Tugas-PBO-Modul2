/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_3_Aggregation_and_Inheritance;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private Mesin mesin;
    private Baterai baterai;
    
    public Mobil(Mesin mesin, Baterai baterai){
        this.mesin = mesin;
        this.baterai = baterai;
    }
    public void mulaiJalan(){
        System.out.println("Mobil mulai berjalan...");
        mesin.nyalakanMesin();
        baterai.cekBaterai();
    }
}
