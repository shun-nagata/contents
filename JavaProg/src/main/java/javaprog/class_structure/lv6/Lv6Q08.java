package javaprog.class_structure.lv6;

import java.util.Scanner;

/**
 * 穴埋め
 */
class Lv6Q08 {

	static class Main {

		public static void main(String[] args) {
			int length = 5;
			Appender appender = new Appender(length);
			Scanner keyInput = new Scanner(System.in);
			for (int i = 0; i < length; i++) {
				int input = keyInput.nextInt();
				appender.append(i, input);
			}
			keyInput.close();
			System.out.println("入力された数は：");
			appender.print();
		}

		static class Appender {
			int[] nums;

			Appender(int length) {
				nums = new int[length];
			}

			void append(int index, int input) {
				nums[index] = input;
			}

			void print() {
				for (int item : nums) {
					System.out.print(item + " ");
				}
			}
		}
	}
}