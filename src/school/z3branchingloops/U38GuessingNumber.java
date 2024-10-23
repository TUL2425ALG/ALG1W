package school.z3branchingloops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U38GuessingNumber {

    public static Scanner sc = new Scanner(System.in); //globalni promenna
    public static int min = 1;
    public static int max = 100;

    public static void main(String[] args) {
        boolean end = false;
        int answer;
        do{
           displayMenu(); //U38GuessingNumber.displayMenu() //volani metody
           answer = choose();
           switch(answer){
               case 1: changeRange(); break;
               case 2: pcPlays(); break;
               case 3: userPlays(); break;
               case 0: end = true; System.out.println("Konec");break;
               default: System.out.println("Spatna volba");
           }
           
        }while(!end); //end == false
    }
    private static int choose() { //private - metoda pouzitelna jenom v tehle tride
        int a = sc.nextInt();
        return a;
    }

    private static void displayMenu() { //metodu deklaruju, implementace/kod metody
        System.out.println("Vyber volbu:");
        System.out.println("1. Zmen rozsah");
        System.out.println("2. Pocitac hada");
        System.out.println("3. Uzivatel hada");
        System.out.println("0. Konec");
    }

//    //testovaci main
//    public static void main(String[] args) {
//        //displayMenu();
//        pcPlays();
//    }

    private static void pcPlays() {
        System.out.println("Mysli si cislo v rozsahu od " + min + " do " + max);
        int lower = min;
        int upper = max;
        int middle, answer;
        boolean found = false;
        do {
            middle = (lower + upper) / 2;
            System.out.println("Myslel jsi si " + middle +"?");
            System.out.println("Odpovez: ");
            System.out.println(" 0: Je to myslene cislo.");
            System.out.println(" 1: Myslene cislo je vetsi.");
            System.out.println("-1: Myslene cislo je mensi.");
            answer = choose();
            if (answer == 0) {
                System.out.println("Uhodl jsem");
                found = true;
            } else if (answer == 1) {
                lower = middle + 1;
            } else if (answer == -1) {
                upper = middle - 1;
            } else {
                System.out.println("Spatna volba");
            }
        } while (!found && lower <= upper);
        
        if(!found){
            System.out.println("Myslene cislo neni v rozsahu."); //43.5
        }
    }

    private static void userPlays() {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static void changeRange() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
