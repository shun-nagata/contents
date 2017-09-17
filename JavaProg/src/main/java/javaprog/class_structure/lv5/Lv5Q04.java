package javaprog.class_structure.lv5;

class Lv5Q04 {

	static class Person {

		String name;
		int age;

		void print() {
			String msg = "";
			if (age >= 20) {
				msg = name + "さんは成年です";
			} else {
				msg = name + "さんは未成年です";
			}
			System.out.println(msg);
		}
	}
}
