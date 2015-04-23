
// Implement double sqrt(double x) and int sqrt(double x).

// http://introcs.cs.princeton.edu/java/13flow/Sqrt.java.html
// http://www.glassdoor.com/Interview/Implement-double-sqrt-double-x-in-C-QTN_87210.htm

public class sqrt {
	public static double sqrt(double x) {
		double min = 0.0;
		double max = x;
		double epsilon = 1e-9;

		while (Math.abs(max - min) > epsilon) {
			double mid = (min + max) / 2.0;
			if (mid * mid > x)
				max = mid;
			else
				min = mid;
		}
		return max;
	}

	public static int intSqrt(double y) {
        double R = y;
        double L = 0;
        while (R - L > 1e-9) {
            double M = (L + R) / 2;
            if (M * M > y) {
                R = M;
            } else {
                L = M;
            }
        }
        return (int)R;
    }

	public static void main(String[] args) {
		System.out.println(sqrt(2));
		System.out.println(sqrt(1000000));
		System.out.println(sqrt(0.4));
		System.out.println(sqrt(1048575));
		System.out.println(sqrt(16664444));
		System.out.println(sqrt(1e-50));
	}

}