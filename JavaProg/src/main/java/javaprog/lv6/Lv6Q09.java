package javaprog.lv6;

import java.util.Scanner;

/**
 * 整数 x と y を入力し、x×1~ｘ×yまでを求める
 */
public class Lv6Q09 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);

		System.out.print("xの値は：");
		int x = keyInput.nextInt();

		System.out.print("yの値は：");
		int y = keyInput.nextInt();

		keyInput.close();

		for (int i = 1; i <= y; i++) {
			long ans = x * i;
			System.out.println(x + "×" + i + "は：" + ans);
		}

	}

}
