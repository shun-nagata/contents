package javaprog.worksheet.lec02;

import java.util.Scanner;

class Lec02A {

  public static void main(String[] args) {

    Scanner key = new Scanner(System.in);
    int a = key.nextInt();
    key.close();

    if (a % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if (a % 3 == 0) {
      System.out.println("Fizz");
    } else if (a % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(a);
    }

  }

}
