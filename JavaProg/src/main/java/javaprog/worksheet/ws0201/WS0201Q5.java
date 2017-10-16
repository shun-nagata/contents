package javaprog.worksheet.ws0201;

import java.util.Scanner;

class WS0201Q5 {

  static class Keyboard {
    int getNum() {
      Scanner key = new Scanner(System.in);
      int n = key.nextInt();
      key.close();
      return n;
    }
  }

  static class Printer {
    void square(int n) {
      System.out.println(n * n);
    }
  }

  static class Lec04A {
    public static void main(String[] args) {
      Keyboard keybord = new Keyboard();
      int n = keybord.getNum();

      Printer printer = new Printer();
      printer.square(n);
    }
  }

}
