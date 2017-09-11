package javaprog.basics_and_run.lv7;

import java.util.Scanner;

/**
 * 入力された成績を表示する
 */
public class Lv7Q09 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);

		while (true) {
			System.out.print("得点：");
			int x = keyInput.nextInt();
			if (x < 0) {
				System.out.println("終了します");
				break;
			}
			if (x > 90) {
				System.out.println("秀");
				continue;
			}
			if (x > 80) {
				System.out.println("優");
				continue;
			}
			if (x > 70) {
				System.out.println("良");
				continue;
			}
			if (x > 60) {
				System.out.println("可");
				continue;
			}
			System.out.println("不可");
		}

		keyInput.close();
	}


}
