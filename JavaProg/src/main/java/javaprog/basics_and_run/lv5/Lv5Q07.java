package javaprog.basics_and_run.lv5;

/**
 * ｘ,yのいずれかが偶数であれば○を表示する
 */
public class Lv5Q07 {

	public static void main(String[] args) {
		int x = 5;
		int y = 6;

		if (x % 2 == 0 || y % 2 == 0) {
			System.out.println("○");
		} else {
			System.out.println("×");
		}
	}

}
