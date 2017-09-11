package javaprog.basics_and_run.lv6;

/**
 * 配列の要素のうち、奇数のみの合計を表示する
 */
public class Lv6Q06 {

	public static void main(String[] args) {
		int[] x = {76, 30, 48, 60, 89, 47, 4, 43, 13};

		int sum = 0;
		for (int xi : x) {
			if (xi % 2 != 0) {
				sum = sum + xi;
			}
		}

		System.out.println(sum);
	}

}
