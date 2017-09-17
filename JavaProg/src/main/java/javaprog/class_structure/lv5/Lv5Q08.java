package javaprog.class_structure.lv5;

class Lv5Q08 {

	static class Main {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			calc.x = 8;
			calc.y = 0;
			float ans = calc.divide();
			System.out.println(ans);
		}
	}

	static class Calculator {
		int x;
		int y;

		float divide() {
			if (y != 0) {
				return (float) x / y;
			}
			return 0;
		}
	}
}
