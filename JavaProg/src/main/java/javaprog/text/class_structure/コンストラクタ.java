package javaprog.text.class_structure;

public class コンストラクタ {

  static class Cat {
    String name;
    int age;

    Cat() {
      name = "Taro";
      age = 0;
    }

    Cat(String name, int age) {
      this.name = name;
      this.age = age;
    }

    boolean isNecomata() {
      return age >= 20;
    }

    boolean isYoungerThan(int age) {
      return this.age < age;
    }

  }
}
