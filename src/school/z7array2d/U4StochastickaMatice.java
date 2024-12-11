package school.z7array2d;

public class U4StochastickaMatice {
    public static void main(String[] args) {
        double[][] a = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 0.5}
        };
        System.out.println(stochastickaMatice(a));
    }
    
    public static boolean stochastickaMatice(double[][] matice){
        for(int i = 0; i < matice.length; i++){
            double soucet = 0;
            for(int j = 0; j < matice[i].length; j++){
                if(matice[i][j] < 0 || matice[i][j] > 1){
                    return false;
                }
                soucet += matice[i][j];
            }
            if(soucet != 1){
                return false;
            }
        }
        return true; 
    }
}
