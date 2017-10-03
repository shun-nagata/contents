package javaprog.class_structure.lv4;

import java.util.Scanner;

public class Lv4Q07 {

  static class Main {
    public static void main(String[] args) {
      KeyInputter inputter = new KeyInputter();
      int num = inputter.getInput();
      System.out.println("入力値は" + num);
    }
  }

  static class KeyInputter {
    int getInput() {
      Scanner keyInput = new Scanner(System.in);
      int num = keyInput.nextInt();
      keyInput.close();
      return num;
    }
  }

}
