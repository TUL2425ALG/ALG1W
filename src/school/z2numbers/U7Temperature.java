package school.z2numbers;

import java.util.Scanner;

public class U7Temperature {
    public static void main(String[] args) {
    //input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Teplota v 6 hodin: ");
    double Teplotav6 = scanner.nextDouble();
    System.out.println("Teplota v 12 hodin: ");
    double Teplotav12 = scanner.nextDouble();
    System.out.println("Teplota v 18 hodin: ");
    double Teplotav18 = scanner.nextDouble();
    //processing
    double prumerTeplota = (Teplotav6 + Teplotav12 + 2*Teplotav18)/4;
    //output
    System.out.println("Průměrná teplota je: "+ prumerTeplota + "°C" );               
}
}    

