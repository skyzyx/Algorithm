public class BinarySearch {
    public static int recursiveBinarySearch(int[] a, int value, int L, int R) {
        if (L > R)
            return -1;
        
        int M = (L + R) / 2;
        if (a[M] == value) {
            return M;
        } else if (a[M] > value) {
            return recursiveBinarySearch(a, value, L, M-1);
        } else {
            return recursiveBinarySearch(a, value, M+1, R);
        }
    }
    
    public static int nonRecursiveBinarySearch(int[] a, int value, int L, int R) {
        while(L <= R) {
            int M = L + (R - L) / 2;
            if (a[M] == value) {
                return M;
            } else if (a[M] > value) {
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++)
            data[i] = i;
        
        System.out.println(recursiveBinarySearch(data, 55, 0, data.length - 1));
        System.out.println(nonRecursiveBinarySearch(data, 35, 0, data.length - 1));
    }
}
