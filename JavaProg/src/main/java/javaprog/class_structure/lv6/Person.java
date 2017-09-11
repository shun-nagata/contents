package javaprog.class_structure.lv6;

class Person {
	String name;
	int age;

	Person(String arg0, int arg1) {
		name = arg0;
		age = arg1;
	}

	String isAdult() {
		if (age < 20) {
			return name + "さんは未成年";
		} else {
			return name + "さんは未年";
		}
	}
}
