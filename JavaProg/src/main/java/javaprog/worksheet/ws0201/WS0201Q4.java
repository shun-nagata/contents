package javaprog.worksheet.ws0201;

import java.util.Random;

class WS0201Q4 {

  static class Proc {
    Proc() {
      int a = getNum();
      System.out.println(a);
    }

    int getNum() {
      Random rand = new Random();
      int a = rand.nextInt(100);
      return a;
    }

  }

  static class APP {
    public static void main(String[] args) {
      new Proc();
    }
  }

}
