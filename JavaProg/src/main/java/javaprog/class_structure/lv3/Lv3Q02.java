package javaprog.class_structure.lv3;

import java.util.Scanner;

class Lv3Q02 {

	static class Main {
		public static void main(String[] args) {
			new Inputter();
		}
	}

	static class Inputter {
		Inputter() {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			scanner.close();
			System.out.println("Ans:" + num * num);
		}
	}

}
