package javaprog.lv6;

public class IntAvg {

	public static void main(String[] args) {
		int[] x = {18, 71, 3, 63, 43};
		int sum = 0;
		for (int xi : x) {
			sum = sum + xi;
		}
		float fsum = (float) sum;
		float ave = fsum / x.length;
		System.out.println(ave);
	}

}
