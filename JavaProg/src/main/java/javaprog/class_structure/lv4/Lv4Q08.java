package javaprog.class_structure.lv4;

import java.util.Scanner;

public class Lv4Q08 {

  static class Main {
    public static void main(String[] args) {
      DefaultIO io = new DefaultIO();
      io.print();
    }
  }

  static class DefaultIO {
    int getNum() {
      Scanner keyInput = new Scanner(System.in);
      int num = keyInput.nextInt();
      keyInput.close();
      return num;
    }

    void print() {
      int ans = getNum();
      System.out.println("入力値は" + ans);
    }
  }

}
