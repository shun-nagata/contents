package javaprog.lv6;

public class FzBz {

	public static void main(String[] args) {
		int n = 20;
		String message = "";
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				message = "FizzBuzz";
			} else if (i % 3 == 0) {
				message = "Fizz";
			} else if (i % 5 == 0) {
				message = "Buzz";
			} else {
				message = "" + i;
			}
			System.out.println(message);
		}
	}

}
