package javaprog.basics_and_run.lv6;

/**
 * 配列の要素の平均値を表示する
 */
public class Lv6Q01 {

	public static void main(String[] args) {
		int[] x = {18, 71, 3, 63, 43};

		int sum = 0;
		for (int xi : x) {
			sum = sum + xi;
		}

		float ave = (float) sum / x.length;

		System.out.println(ave);
	}

}
