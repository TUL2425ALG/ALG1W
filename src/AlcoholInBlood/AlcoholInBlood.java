/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlcoholInBlood;

import java.util.Scanner;

public class AlcoholInBlood {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Vstupy
        System.out.print("Zadejte objem vypitého nápoje (v ml): ");
        double Q = scanner.nextDouble();
        
        System.out.print("Zadejte procenta alkoholu ve vypitém nápoji: ");
        double p = scanner.nextDouble();
        
        System.out.print("Zadejte hmotnost konzumenta (v kg): ");
        double M = scanner.nextDouble();
        
        System.out.print("Zadejte čas od vypití (v hodinách): ");
        double CasOdPozreni = scanner.nextDouble();
        
        // Výpočet
        double[] vysledky = Vypocet(Q, p, M, CasOdPozreni);
        
        double AktualniPromile = vysledky[0];
        double CasDoStrizlivosti = vysledky[1];
        
        // Výstupy
        System.out.printf("Aktuální promile alkoholu v krvi: %.4f ‰\n", AktualniPromile);
        System.out.printf("Čas do střízlivosti od vypití: %.2f hodiny\n", CasDoStrizlivosti);
        System.out.println("hodnoty jsou pouze orientační. kalkulačka nebere v potaz individuální přístup, který je v medicíně vyžadován.");
        System.out.println("pokud jsi pil tak neřiď. lol.");
        
        if (AktualniPromile > 1.5) {
            System.out.println("https://alkoholpodkontrolou.cz");
        }
        
        scanner.close();
    }
    
    // výpočet BTS
    public static double[] Vypocet(double Q, double p, double M, double CasOdPozreni) {
        
        double rho = 0.8; 
        double r = 0.7;     
        double beta = 0.1;  

        double Met = (Q * p * rho) / 100;   //ethanol [g]
        
        double prom = Met / (M * r); //Promile[g/kg]

        double Uet = M * beta; // Rychlost odbourávání [g/hod]

        double CasDoStrizlivosti = Met / Uet; // Čas potřebný k odbourání alkoholu [hodiny]

        double AktualniPromile = prom - (Uet * CasOdPozreni) / (M * r); // Aktuální promile po zadaném čase
        AktualniPromile = Math.max(AktualniPromile, 0); // Zabrání negativním hodnotám

        return new double[]{AktualniPromile, CasDoStrizlivosti};
    }
}
