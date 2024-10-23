package school.z3branchingloops;

import java.util.Scanner;

public class U28PerfectNumbers {
    public static boolean isPerfect(long number) {
        int sum = 0;
        
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { 
                sum += i; //adds divisor
                if((i*i != number )&&(i != 1)){ //check so there is no divisor used twice and number is not used as divisor
                sum += number/i; //adds second divisor
                }
            }
        }
        //System.out.println(sum);
        return sum == number;
    }
    
    public static void main(String[] args){
        long[] nums = {6,28,496, 8128, 33550336, 5};
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]+": "+isPerfect(nums[i]));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Number to check: ");
        try {
            long num = sc.nextLong();
            System.out.println(num + ": " + isPerfect(num));
        } catch (Exception e) {
            System.out.println("Number either too big or invalid.");
        }
    }
}
