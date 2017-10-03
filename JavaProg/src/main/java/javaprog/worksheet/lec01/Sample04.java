package javaprog.worksheet.lec01;

import java.util.Scanner;

class Sample04 {

  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int a = key.nextInt();
    key.close();

    if (a < 20) {
      System.out.println(a + "歳は未成年");
    } else {
      System.out.println(a + "歳は成年");
    }
  }

}
