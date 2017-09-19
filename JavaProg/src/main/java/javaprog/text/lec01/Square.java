package javaprog.text.lec01;

import java.util.Scanner;

class Square {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();

		System.out.println(a + "の自乗は" + a * a);
	}

}
