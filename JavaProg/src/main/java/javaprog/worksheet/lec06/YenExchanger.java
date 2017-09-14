package javaprog.worksheet.lec06;

class YenExchanger {
	Rate[] rates;

	public YenExchanger() {
		rates = new Rate[]{
			new Rate("US", 0.0090f, "ドル"),
			new Rate("EUR", 0.0076f, "ユーロ"),
			new Rate("ARS", 0.1586f, "ペソ")
		};
	}

	void print(int yen) {
		for (Rate rate : rates) {
			System.out.println(rate.exchange(yen));
		}
	}
}
