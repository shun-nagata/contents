package javaprog.class_structure.lv5;

class Lv5Q04 {

	static class Calculator {

		int[] nums;
		int ans;

		void sum() {
			ans = 0;
			if (isNotNull()) {
				for (int i : nums) {
					ans = ans + i;
				}
			}
		}

		boolean isNotNull() {
			return nums != null;
		}

	}
}
