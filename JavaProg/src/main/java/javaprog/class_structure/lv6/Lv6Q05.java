package javaprog.class_structure.lv6;

/**
 * 実行結果を選択肢で問う
 * <p>
 * - コンパイルできないため、実行できない
 * - 実行するとエラーが発生する
 * - HelloとGood byeとThank youが1行ずつ表示される
 * - HelloとGood byeとThank youが1行にまとめて表示される
 * - ["Hello", "Good bye", Thank "you"] と表示される
 * - strs変数が参照するインスタンスのハッシュコードが表示される
 * - 何も表示されない
 */
class Lv6Q05 {

	static class Main {
		public static void main(String[] args) {
			String[] strs = {"Hello", "Good Bye", "Thank you"};
			Printer printer = new Printer();
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
				System.out.println(str);
			}
		}
	}
}
