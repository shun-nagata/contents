package javaprog.lv6;

public class FloatAvg {

	public static void main(String[] args) {
		float[] x = {18.91f, 71.52f, 3.65f, 63.32f, 43.71f};
		float sum = 0f;
		for (float xi : x) {
			sum = sum + xi;
		}
		float ave = sum / x.length;
		System.out.println(ave);
	}

}
