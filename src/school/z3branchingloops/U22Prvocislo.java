package school.z3branchingloops;

/*Zapište program, který bude určovat, zda zadané číslo je prvočíslo. Porovnání případu, kdy budeme testovat 
všechny potenciální dělitele nebo ukončíme cyklus při nalezení prvního dělitele (předčasné ukončení cyklu zajistit 
podmínkou v záhlaví příkazu while a nikoli příkazem break). Modifikace pro opakované zadávání čísel.*/
import java.util.Scanner;

public class U22Prvocislo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        int pokracovani = 1;
        char answer;
        String answer2;
        while (shouldContinue) {
            System.out.println("Zadejte čislo: ");
            int a = scanner.nextInt();
                
            boolean jePrvocislo = U22Prvocislo.isPrime(a); //volani metody
//            int n = 2;
//            boolean jePrvocislo = true;
//            if (a <= 1) {
//                jePrvocislo = false;
//            }
//            while (n <= Math.sqrt(a) && jePrvocislo) {
//                if (a % n == 0) {
//                    jePrvocislo = false;
//                    //break;
//                }
//                n++;
//            }
            System.out.println(jePrvocislo);
//            System.out.println("Pokud chcete pokracovat, stisknete 1");
//            pokracovani = scanner.nextInt();
//            shouldContinue = pokracovani == 1;
            System.out.println("Pokud chcete pokracovat stisknete a/A");
            answer = scanner.next().toLowerCase().charAt(0);
            shouldContinue = answer == 'a';
//            System.out.println("Pokud chcete pokracovat zadejte ano/Ano/ANO");
//            answer2 = scanner.next().toLowerCase();
//            shouldContinue = answer2.equals("ano");
        }

    }

    /**
     * Returns whether the specified number is prime
     * @param a specified number
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int a) {
        int n = 2;
        boolean jePrvocislo = true;
        if (a <= 1) { //limitní stav
            jePrvocislo = false;
        }
        while (n <= Math.sqrt(a) && jePrvocislo) {
            if (a % n == 0) {
                jePrvocislo = false;
                //break;
            }
            n++;
        }
        return jePrvocislo;
    }

}
