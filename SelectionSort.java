// http://www.java2novice.com/java-sorting-algorithms/selection-sort/

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {    
    public static void mySelectionSort(int[] A) {
        if (A == null || A.length < 2)
            return;
        
        for (int i = 0; i < A.length; i++) {
            int index = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[index]) {
                    index = j;
                }
            }
            
            int temp = A[index];
            A[index] = A[i];
            A[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] data = new int[50];
        Random ran = new Random();
        
        for (int i = 0; i < data.length; i++)
            data[i] = ran.nextInt(1000);
        
        System.out.println(Arrays.toString(data));
        mySelectionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
