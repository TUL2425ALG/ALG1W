package school.z6array;

import java.util.Scanner;

public class U9Platidla {

    public static void main(String[] args) {
        //vstup
        System.out.println("Kdyz chces skoncit zadej zapornou castku ");
        boolean opakuj = true;
        while (opakuj) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadej částku: ");
            int penize = sc.nextInt();
            int castka = penize;
            if (castka < 0)
            {
                opakuj = false;
                break;
            }
            String mena = "Kč";
            int[] bankovky = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
            // processing
            int[] kolikBankovek = new int[bankovky.length];
            int i = 0;
            while (castka != 0) {
                kolikBankovek[i] = castka / bankovky[i];
                castka = castka % bankovky[i];
                i++;
            }
            //vystup
            System.out.println("Vyplatit " + penize + " se da:");
            for (int y = 0; y < bankovky.length; y++) {
                System.out.println(bankovky[y] + " " + mena + " - " + kolikBankovek[y]);
            }
        }
    }
}
