package javaprog.class_structure.lv7;

/**
 * TaroとHanakoが成年かどうかを判定する
 */
class Lv7Q01 {
	public static void main(String[] args) {
		Person p1 = new Person("Taro", 19);
		Person p2 = new Person("Hanako", 20);
		p1.print();
		p2.print();
	}

	static class Person {
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

}