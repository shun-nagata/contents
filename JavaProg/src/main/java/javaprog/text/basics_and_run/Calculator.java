package javaprog.text.basics_and_run;

class Calculator {

	public static void main(String[] args) {
		int x = 9;
		int y = 2;

		int num1 = x + y;
		int num2 = x - y;
		int num3 = x * y;
		double num4 = (double) x / y;
		int num5 = x % y;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		boolean bool1 = x != y;
		boolean bool2 = x >= y;
		boolean bool3 = x > y;
		boolean bool4 = x < y;
		boolean bool5 = x <= y;

		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		System.out.println(bool5);
	}

}
