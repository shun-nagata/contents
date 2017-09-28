package javaprog.class_structure.lv3;

class Lv3Q08 {

	static class Main {
		public static void main(String[] args) {
			new Add();
		}
	}

	static class Add {
		Add() {
			int a = 5;
			int b = 4;
			System.out.println(a + b);
		}
	}

	static class Multi {
		Multi() {
			int a = 5;
			int b = 4;
			System.out.println(a * b);
		}
	}

}
