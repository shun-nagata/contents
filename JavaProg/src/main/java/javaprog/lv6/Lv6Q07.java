package javaprog.lv6;

/**
 * 二つの配列の要素の積（x1×y1, x1×y2...）を表示する
 */
public class Lv6Q07 {

	public static void main(String[] args) {
		int[] x = {6, 7, 1, 3, 2};
		int[] y = {8, 6, 4, 7, 5};

		for (int xi : x) {
			for (int yj : y) {
				int multi = xi * yj;
				System.out.print(multi + ",");
			}
			System.out.println();
		}

	}

}
