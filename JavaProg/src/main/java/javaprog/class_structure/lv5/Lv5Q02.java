package javaprog.class_structure.lv5;

class Lv5Q02 {
	static class Gakuseki {

		String bangou;

		void setBangou(String arg0) {
			int length = arg0.length();
			if (length != 8) {
				System.out.println("文字数が一致しない");
				return;
			}
			boolean flag = arg0.startsWith("b");
			if (!flag) {
				System.out.println("bから始まっていない");
				return;
			}
			bangou = arg0;
		}
	}
}


