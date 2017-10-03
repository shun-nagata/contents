package javaprog.class_structure.lv4;

public class Lv4Q04 {

  static class Main {
    public static void main(String[] args) {
      Checker checker = new Checker();
      int age = 21;
      boolean minor = checker.isMinor(age);
      if (minor) {
        System.out.println(age + "歳は未成年");
      } else {
        System.out.println(age + "歳は成年");
      }
    }
  }

  static class Checker {
    boolean isMinor(int age) {
      return age < 20;
    }
  }

}
