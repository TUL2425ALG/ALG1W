package school.z3branchingloops;

public class U3235For {
    public static void main(String[] args) {
        System.out.println("Vypis line");
        int n = 5;
        for(int i = 1; i <= n; i++){
            System.out.print("* ");
        }
        System.out.println(""); //cisty novy radek
        System.out.println("Vypis rectangle");
        //obdelnik
        int m = 6;
        for(int j = 1; j <= m; j++){
            for(int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(""); //cisty novy radek
        System.out.println("Vypis triangle");
        //trojuhelnik
        for(int j = 1; j <= m; j++){ //po radcich //j cislo radku 
            for(int i = 1; i <= j; i++){ //a zaroven j je pocet hvezdicek na tom radku
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
            
}
