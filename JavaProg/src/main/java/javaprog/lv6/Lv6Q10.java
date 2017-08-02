package javaprog.lv6;

import java.util.Scanner;

/**
 * 少数 x と y を入力し、x÷1~ｘ÷y を求める
 */
public class Lv6Q10 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);

		System.out.print("xの値は：");
		float x = keyInput.nextFloat();

		System.out.print("yの値は：");
		float y = keyInput.nextFloat();

		keyInput.close();

		for (int i = 1; i <= y; i++) {
			float ans = x / i;
			System.out.println(x + "÷" + i + "は：" + ans);
		}

	}

}
