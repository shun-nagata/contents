package javaprog.text.lec01;

class Conditional {

	public static void main(String[] args) {
		boolean 判定式 = true;
		boolean 判定式1 = true;
		boolean 判定式2 = true;

		if (判定式) {
			System.out.println("判定式がtrueの時の処理");
		} else {
			System.out.println("判定式がfalseの時の処理");
		}

		if (判定式1) {
			System.out.println("判定式1がtrueの時の処理");
		} else if (判定式2) {
			System.out.println("判定式1がfalse, 判定式2がtrueの時の処理");
		} else {
			System.out.println("判定式1,2がfalseの時の処理");
		}

	}


}
