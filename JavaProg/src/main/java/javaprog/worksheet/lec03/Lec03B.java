package javaprog.worksheet.lec03;

import java.util.Random;

public class Lec03B {

  public static void main(String[] args) {

    int[] r = new int[]{71, 54, 73, 53};

    System.out.print("並び替え前 ");
    for (int ri : r) {
      System.out.print(ri + " ");
    }

    for (int i = 0; i < r.length - 1; i++) {
      int min = r[i];
      int target = i;

      for (int j = i + 1; j < r.length; j++) {
        if (r[j] < min) {
          min = r[j];
          target = j;
        }
      }

      if (i != target) {
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
