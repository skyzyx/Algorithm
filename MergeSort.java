import java.util.Arrays;
import java.util.Random;

public static void main(String[] args) {
	int[] data = new int[100];
	Random ran = new Random();
	for (int i = 0; i < 100; i++)
		data[i] = ran.nextInt(1000);

	System.out.println(Arrays.toString(data));
	mergeSort(data, 0, 99);
	System.out.println(Arrays.toString(data));
}

public static void mergeSort(int[] nums, int l, int r) {
	if (l >= r)
		return;

	int m = (l + r) / 2;
	mergeSort(nums, l, m);
	mergeSort(nums, m+1, r);
	merge(nums, l, m, r);
}

public static void merge(int[] nums, int l, int m, int r) {
	int n1 = m - l - 1;
	int n2 = r - m;

	int[] A = new int[n1];
	int[] B = new int[n2];

	for (int i = 0; i < n1; i++)
		A[i] = nums[l + i];

	for (int j = 0; j < n2; j++)
		B[j] = nums[m + l + j];

	int i = 0, j = 0, k = l;
	while (i < n1 && j < n2) {
		if (A[i] <= B[j])
			nums[k++] = A[i++];
		else
			nums[k++] = B[j++]
	}

	while (i < n1)
		nums[k++] = A[i++];

	while (j < n2)
		nums[k++] = B[j++];
}