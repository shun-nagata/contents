package javaprog.text.class_structure;

import java.util.Scanner;

class New {

  static class Proc {
    Proc() {
      Scanner key = new Scanner(System.in);
      int age = key.nextInt();
      key.close();

      if (age < 20) {
        System.out.println("未成年");
      } else {
        System.out.println("成年");
      }
    }
  }

  static class APP {
    public static void main(String[] args) {
      new Proc();
    }
  }

}
