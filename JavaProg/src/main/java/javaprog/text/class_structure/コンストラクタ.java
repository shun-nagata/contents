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

  static class Main {
    public static void main(String[] args) {
      Cat cat1 = new Cat();
      System.out.println(cat1.name + ", " + cat1.age);
      Cat cat2 = new Cat("Hikari", 3);
      System.out.println(cat2.name + ", " + cat2.age);
    }
  }
}
