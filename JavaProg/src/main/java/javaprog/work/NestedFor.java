package javaprog.work;

/**
 * 1÷1, 1÷2 ... 1÷9, 2÷1, 2÷2, ... 9÷9の計算をする
 */
class NestedFor {

	public static void main(String[] args) {
		for (float x = 1; x <= 9; x++) {
			for (float y = 1; y <= 9; y++) {
				float ans = x / y;
				System.out.println(ans);
			}
		}
	}

}
