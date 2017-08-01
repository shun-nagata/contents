package javaprog.lv6;

public class EvenSum {

	public static void main(String[] args) {
		int[] x = {76, 30, 48, 60, 89, 47, 4, 43, 13};

		int sum = 0;
		for (int xi : x) {
			if (xi % 2 == 0) {
				sum = sum + xi;
			}
		}
		System.out.println(sum);
	}

}
