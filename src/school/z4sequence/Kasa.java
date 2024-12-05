package school.z4sequence;

import java.util.Scanner;
// Test: 5 4 1 100 1 2 50 3 1 0 
public class Kasa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double polozka = sc.nextDouble();
        double sum = 0;
        int pocetPotravin = 0;
        double sumPotravin = 0;
        int bonus = 0;
        double min = polozka;
        
        System.out.println("Zadejte cenu polozky: ");
        while (polozka != 0){
            System.out.println("Zadejte pocet polozek: ");
            int pocet = sc.nextInt();
            System.out.println("Zadejte typ polozky: ");
            int typ = sc.nextInt();
            
            if (typ == 1){
               pocetPotravin++;
               sumPotravin = sumPotravin + polozka*pocet;
            }    
            
            sum = sum + pocet * polozka;
            
            if (polozka < min){
                min = polozka;
            }
                
            System.out.println("Prubezna suma je: " + sum);
            
            System.out.println("Zadejte cenu polozky: ");
            polozka = sc.nextDouble();  
        }
        bonus = (int)(sum / 200);
        
        System.out.printf("Celkova cena nakupu: %.2f \n", sum);
        System.out.println("Potravin bylo: " + pocetPotravin);
        System.out.printf("Celkova cena potrvin je: %.2f \n", sumPotravin);
        String samolepky = (bonus > 0)?"Mate narok na samolepky: " + bonus:"Nemate narok na samolepky";
        System.out.println(samolepky);
        System.out.println("Minimalni cena polozky je: " + min );
        
        
        System.out.println("Chcete se zaplatit stravekami? 1-ANO; 2-NE");
        int moznostPlaceni = sc.nextInt();
        System.out.println("Jake maji hodnotu stravenky? ");
        int hodnotaStr = sc.nextInt();
        
        int maxPocetStr = (int)(sumPotravin / hodnotaStr);
        int pocetStr = (maxPocetStr <= 5)? maxPocetStr : 5 ;
        System.out.println("Muzete pouzit: " + pocetStr + " stravenek. ");
    }
    
}
