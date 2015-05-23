import java.util.Arrays;
import java.util.Random;

public static void main(String[] args) {
	int[] data = new int[100];
	Random ran = new Random();
	for (int i = 0; i < 100; i++)
		data[i] = ran.nextInt(1000);

	System.out.println(Arrays.toString(data));
	mergeSort(data);
	System.out.println(Arrays.toString(data));
}

public static void mergeSort(int[] nums, int l, int r) {
	if (l > r)
		return;

	int m = (l + r) / 2;
	mergeSort(nums, l, m);
	mergeSort(nums, m+1, r);
	merge(nums, l, m, r);
}

public static void merge(int[] nums, int l, int m, int r) {
	
}