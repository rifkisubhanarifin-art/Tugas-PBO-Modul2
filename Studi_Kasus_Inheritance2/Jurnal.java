/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Inheritance2;

/**
 *
 * @author ASUS
 */
public class Jurnal extends Material {
    public Jurnal(String judul) {
        super(judul);
    }

    public void review() {
        System.out.println(judul + " adalah jurnal yang sedang direview.");
    }
}
