/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_2_Aggregation;

/**
 *
 * @author ASUS
 */
public class Student {
    int rno;
    String stName;
    
    Address stAddr;
    Student(int roll, String name, Address address){
        this.rno = roll;
        this.stName = name;
        this.stAddr = address;
    }
}
