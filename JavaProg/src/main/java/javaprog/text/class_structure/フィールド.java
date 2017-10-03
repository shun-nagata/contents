package javaprog.text.class_structure;

public class フィールド {

  static class Cat {
    String name;
    int age;

    boolean isNecomata() {
      return age >= 20;
    }

    boolean isYoungerThan(int age) {
      return this.age < age;
    }

  }

  static class Main {

    public static void main(String[] args) {
      Cat cat = new Cat();
      cat.name = "Hikari";
      cat.age = 14;
    }

  }

}
