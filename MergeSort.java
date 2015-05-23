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