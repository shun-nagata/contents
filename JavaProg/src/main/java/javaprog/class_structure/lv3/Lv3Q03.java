package javaprog.class_structure.lv3;

class Lv3Q03 {

	static class Main {
		public static void main(String[] args) {
			new ClassB();
			new ClassA();
		}
	}

	static class ClassA {
		ClassA() {
			System.out.println("Aをインスタンス化");
		}

	}
	static class ClassB {
		ClassB() {
			System.out.println("Bをインスタンス化");
		}
	}
}
