package javaprog.class_structure.lv6;

import java.util.Scanner;

/**
 * 穴埋め
 */
class Lv6Q08 {

	static class Main {

		public static void main(String[] args) {
			Appender appender = new Appender();
			Scanner keyInput = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				int input = keyInput.nextInt();
				appender.append(input);
			}
			keyInput.close();
			System.out.println("入力された数は：");
			appender.print();
		}

		static class Appender {
			int[] nums;

			Appender() {
				nums = new int[0];
			}

			void append(int input) {
				int reSize = nums.length + 1;
				int[] tmpNums = new int[reSize];
				for (int i = 0; i < nums.length; i++) {
					tmpNums[i] = nums[i];
				}
				tmpNums[reSize - 1] = input;
				nums = tmpNums;
			}

			void print() {
				for (int i : nums) {
					System.out.print(i + " ");
				}
			}
		}
	}
}