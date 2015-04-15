import java.util.Arrays;
import java.util.Random;

public class InsertionSort { 
    public static void myInsertionSort(int[] A) {
        if (A == null || A.length < 2)
            return;
        
        for (int i = 1; i < A.length; i++) {
            int j = i;
            while (j > 0) {
                if (A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] data = new int[100000];
        Random ran = new Random();
        
        for (int i = 0; i < data.length; i++)
            data[i] = ran.nextInt(1000);
        
        System.out.println(Arrays.toString(data));
        myInsertionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
