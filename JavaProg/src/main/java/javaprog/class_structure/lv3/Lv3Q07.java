package javaprog.class_structure.lv3;

class Lv3Q07 {

	static class Main {
		public static void main(String[] args) {
			int a = 5;
			int b = 4;
			new Addition();
		}
	}

	static class Addition {
		Addition() {
			int a = 3;
			int b = 2;
			System.out.println(a + b);
		}
	}
}
