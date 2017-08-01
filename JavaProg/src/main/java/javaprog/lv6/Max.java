package javaprog.lv6;

public class Max {

	public static void main(String[] args) {
		int[] x = {13, 88, 9, 30, 3, 14, 42, 53};

		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (i == 0) {
				max = x[i];
			}
			if (max < x[i]) {
				max = x[i];
			}
		}
		System.out.println(max);
	}

}
