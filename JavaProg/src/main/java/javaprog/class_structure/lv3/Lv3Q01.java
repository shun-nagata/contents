package javaprog.class_structure.lv3;

class Lv3Q01 {

	static class Main {
		public static void main(String[] args) {
			new Printer();
		}
	}

	static class Printer {
		Printer() {
			int a = 10;
			int b = 8;
			System.out.println(a + b);
		}
	}

}
