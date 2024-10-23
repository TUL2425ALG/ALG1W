package school.z3branchingloops;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class U38GuessTheNumberFull {
    public static Scanner sc = new Scanner(System.in);
    public static int min = 1;
    public static int max = 100;
    public static int randomNumber = 0;
    public static int pokusy = 0;
    public static void main(String[] args) {
        boolean end = false;
        int choice_main;
        do {
            openMenu();
            choice_main = choose();
            switch (choice_main) {
                case 1:
                    userGuesses();
                    break;
                case 2:
                    computerGuesses();
                    break;
                case 3:
                    changeRange();
                    break;
                case 4:
                    end = true;
                    System.out.println("Ukončení programu :)");
                    break;
                default:
                    System.out.println("Špatná volba.");

            }
        } while (!end);
    }

    public static void userGuesses() {
        // Rozsah
        System.out.println("Myslím si číslo od " + min + " do " + max);
        // Random number
        randomNumber = generateRandomNumber(min, max);
        pokusy++;
        // Generování
        boolean uhodl = false;
        do {
            System.out.println("Hádej: ");
            try {
                int userNumber = sc.nextInt();
                if (randomNumber > userNumber) {
                    System.out.println("Myslím si větší číslo");
                } else if (randomNumber < userNumber) {
                    System.out.println("Myslím si menší číslo");
                } else {
                    System.out.println("Správně, uhodl jsi :).");
                    uhodl = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Zadej celé číslo.");
                sc.next();
            }
        } while (!uhodl);
    }

    public static void computerGuesses() {
        int tip;
        boolean uhodl = false;
        // Rozsah
        System.out.println("Počítač si myslí číslo od " + min + " do " + max);
        // Ranom number
        randomNumber = generateRandomNumber(min, max);
        do {
            tip = (max - min) / 2 + min;
            System.out.println("Počítač hádá: " + tip);

            if (tip > randomNumber) {
                System.out.println("Myslím si menší číslo");
                max = tip - 1;
            } else if (tip < randomNumber) {
                System.out.println("Myslím si větší číslo");
                min = tip + 1;
            } else {
                System.out.println("Správně, uhodl jsi :).");
                uhodl = true;
            }
            pokusy++;
        } while (!uhodl);
    }

    public static int generateRandomNumber(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }

    private static void changeRange() {
        boolean validRange = false;
        do {
            try {
                System.out.println("Zadej dolní mez: ");
                min = sc.nextInt();
                System.out.println("Zadej horní mez: ");
                max = sc.nextInt();

                if (min >= max) {
                    System.out.println("Dolní mez musí být menší než horní mez.");
                } else {
                    validRange = true;  // Platný rozsah
                }
            } catch (InputMismatchException e) {
                System.out.println("Zadej platné číslo");
                sc.next();
            }
        } while (!validRange);
    }

    private static void openMenu() {
        System.out.println("-----------------------------");
        System.out.println("Zvol volbu:");
        System.out.println("1. Hádá uživatel");
        System.out.println("2. Hádá počítač");
        System.out.println("3. Změna rozsahu");
        System.out.println("4. Ukončit program");
        System.out.println("-----------------------------");
    }

    private static int choose() { // dá se testovat, zda zadal správně číslo
        int choice = 0;
        boolean valid = false;
        while (!valid) {
            try {
                choice = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Špatná volba, zvol znova: ");
                sc.next();
            }
        }
        return choice;
    }
}
