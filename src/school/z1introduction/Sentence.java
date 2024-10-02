package school.z1introduction;

public class Sentence {
    public static void main(String[] args) {
        //input
        String name = "Filip";
        int yob = 2010;
        char classId = 'A';
        final int CURRENT_YEAR  = 2024;
        final int START_SCHOOL_YEAR = 6;
        
        //processing
        int age = CURRENT_YEAR - yob;
        int classNumber = age - START_SCHOOL_YEAR; 
        
        //output
        //Dite Filip ma 14 let a chodi do 8.A.
        String sentence = "Dite " + name + " ma " + age + " let a chodi do " + classNumber + "." + classId +".";
        System.out.println(sentence);
        
    }
}
