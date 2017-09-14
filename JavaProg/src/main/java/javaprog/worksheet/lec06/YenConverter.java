package javaprog.worksheet.lec06;

class YenConverter {
	public static void main(String[] args) {
		YenInputter inputter = new YenInputter();
		YenExchanger exchanger = new YenExchanger();
		while (true) {
			int yen = inputter.getYen();
			if (yen < 0) {
				System.out.println("終了します");
				break;
			}
			exchanger.print(yen);
		}
	}
}
