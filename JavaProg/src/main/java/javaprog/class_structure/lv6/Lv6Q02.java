package javaprog.class_structure.lv6;

/**
 * 穴埋め
 */
class Lv6Q02 {

	static class Main {
		public static void main(String[] args) {
			Sum obj = new Sum(4, 8);
			System.out.println(obj.getX() + "たす"
				+ obj.gety() + "は" + obj.sum());
		}
	}

	static class Sum {
		int x;
		int y;

		Sum(int arg0, int arg1) {
			x = arg0;
			y = arg1;
		}

		public int getX() {
			return x;
		}

		public int gety() {
			return y;
		}

		public int sum() {
			return x + y;
		}
	}

}

