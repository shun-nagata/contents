package javaprog.class_structure.lv6;

/**
 * 実行結果を問う
 */
class Lv6Q03 {

  static class Main {

    public static void main(String[] args) {
      Person person = new Person("unknown");

      Converter converter = new Converter();

      converter.toDo1(person);
      person.print();

      converter.toDo2(person);
      person.print();

      converter.toDo3(person);
      person.print();
    }

  }

  static class Converter {

    void toDo1(Person arg0) {
      arg0.setName("taro");
    }

    void toDo2(Person arg0) {
      arg0.name = "hanako";
    }

    void toDo3(Person arg0) {
      arg0 = new Person("hikari");
    }
  }

  static class Person {

    String name;

    Person(String arg0) {
      name = arg0;

    }

    void setName(String arg0) {
      name = arg0;
    }

    void print() {
      System.out.println(name);
    }
  }

}

