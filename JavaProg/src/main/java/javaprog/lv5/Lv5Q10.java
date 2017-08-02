package javaprog.lv5;

import java.util.Scanner;

/**
 * 入力された文字が偶数か奇数かを表示する
 */
public class Lv5Q10 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		int x = keyInput.nextInt();
		keyInput.close();

		if (x % 2 == 0) {
			System.out.println(x + "は偶数");
		}
	}

}
