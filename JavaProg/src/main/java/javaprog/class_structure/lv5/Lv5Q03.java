package javaprog.class_structure.lv5;

class Lv5Q03 {

	static class Person {

		String name;
		int age;

		void print() {
			String msg = "";
			if (isYoung()) {
				msg = name + "さんは未成年です";
			} else {
				msg = name + "さんは成年です";
			}
			System.out.println(msg);
		}

		boolean isYoung() {
			return age < 20;
		}
	}
}
