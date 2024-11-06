package school.z5libraryclasses;

public class MathTools {
    public static double cos(float x, float eps){
        double cos = 1;
        double last; 
        int i = 2;
        int k = 1;
        
        while (true){
            last = (Math.pow(x, i))/fact(i);
            if (last < eps){
                break;
            }
            cos = cos + last * (Math.pow(-1, k));
            i = i + 2;
            k++;
        }
        return cos;
    }

    private static double fact(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
