package school.z3branchingloops;

import java.util.Scanner;
// Jan František Šůla :3
public class U36ChooseShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Vyberte tvar, který chcete vypsat:");
            System.out.println("1. Čtverec");
            System.out.println("2. Trojúhelník");
            System.out.println("3. Trojúhelník (Středový)");
            System.out.println("4. Kosočtverec");
            System.out.print("Zadejte číslo (1-4): ");
            int choice = scanner.nextInt();
            System.out.print("Zadejte velikost:");
            int size = scanner.nextInt();

            switch (choice) {
                case 1: // Čtverec
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // Trojúhelník v rohu
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Trojúhelník na středu
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 4: // Kosočtverec
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = size - 1; i >= 1; i--) {
                        for (int j = 1; j <= size - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;  

                default:
                    System.out.println("To není číslo mezi 1-4 :(");
                    break;
            }

            System.out.print("Chcete pokračovat? (ano/ne): ");
            String response = scanner.next();
            continueProgram = response.equalsIgnoreCase("ano");
        }
    }
}
