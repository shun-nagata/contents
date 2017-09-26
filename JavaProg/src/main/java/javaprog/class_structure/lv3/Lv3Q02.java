package javaprog.class_structure.lv3;

import java.util.Scanner;

class Lv3Q02 {

	static class Main {
		public static void main(String[] args) {
			new KeyInputer();
		}
	}

	static class KeyInputer {
		KeyInputer() {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			scanner.close();
			System.out.println("入力値は" + num);
		}
	}


}
