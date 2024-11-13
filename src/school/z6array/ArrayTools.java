package school.z6array;

import static school.z6array.LoadPrintArray.loadArray;

public class ArrayTools {

    public static void main(String[] args) {
//        int[] pole = loadArray();
        int[] pole = {21, 3, 2, 2, 24, 1};
        int s = soucet(pole); //ocekavany vysledek 9
        System.out.println(s);
        System.out.println(max(pole));
        System.out.println(minFirst(pole));
        System.out.println(minLast(pole));
        System.out.println(minCount(pole));

    }

    public static int soucet(int[] pole) {
        int sum = 0;
        for (int i = 0; i < pole.length; i++) {
            sum = sum + pole[i];
        }
        return sum;
    }

    public static int max(int[] pole) {
        //int max = Integer.MIN_VALUE;
        int max = pole[0];
        for (int i = 1; i < pole.length; i++) {
            if (pole[i] > max) {
                max = pole[i];
            }
        }
        return max;
    }

    /**
     * @param pole
     * @return index prvniho nejmensiho cisla
     */
    public static int minFirst(int[] pole) {
        int min = pole[0];
        int minIndex = 0;
        for (int i = 1; i < pole.length; i++) {
            if (pole[i] < min) {
                min = pole[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * @param pole
     * @return index posledniho nejmensiho cisla
     */
    public static int minLast(int[] pole) {
        int min = pole[0];
        int minIndex = 0;
        for (int i = 1; i < pole.length; i++) {
            if (pole[i] <= min) {
                min = pole[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int minCount(int[] pole) {
        int min = pole[0];
        int minCount = 1;
        for (int i = 1; i < pole.length; i++) {
            if (pole[i] < min) {
                min = pole[i];
                minCount = 1;
            } else if (pole[i] == min) {
                minCount = minCount + 1;
            }
        }
        return minCount;
    }

}
