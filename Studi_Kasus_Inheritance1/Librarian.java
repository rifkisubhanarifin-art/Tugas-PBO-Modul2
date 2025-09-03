/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Inheritance1;

/**
 *
 * @author ASUS
 */
public class Librarian extends User {
     public Librarian(String nama) {
        super(nama);
    }

    public void kelolaBuku() {
        System.out.println(nama + " mengelola buku.");
    }
}
