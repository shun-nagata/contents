package javaprog.class_structure.lv5;

class Lv5Q07 {

  static class Main {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
      calc.x = 5;
      calc.y = 2;
      float ans = calc.divide();
      System.out.println(ans);
    }
  }

  static class Calculator {
    int x;
    int y;

    float divide() {
      if (y != 0) {
        return (float) x / y;
      }
      return 0.0F;
    }
  }
}
