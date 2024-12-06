package school.z7array2d;

public class StochastickaMatice {
    public static void main(String[] args) {
        double[][] a = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println(stochastickaMatice(a));
    }
    
    public static boolean stochastickaMatice(double[][] matice){
        for(int i = 0; i < matice.length; i++){
            double soucet = 0;
            for(int j = 0; j < matice[i].length; j++){
                soucet += matice[i][j];
            }
            for(int j = 0; j < matice[i].length; j++){
                if ((matice[i][j] > 1 || matice[i][j] < 0) || soucet != 1){
                    return false;
                }
            }
            soucet = 0;
        }
        return true; 
    }
}
