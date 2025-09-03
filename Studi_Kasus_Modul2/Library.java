/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Modul2;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Library {
    private List<User> users = new ArrayList<>();
    private List<Material> materials = new ArrayList<>();

    public void addUser(User user) { users.add(user); }
    public void addMaterial(Material material) { materials.add(material); }

    public void showUsers() {
        System.out.println("=== List Users ===");
        for (User u : users) System.out.println("- " + u.getUserID());
    }

    public void showMaterials() {
        System.out.println("=== List Materials ===");
        for (Material m : materials) System.out.println("- " + m.getTitle() + " by " + m.getAuthor());
    }
}
