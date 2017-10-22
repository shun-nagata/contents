package javaprog.worksheet.ws0103;

import java.util.Random;

class Lec03A {

  public static void main(String[] args) {
    int max = 8;
    int[] r = new int[max];

    // 0〜99の乱数をrに代入する
    Random rand = new Random();
    for (int i = 0; i < max; i++) {
      r[i] = rand.nextInt(100);
    }

    int min = r[0];
    for (int j = 1; j < max; j++) {
      if (r[j] < min) {
        min = r[j];
      }
    }

    System.out.print("配列の要素は ");
    for (int ri : r) {
      System.out.print(ri + " ");
    }
    System.out.println("\n最小値は " + min);
  }

}
