package javaprog.worksheet;

import java.util.Scanner;

class Diamond {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("最大幅（奇数）:");
		int max = keyInput.nextInt();
		keyInput.close();

		int padding = 0;
		int center = max / 2;
		int cursor = center;

		for (int xi = 0; xi <= max; xi++) {
			if (xi <= center) {
				padding = center - xi;
				cursor = cursor + 1;
			} else {
				padding = xi - center;
				cursor = cursor - 1;
			}

			for (int c1 = 0; c1 < cursor; c1++) {
				if (c1 < padding) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
