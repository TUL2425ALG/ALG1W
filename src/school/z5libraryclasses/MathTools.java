package school.z5libraryclasses;

public class MathTools {
        public static double cos(double x, double eps) {
        double cos = 1;
        double k = 2;
        double l = 3;
        double m = 4;

        double last = (Math.pow(x, 2)) / 2;
        cos = cos + last * (-1);
        while (true) {
            last = last * ((Math.pow(x, 2)) / (l * m));
            if (last < eps) {
                break;
            }
            cos = cos + last * (Math.pow(-1, k));
            k = k + 1;
            l = l + 2;
            m = m + 2;
        }
        return cos;
    }
        
}
