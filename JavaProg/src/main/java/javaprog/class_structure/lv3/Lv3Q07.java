package javaprog.class_structure.lv3;

class Lv3Q07 {

  static class Main {
    public static void main(String[] args) {
      new Add();
    }
  }

  static class Add {
    Add() {
      int a = 3;
      int b = 2;
      System.out.println(a + b);
    }
  }
}
