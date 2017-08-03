package javaprog.work;

/**
 * 1~50の数字の中で、3の倍数の時にFizz, 5の倍数の時はBuzz、
 * 3の倍数であり5の倍数でもあるときはFizzBuzzと表示する
 */
public class FizzBuzz {

	public static void main(String[] args) {
		int n = 50;
		String message = "";

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
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
