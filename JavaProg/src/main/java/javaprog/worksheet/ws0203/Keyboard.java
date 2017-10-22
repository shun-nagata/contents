package javaprog.worksheet.ws0203;

import java.util.Scanner;

class Keyboard {

  int getNum() {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    return n;
  }

}
