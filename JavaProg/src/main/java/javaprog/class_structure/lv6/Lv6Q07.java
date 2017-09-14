package javaprog.class_structure.lv6;

/**
 * 穴埋め
 */
class Lv6Q07 {

	static class Main {
		public static void main(String[] args) {
			String[] strs = {"Hello", "Good bye", "Thank you"};
			Printer printer = new Printer(strs);
			printer.print();
		}
	}

	static class Printer {
		String[] strs;

		Printer() {
			strs = null;
		}

		Printer(String[] arg0) {
			this.strs = arg0;
		}

		void print() {
			for (String str : strs) {
				int num = str.length();
				System.out.println(num);
			}
		}
	}
}
