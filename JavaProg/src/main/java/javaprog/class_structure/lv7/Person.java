package javaprog.class_structure.lv7;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println(name + "さんは" + getAdultMessage());
	}

	boolean isAdult() {
		return age >= 20;
	}

	String getAdultMessage() {
		if (isAdult()) {
			return "成年";
		}
		return "未成年";
	}
}