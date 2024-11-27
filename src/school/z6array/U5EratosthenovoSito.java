package school.z6array;
import java.util.Scanner;

public class U5EratosthenovoSito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo do ktereho chces znat prvocisla");
        int k = sc.nextInt();
        boolean[] poleCisel = new boolean[k+1];
        
        for(int i = 2; i<k;i++){
            poleCisel[i]=true;
        }
        
        for(int i=2; i*i<=k; i++){
            if(poleCisel[i]){
                for(int j = i; j*i<=k;j++){
                    poleCisel[j*i]=false;
                }
            }
        }
        for(int i = 2; i<=k; i++){
            if(poleCisel[i]){
                System.out.println(i + "je prvocislo");
            }
        }
    }
}
