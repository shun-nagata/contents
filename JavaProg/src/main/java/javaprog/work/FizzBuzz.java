package javaprog.work;

import java.util.Scanner;

/**
 * 1~50の数字の中で、3の倍数の時にFizz, 5の倍数の時はBuzz、
 * 3の倍数であり5の倍数でもあるときはFizzBuzzと表示する
 */
class FizzBuzz {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("最大幅：");
		int max = keyInput.nextInt();
		keyInput.close();

		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
