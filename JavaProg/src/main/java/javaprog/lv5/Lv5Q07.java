package javaprog.lv5;

/**
 * xが偶数であれば○を表示する
 */
public class Lv5Q07 {

	public static void main(String[] args) {
		int x = 6;

		if (x % 2 == 0) {
			System.out.println("○");
		} else {
			System.out.println("×");
		}

	}
}
