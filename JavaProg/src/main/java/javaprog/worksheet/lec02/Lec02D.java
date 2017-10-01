package javaprog.worksheet.lec02;

import java.util.Scanner;

class Lec02D {

	public static void main(String[] args) {
		int max = 8;
		int[] nums = new int[max];

		System.out.println("整数を" + max + "個入力してください");
		Scanner key = new Scanner(System.in);
		for (int i = 0; i < max; i++) {
			nums[i] = key.nextInt();
		}
		key.close();

		System.out.println("入力された数値は");
		for (int numi : nums) {
			System.out.println(numi);
		}

	}

}
