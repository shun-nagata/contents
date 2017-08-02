package javaprog.lv7;

import java.util.Scanner;

/**
 * 正の整数を入力し続け、それれまでの合計を表示する（ただし負の値を入れると終了する）
 */
public class Lv7Q03 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.print("入力:");
			int x = keyInput.nextInt();
			if (x < 0) {
				break;
			}
			sum = sum + x;
			System.out.println("これまでの合計:" + sum);
		}

		keyInput.close();
	}

}
