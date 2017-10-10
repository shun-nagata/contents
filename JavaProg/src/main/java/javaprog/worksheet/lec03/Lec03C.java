package javaprog.worksheet.lec03;

import java.util.Random;

public class Lec03C {

  public static void main(String[] args) {
    int max = 8;
    int[] r = new int[max];

    Random rand = new Random();
    for (int i = 0; i < max; i++) {
      r[i] = rand.nextInt(100);
    }

    System.out.print("並び替え前 ");
    for (int ri : r) {
      System.out.print(ri + " ");
    }

    for (int i = 0; i < max - 1; i++) {
      int min = r[i];
      int target = i;

      for (int j = i + 1; j < r.length; j++) {
        if (r[j] < min) {
          min = r[j];
          target = j;
        }
      }

      if(i != target) {
        int tmp = r[i];
        r[i] = r[target];
        r[target] = tmp;
      }
    }

    System.out.print("\n並び替え後 ");
    for (int ri : r) {
      System.out.print(ri + " ");
    }
  }
}
