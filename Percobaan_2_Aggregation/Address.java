/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_2_Aggregation;

/**
 *
 * @author ASUS
 */
public class Address {
    int strNum;
    String city;
    String state;
    String country;
    
    Address(int street, String c, String st, String country){
        this.strNum = street;
        this.city = c;
        this.state = st;
        this.country = country;
    }
}
