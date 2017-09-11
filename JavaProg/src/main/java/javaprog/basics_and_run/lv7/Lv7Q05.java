package javaprog.basics_and_run.lv7;

import java.util.Scanner;

/**
 * 整数を入力し続け、それまでの最小値を表示する（ただし負の値を入れると終了する）
 */
public class Lv7Q05 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		int min = 0;

		while (true) {
			System.out.print("入力:");
			int x = keyInput.nextInt();
			if (x < 0) {
				break;
			}
			if (min == 0 || min > x) {
				min = x;
			}
			System.out.println("これまでの最小値:" + min);
		}
	}

}
