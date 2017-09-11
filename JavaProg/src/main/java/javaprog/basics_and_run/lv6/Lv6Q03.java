package javaprog.basics_and_run.lv6;

/**
 * 配列の要素のうち、最も大きい数を表示する
 */
public class Lv6Q03 {

	public static void main(String[] args) {
		int[] x = {13, 88, 9, 30, 3, 14, 42, 53};

		int max = x[0];
		for (int i = 1; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
		}

		System.out.println(max);
	}

}
