package javaprog.basics_and_run.lv7;

import java.util.Scanner;

/**
 * 整数を8回入力し、偶数と奇数に分けて表示する
 */
class Lv7Q06 {

  public static void main(String[] args) {
    int size = 8;
    int[] odd = new int[size];
    int[] even = new int[size];

    Scanner keyInput = new Scanner(System.in);

    for (int i = 0; i < size; i++) {
      System.out.print(i + "番目:");
      int inputted = keyInput.nextInt();
      if (inputted % 2 == 0) {
        even[i] = inputted;
      } else {
        odd[i] = inputted;
      }

    }
    keyInput.close();

    System.out.print("偶数は:");
    for (int eveni : even) {
      if (eveni != 0) {
        System.out.print(eveni + ",");
      }
    }
    System.out.println();
    System.out.print("奇数は:");
    for (int oddi : odd) {
      if (oddi != 0) {
        System.out.print(oddi + ",");
      }
    }
  }

}
