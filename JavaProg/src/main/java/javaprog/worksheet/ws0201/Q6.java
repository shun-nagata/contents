package javaprog.worksheet.ws0201;

import javaprog.worksheet.ws0201.Q5.Keyboard;

class Q6 {

  static class Lec04B {
    public static void main(String[] args) {
      Keyboard keyboard = new Keyboard();
      int n = keyboard.getNum();

      FizzBuzzChecker checker = new FizzBuzzChecker();
      String s = checker.getMessage(n);

      StrPrinter printer = new StrPrinter();
      printer.print(s);
    }
  }

  static class FizzBuzzChecker {
    String getMessage(int a) {
      if (a % 15 == 0) {
        return "FizzBuzz";
      } else if (a % 3 == 0) {
        return "Fizz";
      } else if (a % 5 == 0) {
        return "Buzz";
      }
      return "non matching:" + a;
    }
  }

  static class StrPrinter {
    void print(String s) {
      System.out.println(s);
    }
  }

}
