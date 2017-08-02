package javaprog.lv7;

import java.util.Scanner;

/**
 * 少数を5回入力し、その平均値を求める
 */
public class Lv7Q02 {

	public static void main(String[] args) {
		int size = 5;
		float[] x = new float[size];

		Scanner keyInput = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			System.out.print(i + "番目:");
			x[i] = keyInput.nextFloat();
		}

		keyInput.close();

		float total = 0;
		for (float xi : x) {
			total = total + xi;
		}

		float avg = total / x.length;

		System.out.println("平均は" + avg);
	}

}
