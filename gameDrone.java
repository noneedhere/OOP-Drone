/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drone_Pakchandra;

/**
 *
 * @author Asus
 */
public class gameDrone {
    public static void main (String[] args){
        Drone yanto = new Drone ();
        yanto.energi = 100;
        yanto.kecepatan = 60;
        yanto.ketinggian = 100;
        yanto.merek = "Guava";
        
        //untuk menentukan gerakan atau aktivitas dari objek
        
        yanto.terbang();
        yanto.matikanMesin();
        yanto.belok();
        yanto.maju();
        yanto.matikanMesin();
        yanto.turun();
        yanto.matikanMesin();
        
        
        //dan seterusnya
    }
}
