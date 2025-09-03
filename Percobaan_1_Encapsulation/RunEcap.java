/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_1_Encapsulation;

/**
 *
 * @author ASUS
 */
public class RunEcap {
    
    public static void main (String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("Rifki");
        encap.setAge(20);
        encap.setIdNum("12343ms");
        
        System.out.println("Name: " + encap.getName() + "Age: " + encap.getAge());
        
    }
}
