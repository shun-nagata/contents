package javaprog.basics_and_run.lv7;

import java.util.Scanner;

/**
 * 整数を入力し続け、それまでの最大値を表示する（ただし負の値を入れると終了する）
 */
class Lv7Q04 {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    int max = 0;

    while (true) {
      System.out.print("入力:");
      int x = keyInput.nextInt();
      if (x < 0) {
        break;
      }
      if (max == 0 || max < x) {
        max = x;
      }
      System.out.println("これまでの最大値:" + max);
    }
  }

}
