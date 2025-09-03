/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studi_Kasus_Modul2;

/**
 *
 * @author ASUS
 */
public class Jurnal extends Material {
     private String issn;
    private int volume;

    public Jurnal(String title, String author, String issn, int volume) {
        super(title, author);
        this.issn = issn;
        this.volume = volume;
    }

    public String getIssn() { return issn; }
    public int getVolume() { return volume; }
}
