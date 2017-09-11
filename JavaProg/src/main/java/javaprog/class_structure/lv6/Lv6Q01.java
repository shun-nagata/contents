package javaprog.class_structure.lv6;

class Lv6Q01 {
	public static void main(String[] args) {
		Person p1 = new Person("Taro", 19);
		Person p2 = new Person("Hanako", 20);
		System.out.println(p1.isAdult());
		System.out.println(p2.isAdult());
	}
}

