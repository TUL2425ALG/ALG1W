/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alg1wmycodes.C1_introduction;

/**
 *
 * @author Paletta
 */
public class ToSeconds {
    public static void main(String[] args) {
        
        //input
        int hours = 2;
        int minutes = 36;
        int seconds = 57;
        
        //processing
        int time_in_seconds = hours * 3600 + minutes * 60 + seconds;
        
        //output
        
        System.out.println(time_in_seconds);
    }
    
}
