package javaprog.lv7;

import java.util.Scanner;

public class InputAndSum {

	public static void main(String[] args) {
		int size = 5;
		int[] x = new int[size];
		Scanner keyInput = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			System.out.print(i + "番目:");
			x[i] = keyInput.nextInt();
		}

		keyInput.close();

		int sum = 0;
		for (int xi : x) {
			sum = sum + xi;
		}
		System.out.println("合計は" + sum);
	}

}
