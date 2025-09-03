/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Inheritance2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Book b = new Book("Belajar Java");
        Jurnal j = new Jurnal("Jurnal Teknologi 2025");

        b.tampilkanInfo();
        b.baca();

        j.tampilkanInfo();
        j.review();
    }
}
