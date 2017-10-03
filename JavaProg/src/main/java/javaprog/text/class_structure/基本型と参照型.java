package javaprog.text.class_structure;

public class 基本型と参照型 {

	static class Main {
		public static void main(String[] args) {
			int a = 10;
			int b = 20;
			int c = a;

			Foo f1 = new Foo();
			Foo f2 = new Foo();
			Foo f3 = f1;
		}
	}

	static class Foo {}


}
