package javaprog.class_structure.lv6;

class Lv6Q01 {
	public static void main(String[] args) {
		Person p1 = new Person("Taro", 19);
		Person p2 = new Person("Hanako", 20);
		System.out.println(p1.isAdult());
		System.out.println(p2.isAdult());
	}

	static class Person {
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

}

