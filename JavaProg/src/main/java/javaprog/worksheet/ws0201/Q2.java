package javaprog.worksheet.ws0201;

import java.util.Random;

class Q2 {

  static class Proc {
    Proc() {
      Random rand = new Random();
      int a = rand.nextInt(100);

      System.out.println(a);
    }
  }

  static class APP {
    public static void main(String[] args) {
      new Proc();
    }
  }

}
