package javaprog.basics_and_run.lv5;

/**
 * 九九の計算をする
 */
public class Lv5Q03 {

	public static void main(String[] args) {
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				int ans = x * y;
				System.out.println(ans);
			}
		}
	}

}
