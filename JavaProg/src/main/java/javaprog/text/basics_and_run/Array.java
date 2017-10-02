package javaprog.text.basics_and_run;

class Array {

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4};
		int[] nums2 = new int[]{5, 6, 7, 8};

		for (int i = 0; i < nums1.length; i++) {
			int item = nums1[1];
			System.out.println(item);
		}

		for (int item : nums2) {
			System.out.println(item);
		}

	}
}
