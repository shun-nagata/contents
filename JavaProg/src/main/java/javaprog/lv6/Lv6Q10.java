package javaprog.lv6;

import java.util.Scanner;

/**
 * 整数 x と y を入力し、縦をx、横をyとして*でできた四角形を表示する
 */
public class Lv6Q10 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("xの値は：");
		int x = keyInput.nextInt();
		System.out.print("yの値は：");
		int y = keyInput.nextInt();
		keyInput.close();

		for (int xi = 0; xi < x; xi++) {
			for (int yi = 0; yi < y; yi++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
