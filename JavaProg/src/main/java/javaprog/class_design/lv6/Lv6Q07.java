package javaprog.class_design.lv6;

public class Lv6Q07 {

	public static class Item1 {
		protected String name;
		public void say() {
			System.out.println("My name is " + name);
		}
	}

	public static class Item2 extends Item1 {

		public void call() {
			name = "Hikari";
			say();
		}
	}
}
