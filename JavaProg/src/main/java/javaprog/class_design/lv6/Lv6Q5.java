package javaprog.class_design.lv6;

public class Lv6Q5 {

	public interface Item1 {
		public void say();
	}

	public static class Item2 implements Item1 {

		@Override
		public void say() {
			// 処理は省略
		}
	}

}
