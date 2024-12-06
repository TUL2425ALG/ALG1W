/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.z7array2d;

/**
 *
 * @author rehak
 */
import java.util.Scanner;
public class MatrixValuesChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte velikost matice (N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Zadejte prvky matice:");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        boolean isValid = true;
        for (int number = 1; number <= n * n; number++) {
            boolean found = false;
            // Hledání aktuálního čísla v celé matici
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == number) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                isValid = false;
                break;
            }
        }
        
            if (isValid) {
                System.out.println("Matice obsahuje všechny hodnoty od 1 do " + (n * n) + ".");
            }
            else{
                System.out.println("Matice neobsahuje všechny hodnoty od 1 do " + (n * n) + ".");
            }

        
    }
}
