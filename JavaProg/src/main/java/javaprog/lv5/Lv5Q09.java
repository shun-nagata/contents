package javaprog.lv5;

import java.util.Scanner;

/**
 * 入力された文字を表示する
 */
public class Lv5Q09 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("整数を入力：");
		int x = keyInput.nextInt();
		keyInput.close();

		System.out.println("入力された値は " + x + "です");
	}

}
