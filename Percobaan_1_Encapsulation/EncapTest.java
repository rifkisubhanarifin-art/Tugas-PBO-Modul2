/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_1_Encapsulation;

/**
 *
 * @author ASUS
 */
public class EncapTest {
    private String name;
    private String idNum;
    private int age;
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNum(){
        return idNum;
    }
    public void setAge (int newAge){
        age = newAge;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setIdNum(String newId){
        idNum = newId;
    }
}
