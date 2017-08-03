package javaprog.lv5;

/**
 * ｘ,yが両方とも偶数であれば○を表示する
 */
public class Lv5Q08 {

	public static void main(String[] args) {
		int x = 10;
		int y = 6;

		if (x % 2 == 0 && y % 2 == 0) {
			System.out.println("○");
		} else {
			System.out.println("×");
		}
	}

}
