package javaprog.worksheet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Comparator.naturalOrder;

class Sorting {

  static class Keyboard {
    Scanner s;

    Keyboard() {
      s = new Scanner(System.in);
    }

    int scanNum() {
      return s.nextInt();
    }

    void close() {
      s.close();
    }
  }

  static class Hoge {

    public static void main(String[] args) throws IOException {
        Hoge hoge = new Hoge();

      InputStream is = System.in;

      Scanner s1 = new Scanner(System.in);
      int i1 = s1.nextInt();
      System.out.println(i1);
      s1.close();

      Scanner s2 = new Scanner(System.in);
      int i2 = s2.nextInt();
      System.out.println(i2);
      s2.close();

    }


    void hoge() {
      Scanner s = new Scanner(System.in);
      System.out.println(s.nextInt());
      s.close();
    }
  }

  public static void main(String[] args) {
    int max = 8;
    int[] r = new int[max];

    Random rand = new Random();
    for (int i = 0; i < max; i++) {
      r[i] = rand.nextInt(100);
    }

    System.out.print("並び替え前:");
    Arrays.stream(r)
      .boxed()
      .map(i -> i + " ")
      .forEach(System.out::print);

    System.out.print("\n並び替え後:");
    Arrays.stream(r)
      .boxed()
      .sorted(naturalOrder())
      .map(i -> i + " ")
      .forEach(System.out::print);
  }
}
