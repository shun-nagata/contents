package javaprog.basics_and_run.lv7;

import java.util.Scanner;

/**
 * 整数を5回入力し、その合計値を求める
 */
public class Lv7Q01 {

  public static void main(String[] args) {
    int counter = 5;
    int[] x = new int[counter];

    Scanner keyInput = new Scanner(System.in);

    for (int i = 0; i < counter; i++) {
      System.out.print(i + "番目:");
      x[i] = keyInput.nextInt();
    }

    keyInput.close();

    int total = 0;
    for (int xi : x) {
      total = total + xi;
    }

    System.out.println("合計は" + total);
  }

}
