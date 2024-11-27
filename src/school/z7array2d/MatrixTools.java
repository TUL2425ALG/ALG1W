package school.z7array2d;

import java.util.Scanner;

public class MatrixTools {

    public static void NormovanyTvar(int[][] a) {
        int maxAbs = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (Math.abs(a[i][j]) > maxAbs) {
                    maxAbs = Math.abs(a[i][j]);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] / maxAbs;
            }
        }

    }

    public static void main(String[] args) {
        //int[][] a = {{2, 9},
        //{5, -9}};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej prvni rozmer pole: ");
//        int m = sc.nextInt();
//        System.out.println("Zadej druhy rozmer pole: ");
//        int n = sc.nextInt();
//        int[][] a = new int[m][n];
//        System.out.println("Napis hodnoty: ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        NormovanyTvar(a);
////        int[][] norm = NormovanyTvar2(a);
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.printf("%5d ", a[i][j]);
//
//            }
//            System.out.println("");
//        }
        
        int[][] matrix = {{2, 6, 6, 2},
                          {6, 3, 3, 6},
                          {7, 1, 1, 7},
                          {2, 7, 7, 2}};
        
        
        System.out.println(MatrixTools.isSymetricByDiagonal(matrix));
        System.out.println(MatrixTools.isSymetricBySideDiagonal(matrix));
        System.out.println(MatrixTools.isSymetricByVerticalAxe(matrix));
        System.out.println(MatrixTools.isSymetricByHorizontalAxe(matrix));
    }

    public static int[][] NormovanyTvar2(int[][] a) {
        int[][] b = new int[a.length][a[0].length];

        int maxAbs = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (Math.abs(a[i][j]) > maxAbs) {
                    maxAbs = Math.abs(a[i][j]);
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[i][j] / maxAbs;
            }
        }
        return b;

    }
    public static boolean isSymetricByDiagonal(int[][] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++){
                if (a[i][j] != a[j][i]){
                    return false;
                }
            }
    }
        return true;
}
    public static boolean isSymetricBySideDiagonal(int[][] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++){
                if (a[i][j] != a[a.length-1-j][a.length-1-i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSymetricByVerticalAxe(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length / 2; j++){
                if (a[i][j] != a[i][a[i].length-1-j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSymetricByHorizontalAxe(int[][] a){
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length; j++){
                if (a[i][j] != a[a.length-1-i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    
}
