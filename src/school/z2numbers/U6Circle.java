package school.z2numbers;

import java.util.Scanner;

public class U6Circle {
    public static void main(String[] args) {
    //input
    Scanner sc = new Scanner(System.in);
    System.out.println("Zadej polomer:");
    double r = sc.nextDouble();//2;
    //final double PI = Math.PI;//3.14159;
    
    //processing
    double obsah = Math.PI * Math.pow(r, 2); //polomer * polomer;
    double obvod = 2 * Math.PI * r;
    
    //output
    //System.out.println("Obsah rovna se: " + obsah + ",\nObvod rovna se: "+ obvod + ".");
    System.out.format("Obsah rovna se: %.2f, \nObvod rovna se: %.2f.\n", obsah, obvod);
    }
}