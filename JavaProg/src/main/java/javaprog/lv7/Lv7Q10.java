package javaprog.lv7;

import java.util.Scanner;

/**
 * 各国お金換算
 */
public class Lv7Q10 {

	public static void main(String[] args) {
		String[] countries = {"US", "EUR", "ARS"};
		float[] rates = {0.0090f, 0.0076f, 0.1586f};
		String[] units = {"ドル", "ユーロ", "ペソ"};

		Scanner keyInput = new Scanner(System.in);

		while (true) {
			System.out.print("日本円：");
			int yen = keyInput.nextInt();
			if (yen < 0) {
				System.out.println("終了します");
				break;
			}
			for (int i = 0; i < countries.length; i++) {
				float money = yen * rates[i];
				System.out.println(countries[i] + "：" + money + units[i]);
			}
		}

		keyInput.close();
	}

}
