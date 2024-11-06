package school.z5libraryclasses;

public class NaturalNumberTools {
    
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
            return jePrvocislo;
        }
        while (n <= Math.sqrt(a)) {
            if (a % n == 0) {
                jePrvocislo = false;
                return jePrvocislo;
            }
            n++;
        }
        return jePrvocislo;
    }
    
    public static int findGreatestDivisor(int a, int b){
        int min;
        int divisor = 1;
        boolean divisorFound = false;
        min = (a>b) ? b : a;
//        if (a>b){
//            min = b; 
//                }
//        else{
//            min = a;
//        }
        for(int i=min; i>=2; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                divisor = i;
                return divisor;
            }             
        }
        return divisor;

//        while(!divisorFound)
//        {
//            if(a % min == 0 && b % min == 0)
//            {
//                divisor = min;
//                divisorFound = true;
//            }
//            else
//            {
//                min = min - 1;
//            }
//        }
//        return divisor;
    }
    
    
    
    //testovaci main
    public static void main(String[] args) {
//        System.out.println(isPrime(1)); //false
//        System.out.println(isPrime(10)); //false
//        System.out.println(isPrime(53)); //true
         System.out.println(findGreatestDivisor(20, 12)); // 4
         System.out.println(findGreatestDivisor(24, 12)); // 12
         System.out.println(findGreatestDivisor(23, 12)); // 4
    }
}
