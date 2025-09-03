/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan_1_Aggregation;

/**
 *
 * @author ASUS
 */
public class Van extends Vehicle{
    private Speed speed;
    
    public Speed getSpeed(){
        return speed;
    }
    public void setSpeed(Speed speed){
        this.speed = speed;
    }
    public void print(){
        System.out.println("Vin: "+this.getVin() + ", Max Speed: "+speed.getMax());
    }
}