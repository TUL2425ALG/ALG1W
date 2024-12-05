
package school.z8structure;


public class U10Students {
    public static int[] average(int[][] a) {
        int[] _averages = new int[a.length];
        int sumStudent;
        for (int i = 0; i < a.length; i++) {
            sumStudent = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumStudent = sumStudent +a[i][j];
            }
            _averages[i] = sumStudent/a[i].length;
        }
        return _averages;
        
    }
    public static void main(String[] args) {
        // nacteme studenty
        //int[][] students = new int[][];  
        
        //vystup
        int[] averages ;
        //averages = average(students);
     }
}
