package school.z3branchingloops;

public class VectorTools {

    public static double calcDistance(double ax, double bx, double ay, double by) {
        double distx = ax - bx;
        double disty = ay - by;
        double distanc = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
        return distanc;
    }
}
