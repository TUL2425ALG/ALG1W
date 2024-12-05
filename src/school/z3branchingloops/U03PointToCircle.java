package school.z3branchingloops;

/*
 *
 * Test1 in: Bod A =[10,10] out: mimo 
 * Test2 in: Bod A =[2,2] out: uvnitr
 * Test3 in: Bod A =[1,6] na
 * Test4 in: Bod A =[1.00001,6] na
 * Test5 in: Bod A =[1.1,6] mimo
 */
public class U03PointToCircle {

    public static void main(String[] args) {
        //in
        double ax = 1.1;
        double ay = 6;
        double sx = 1;
        double sy = 1;
        double r = 5;
        final int OUT = 1;
        final int ON = 2;
        final int IN = 3;
        final double EPS = 0.0001; //presnost

        //processing
//        double distx = ax - sx;
//        double disty = ay - sy;
//        double distanc = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
        double distance = Tools.calcDistance(ax, sx, ay, sy); //volani metody
        int result;
        //if (distanc == r) {
        if(Math.abs(distance - r) < EPS){
            result = ON;
        } else if (distance < r) {
            result = IN;
        } else {
            result = OUT;
        }
        
        //vypis
        switch (result) {
            case IN -> System.out.println("Bod je uvnitř kružnice");
            case ON -> System.out.println("Bod je na kružnici");
            case OUT -> System.out.println("Bod je mimo kružnici");
            default -> System.out.println("V programu nastala nejaka chyba");
        }
        
        //nepresnost realnych cisel
//        double a = 5.4;
//        double b = 6.2;
//        System.out.println(a+b);

    }
}
