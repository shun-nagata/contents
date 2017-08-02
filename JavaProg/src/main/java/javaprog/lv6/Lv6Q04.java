package javaprog.lv6;

/**
 * 配列の要素のうち、最も小さい数を表示する
 */
public class Lv6Q04 {

	public static void main(String[] args) {
		int[] x = {13, 88, 9, 30, 3, 14, 42, 53};

		int min = 0;
		for (int i = 0; i < x.length; i++) {
			if (i == 0) {
				min = x[i];
			}
			if (min > x[i]) {
				min = x[i];
			}
		}

		System.out.println(min);
	}

}
