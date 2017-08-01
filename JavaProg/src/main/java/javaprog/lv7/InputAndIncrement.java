package javaprog.lv7;

import java.util.Scanner;

public class InputAndIncrement {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.print("入力:");
			int x = keyInput.nextInt();
			if (x < 0) {
				break;
			}
			sum = sum + x;
			System.out.println("これまでの合計:" + sum);
		}

		keyInput.close();
	}

}
