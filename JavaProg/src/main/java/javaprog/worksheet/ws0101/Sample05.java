package javaprog.worksheet.ws0101;

import java.util.Scanner;

/**
 * FizzBuzz(2,5)
 */
class Sample05 {

  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int a = key.nextInt();
    key.close();

    if (a % 10 == 0) {
      System.out.println("CIST");
    } else if (a % 2 == 0) {
      System.out.println("CI");
    } else if (a % 5 == 0) {
      System.out.println("ST");
    } else {
      System.out.println("はずれ");
    }
  }

}
