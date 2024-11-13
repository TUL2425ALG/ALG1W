package school.z6array;

import java.util.Scanner;

public class LoadPrintArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadej pocet hodnot");
        int n = sc.nextInt();
        System.out.println("Zadavej postupne hodnoty");
        int[] numbers = new int[n];
        loadArray(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = sc.nextInt();
//        }
        //System.out.println(numbers); //hash pole
        printArray(numbers);
//        System.out.print("[");
//        for (int i = 0; i < numbers.length - 1; i++) { //prochazim o 1 prvek min
//            System.out.print(numbers[i] + ", ");
//        }
//        System.out.println(numbers[numbers.length - 1] + "]");
    }

    public static int[] loadArray(int n, Scanner sc) {
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static int[] loadArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet hodnot");
        int n = sc.nextInt();
        System.out.println("Zadavej postupne hodnoty");
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
    
    public static float[] loadArrayFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet hodnot");
        int n = sc.nextInt();
        System.out.println("Zadavej postupne hodnoty");
        float[] numbers = new float[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextFloat();
        }
        return numbers;
    }
    //overloaded method, pretizene metody - stejny nazev, jiny pocet nebo typ vstupnich parametru
    public static void loadArray(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextFloat();
        }
    }

    public static void loadArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
    }
    
    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
    public static void printArray(float[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.format("%.2f ",numbers[i]);
        }
    }

}
