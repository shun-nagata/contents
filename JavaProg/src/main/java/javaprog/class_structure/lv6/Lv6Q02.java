package javaprog.class_structure.lv6;

/**
 * 穴埋め
 */
class Lv6Q02 {

	static class Main {
		public static void main(String[] args) {
			Sum obj = new Sum(4, 8);
			System.out.println(obj.getX() + "たす"
				+ obj.getY() + "は" + obj.sum());
		}
	}

	static class Sum {
		int x;
		int y;

		Sum(int arg0, int arg1) {
			x = arg0;
			y = arg1;
		}

		int getX() {
			return x;
		}

		int getY() {
			return y;
		}

		int sum() {
			return x + y;
		}
	}

}

