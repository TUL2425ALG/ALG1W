package school.z7array2d;

public class MatrixTools {

    public static void normovanyTvar(int[][] a) {
        int maxAbs = 0;
        int abs;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                abs = Math.abs(a[i][j]);
                if (abs > maxAbs) {
                    maxAbs = abs;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] / maxAbs;
            }
        }

    }

    public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) {
        int[][] matrixProduct = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Neplatna matice"); //nepouzivat v metodach sout, vratit treba prazdne pole, nebo vyjimku
        } else {
            for (int i = 0; i < (matrixProduct.length); i++) {
                for (int j = 0; j < matrixProduct[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        matrixProduct[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return matrixProduct;
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
//        normovanyTvar(a);
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

    public static int[][] normovanyTvar2(int[][] a) {
        int[][] b = new int[a.length][a[0].length];

        int maxAbs = 0;
        int abs;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                abs = Math.abs(a[i][j]);
                if (abs > maxAbs) {
                    maxAbs = abs;
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

    public static boolean isSymetricByDiagonal(int[][] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSymetricBySideDiagonal(int[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[i][j] != a[a.length - 1 - j][a.length - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSymetricByVerticalAxe(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                if (a[i][j] != a[i][a[i].length - 1 - j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSymetricByHorizontalAxe(int[][] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != a[a.length - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
