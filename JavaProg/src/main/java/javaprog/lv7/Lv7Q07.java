package javaprog.lv7;

import java.util.Scanner;

/**
 * 整数 max を入力し、最大幅を底辺とした三角形を * で描く
 */
public class Lv7Q07 {

	public static void main(String[] args) {
		Scanner keyInput = new Scanner(System.in);
		System.out.print("最大幅：");
		int max = keyInput.nextInt();
		keyInput.close();

		for (int xi = 0; xi < max; xi++) {
			int cursor = xi + 1;
			for (int ci = 0; ci < cursor; ci++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
