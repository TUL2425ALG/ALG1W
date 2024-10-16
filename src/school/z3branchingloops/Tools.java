package school.z3branchingloops;

public class Tools {

    public static double calcDistance(double ax, double bx, double ay, double by) {
        double distx = ax - bx;
        double disty = ay - by;
        double distanc = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
        return distanc;
    }
    
    /**
     * Returns whether the specified number is prime
     * @param a specified number
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int a) {
        int n = 2;
        boolean jePrvocislo = true;
        if (a <= 1) {
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
    //testovaci main
    public static void main(String[] args) {
        System.out.println(isPrime(9)); //false
        System.out.println(isPrime(587)); //true
        System.out.println(isPrime(1)); //false //limitni stav
    }
    
    
}
