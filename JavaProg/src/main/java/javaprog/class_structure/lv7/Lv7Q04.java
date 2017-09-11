package javaprog.class_structure.lv7;

class Lv7Q04 {

	public static void main(String[] args) {
		Person[] persons = new Person[]{
			new Person("Taro", 19),
			new Person("Hanako", 20),
			new Person("Hikari", 12),
			new Person("Chito", 22)
		};
		Group group = new Group(persons);
		group.print();
	}

}



