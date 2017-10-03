package javaprog.text.class_structure;

public class フィールド {

  static class Cat {
    String name;
    int age;
    String nakigoe;

    boolean isNecomata() {
      return age >= 20;
    }

    void setNakigoe(String nakigoe) {
      this.nakigoe = nakigoe;
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
