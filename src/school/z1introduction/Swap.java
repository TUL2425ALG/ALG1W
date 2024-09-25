package school.z1introduction;

public class Swap {
    public static void main(String[] args) {
        int a = 34;
        int b = 89;
        System.out.println(a + ", " + b);
        
        //1.varianta
        System.out.println(b + ", " + a);
        
        //2. varianta
        int c;
        c = a; //udelani zalohy a
        a = b; //prepsani acka beckem
        b = c;  //prepsani becka ceckem
        System.out.println(a + ", " + b);
    }
}
