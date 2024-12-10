package school.z7array2d;

public class U4StochastickaMatice {
    public static void main(String[] args) {
        double[][] a = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println(stochastickaMatice(a));
    }
    
    //JV prochazejte sloupce a u kazdeho prvku testujte jestli je zaporny, pokud ano false, zaroven delejte soucet na radku a po kazdem radku otestujte sumu na 1
    public static boolean stochastickaMatice(double[][] matice){
        for(int i = 0; i < matice.length; i++){
            double soucet = 0;
            for(int j = 0; j < matice[i].length; j++){
                soucet += matice[i][j];
            }
            for(int j = 0; j < matice[i].length; j++){
                if ((matice[i][j] > 1 || matice[i][j] < 0) || soucet != 1){ //JV je zbytecne pro kazdy prvek na radku testovat zda suma radku nerovna se 1
                    return false;                                           
                }
            }
            soucet = 0;
        }
        return true; 
    }
}
