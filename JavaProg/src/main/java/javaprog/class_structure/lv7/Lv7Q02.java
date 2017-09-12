package javaprog.class_structure.lv7;

/**
 * switcher(true)は偶数の合計を求める
 */
class Lv7Q02 {

	public static void main(String[] args) {
		Separator obj = new Separator();
		obj.setSwithcer(true);
		System.out.println(obj.getSum());
	}

	static class Separator {

		int[] array;
		boolean switcher;

		Separator() {
			array = new int[]{5, 8, 10, 12, 3, 11};
		}

		void setSwithcer(boolean switcher) {
			this.switcher = switcher;
		}

		int getSum() {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				int item = getArrayItem(i);
				sum = sum + item;
			}
			return sum;
		}

		int getArrayItem(int i) {
			boolean odd = (array[i] % 2 == 0);
			if (odd == switcher) {
				return array[i];
			}
			return 0;
		}
	}

}