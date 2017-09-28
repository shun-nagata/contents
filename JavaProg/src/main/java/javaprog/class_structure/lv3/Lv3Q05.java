package javaprog.class_structure.lv3;

class Lv3Q05 {

	static class Main {
		public static void main(String[] args) {
			new Add();
			new Multi();
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
			int a = 3;
			int b = 2;
			System.out.println(a * b);
		}
	}

}
