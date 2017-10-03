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
      cat.age = 3;

      System.out.println(cat.name + "は");
      if (cat.isNecomata()) {
        System.out.println("猫又");
      }
      if (cat.isYoungerThan(5)) {
        System.out.println("若い猫です");
      }
    }

  }

}
