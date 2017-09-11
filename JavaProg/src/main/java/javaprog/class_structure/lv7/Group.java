package javaprog.class_structure.lv7;

class Group {
	Person[] persons;

	Group(Person[] persons) {
		this.persons = persons;
	}

	void print() {
		for (int i = 0; i < persons.length; i++) {
			Person pi = persons[i];
			if (pi.isAdult()) {
				System.out.println(pi.name);
			}
		}
	}
}
