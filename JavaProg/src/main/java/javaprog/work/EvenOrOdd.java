package javaprog.work;

import java.util.Scanner;

/**
 * 入力された文字が偶数か奇数かを表示する
 */
class EvenOrOdd {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("整数を入力：");
		int x = keyInput.nextInt();
		keyInput.close();

		String message = "";
		if (x % 2 == 0) {
			message = x + "は偶数です";
		} else {
			message = x + "は奇数です";
		}

		System.out.println(message);
	}

}
