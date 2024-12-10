
package school.z8structure;

import java.util.Scanner;

/**
 *
 * @author Jan Soupal
 */
public class U1a2ObvodObsahNUhelniku {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // body od uzivatele
        System.out.print("Zadejte pocet bodu mnohouhelniku (n): ");
        int n = sc.nextInt();
        // musi byt aspon 3 body aby tvorily nejakou plochu
        if (n < 3) {
            System.out.println("Mnohouhelnik musi mit alespon 3 body");
            return;
        }
        
        // [n][2] – n bodu, 2 hodnoty pro kazdy bod (x, y)
        double[][] bod = new double[n][2];  

        // body n uhelniku od uzivatele
        for (int i = 0; i < n; i++) {
            System.out.print("Zadejte x souradnici bodu " + (i + 1) + ": ");
            bod[i][0] = sc.nextDouble();
            System.out.print("Zadejte y souradnici bodu " + (i + 1) + ": ");
            bod[i][1] = sc.nextDouble();
        }

        // vypocet obvodu a vypsani
        double obvod = obvod(bod);
        System.out.println("Obvod mnohouhelniku je: " + obvod);
    }

    // ziska vzdalenost mezi dvemma body
    public static double vzdalenost(double x1, double y1, double x2, double y2) {
        //pythagorova veta
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // vypocet obvodu
    public static double obvod(double[][] bod) {
        double obvod = 0.0;
        // pocet dsouradnic
        int n = bod.length;

        //vzdalenosti mezi sousednimi body
        for (int i = 0; i < n - 1; i++) {
            obvod += vzdalenost(bod[i][0], bod[i][1], bod[i + 1][0], bod[i + 1][1]);
        }

        //posledni bod a prvni - vzdalenost
        obvod += vzdalenost(bod[n - 1][0], bod[n - 1][1], bod[0][0], bod[0][1]);

        return obvod;
    }

}

