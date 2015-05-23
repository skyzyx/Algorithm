// http://www.algolist.net/Algorithms/Sorting/Quicksort

import java.util.Arrays;
import java.util.Random;

public class QuickSort {   
    public static void myQuickSort(int[] A, int low, int high) {
        if (A == null || A.length < 2 || low >= high)
            return;
        
        int i = low;
        int j = high;
        int pivot = A[(low + high) / 2];
        
        while (i <= j) {
            while (A[i] < pivot)
                i++;
            while (A[j] > pivot)
                j--;
            if (i <= j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        
        myQuickSort(A, low, j);
        myQuickSort(A, i, high);        
    }
    
    public static void main(String[] args) {
        int[] data = new int[30];
        Random ran = new Random();
        
        for (int i = 0; i < data.length; i++)
            data[i] = ran.nextInt(10000);
        
        System.out.println(Arrays.toString(data));
        myQuickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}
