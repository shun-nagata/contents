package javaprog.class_structure.lv7;

/**
 * Personを配列に格納し、未成年であれば名前を表示する
 */
class Lv7Q05 {

	public static void main(String[] args) {
		Person[] persons = new Person[]{
			new Person("Taro", 19),
			new Person("Hanako", 20),
			new Person("Hikari", 12),
			new Person("Minato", 22)
		};
		Group group = new Group(persons);
		group.print();
	}

	static class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		boolean isAdult() {
			return age >= 20;
		}

		void printName() {
			System.out.println(name);
		}
	}

	static class Group {
		Person[] persons;

		Group(Person[] persons) {
			this.persons = persons;
		}

		void print() {
			for (Person pi : persons) {
				if (!pi.isAdult()) {
					pi.printName();
				}
			}
		}
	}

}



