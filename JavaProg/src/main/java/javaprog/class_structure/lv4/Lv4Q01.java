package javaprog.class_structure.lv4;

public class Lv4Q01 {

  static class Main {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
      float ans = calc.divide(7, 0);
      System.out.println(ans);
    }
  }

  static class Calculator {
    float divide(int x, int y) {
      if (y != 0) {
        return (float) x / y;
      }
      return 0;
    }
  }

}
