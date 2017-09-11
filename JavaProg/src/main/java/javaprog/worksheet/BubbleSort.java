package javaprog.worksheet;

import java.util.Scanner;

class BubbleSort {

	public static void main(String[] args) {
		int size = 5;
		int[] x = new int[size];
		Scanner keyInput = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			System.out.println(i + "番目:");
			x[i] = keyInput.nextInt();
		}

		keyInput.close();

		for (int i = 0; i < x.length - 1; i++) {
			for (int j = x.length - 1; j > i; j--) {
				int a = x[j];
				int b = x[j - 1];
				if (a < b) {
					x[j] = b;
					x[j - 1] = a;
				}
			}
		}

		for (int xi : x) {
			System.out.println(xi);
		}
	}

}
