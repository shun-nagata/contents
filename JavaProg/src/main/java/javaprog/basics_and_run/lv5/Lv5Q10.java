package javaprog.basics_and_run.lv5;

import java.util.Scanner;

/**
 * 入力された文字を表示する
 */
public class Lv5Q10 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("少数を入力：");
		float x = keyInput.nextFloat();
		keyInput.close();

		System.out.println("入力された値は " + x + "です");
	}

}
