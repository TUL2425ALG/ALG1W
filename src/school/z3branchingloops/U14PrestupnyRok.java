package school.z3branchingloops;

public class U14PrestupnyRok {

    public static void main(String[] args) {
        int rok = 2001;
        
//        boolean isLeap = ((rok % 4) == 0 && !((rok % 100) == 0)) || (rok % 400) == 0;
//        int nDays = isLeap? 366 : 365;
        
//        int nDays = isLeap(rok)? 366 : 365;
           int nDays = getNumberDays(rok); 
        
        System.out.println(nDays);
    }
    /**
     * Returns whether it is a specified year is leap
     * @param year
     * @return 
     */
    public static boolean isLeap(int year){
        boolean isLeap = ((year % 4) == 0 && !((year % 100) == 0)) || (year % 400) == 0;
        return isLeap;
    }
    
    public static int getNumberDays(int year){
        return isLeap(year)? 366 : 365;
    }
    
    
}
