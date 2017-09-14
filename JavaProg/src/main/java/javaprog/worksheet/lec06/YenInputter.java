package javaprog.worksheet.lec06;

import java.util.Scanner;

class YenInputter {
	int getYen() {
		System.out.print("日本円：");
		Scanner keyInput = new Scanner(System.in);
		int yen = keyInput.nextInt();
		keyInput.close();
		return yen;
	}
}
