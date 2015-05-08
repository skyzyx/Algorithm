import java.util.Arrays;
import java.util.Random;

public class BubbleSort {    
    public static void myBubbleSort(int[] A) {
        if (A == null || A.length < 2)
            return;
        
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] data = new int[100];
        Random ran = new Random();
        
        for (int i = 0; i < data.length; i++)
            data[i] = ran.nextInt(1000);
        
        System.out.println(Arrays.toString(data));
        myBubbleSort(data);
        System.out.println(Arrays.toString(data));        
    }
}
