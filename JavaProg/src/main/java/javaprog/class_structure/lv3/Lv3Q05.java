package javaprog.class_structure.lv3;

class Lv3Q05 {

	static class Main {
		public static void main(String[] args) {
			new Addition();
			new Multiplication();
		}
	}

	static class Addition {
		Addition() {
			int a = 5;
			int b = 4;
			System.out.println(a + b);
		}
	}

	static class Multiplication {
		Multiplication() {
			int a = 3;
			int b = 2;
			System.out.println(a * b);
		}
	}
}
