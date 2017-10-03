package javaprog.text.class_structure;

class メソッド {

  static class Main {
    public static void main(String[] args) {
      Keisan2 keisan = new Keisan2();

      float ans = keisan.tenths(20);
      System.out.println(ans);

      keisan.print();
    }
  }

  static class Keisan2 {

    void print() {
      int ans = square(2, 4);
      System.out.println(ans);
    }

    float tenths(int a) {
      return a / 10.0F;
    }

    int square(int a, int b) {
      return a * b;
    }

  }

  static class Keisan1 {

    戻り値の型 メソッド名(引数の型 引数1, 引数の型... 引数2) {
      // 処理
      return null;
    }

    void print() {
      System.out.println("計算クラスです");
    }

    int add() {
      return 1 + 2;
    }

    float tenths(int a) {
      return a / 10.0F;
    }

    int square(int a, int b) {
      return a * b;
    }

  }

  static class 戻り値の型 {
  }

  ;

  static class 引数の型 {
  }

  ;
}
