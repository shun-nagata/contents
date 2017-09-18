package javaprog.class_structure.lv4;

public class Lv4Q05 {

	static class Main {
		public static void main(String[] args) {
			int[] nums = {6, 9, 3, 1};
			Calculator calc = new Calculator();
			int ans = calc.sum(nums);
			System.out.println(ans);
		}
	}

	static class Calculator {
		int sum(int[] nums) {
			int ans = 0;
			for (int num : nums) {
				ans = ans + num;
			}
			return ans;
		}
	}

}
