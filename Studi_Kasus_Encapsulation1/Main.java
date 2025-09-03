/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Encapsulation1;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("akhyan123", "mypassword", "2025-09-10");

        // Menampilkan data menggunakan getter
        System.out.println("UserID: " + user.getUserID());
        System.out.println("Password: " + user.getPassword());
        System.out.println("DueDate: " + user.getDueDate());
    }
}
