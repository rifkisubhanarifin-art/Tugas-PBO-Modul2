/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Inheritance2;

/**
 *
 * @author ASUS
 */
public class Material {
     String judul;

    public Material(String judul) {
        this.judul = judul;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
    }
}
