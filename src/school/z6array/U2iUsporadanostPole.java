package school.z6array;

import java.util.Scanner;

public class U2iUsporadanostPole {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //vstup hodnot
        System.out.println("Zadej pocet cisel");
        int n = sc.nextInt();
        int[] numbers1 = new int[n];
        System.out.println("Zadej hodnoty");
        LoadPrintArray.loadArray(numbers1);
        //processing
        boolean vzestupnost = ArrayTools.jeVzestupny(numbers1);
        //vystup
        if (vzestupnost) {
            System.out.println("Pole je vzestupny");
        } else {
            System.out.println("Pole není vzestupny");
        }
    }
}
