/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Inheritance1;

/**
 *
 * @author ASUS
 */
public class Student extends User{
     public Student(String nama) {
        super(nama);
    }

    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku.");
    }
}
