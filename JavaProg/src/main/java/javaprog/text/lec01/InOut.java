package javaprog.text.lec01;

import java.util.Scanner;

class InOut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();

		System.out.println(a);
	}

}
