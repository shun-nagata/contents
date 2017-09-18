package javaprog.class_structure.lv4;

public class Lv4Q03 {

	static class Main {
		public static void main(String[] args) {
			Checker checker = new Checker();
			int age = 18;
			boolean adult = checker.isAdult(age);
			if (adult) {
				System.out.println(age + "歳は成年");
			} else {
				System.out.println(age + "歳は未成年");
			}
		}
	}

	static class Checker {
		boolean isAdult(int age) {
			return age >= 20;
		}
	}

}
