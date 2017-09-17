package javaprog.class_structure.lv5;

class Lv5Q08 {

	static class Calculator {
		int x;
		int y;

		int multiply() {
			return x * y;
		}

		float divide() {
			if (y != 0) {
				return (float) x / y;
			}
			return 0;
		}

	}
}
