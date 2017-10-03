package javaprog.text.class_structure;

class 基本型と参照型 {

  static class Main {
    public static void main(String[] args) {
      int a = 10;
      int b = a;
      int c = 20;

      Foo f1 = new Foo();
      Foo f2 = f1;
      Foo f3 = new Foo();

      String str = "こんにちは";
      int i = str.length();
    }
  }

  static class Foo {
  }


}
