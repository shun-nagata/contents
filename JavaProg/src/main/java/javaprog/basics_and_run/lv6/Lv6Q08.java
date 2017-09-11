package javaprog.basics_and_run.lv6;

import java.util.Scanner;

/**
 * 入力された文字が10より大きいか小さいかを表示する
 */
public class Lv6Q08 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("整数を入力：");
		int x = keyInput.nextInt();
		keyInput.close();

		if (x > 10) {
			System.out.println(x + "は10より大きい");
		} else {
			System.out.println(x + "は10以下");
		}
	}

}
