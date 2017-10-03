package javaprog.class_structure.lv3;

class Lv3Q04 {

  static class Main {
    public static void main(String[] args) {
      new ClassA();
      new ClassB();
    }
  }

  static class ClassA {
    ClassA() {
      System.out.println("Aをインスタンス化");
    }
  }

  static class ClassB {
    ClassB() {
      System.out.println("Bをインスタンス化");
    }
  }

}
