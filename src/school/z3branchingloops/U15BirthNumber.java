package school.z3branchingloops;

public class U15BirthNumber {

    public static void main(String[] args) {
        String firstPart = "780123";
        String secondPart = "3540";

        String fullNumber = firstPart + secondPart;

        long firstNineNumbers = Long.valueOf(fullNumber.substring(0, 9));

        long remainder = firstNineNumbers % 11;
        long lastDigit = Long.valueOf(fullNumber) % 10;

        boolean valid;

        if ((remainder == 10) && (lastDigit == 0)) 
            valid = true;
         else if (remainder == lastDigit) 
            valid = true;
         else 
            valid = false;
        

        if (valid) 
            System.out.println("Rodné číslo je platné.");
         else 
            System.out.println("Rodné číslo není platné.");
        

    }
}
