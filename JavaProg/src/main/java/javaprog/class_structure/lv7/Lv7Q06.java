package javaprog.class_structure.lv7;

/**
 * 参照渡し１
 * プログラムと実行結果を問う
 */
class Lv7Q06 {

  static class Main {
    public static void main(String[] args) {
      Student[] students = new Student[]{
        new Student("Taro", 80),
        new Student("Hanako", 92),
        new Student("Hikari", 79)
      };

      Grader grader = new Grader();
      for (Student student : students) {
        grader.setScore(student);
      }

      for (Student student : students) {
        student.print();
      }
    }
  }

  static class Grader {

    void setScore(Student student) {
      if (student.score > 80) {
        student.rank = "合格";
      } else {
        student.rank = "不合格";
      }
    }
  }

  static class Student {
    String name;
    int score;
    String rank;

    Student(String name, int score) {
      this.name = name;
      this.score = score;
      this.rank = "不明";
    }

    void print() {
      System.out.println(name + "は、" + rank);
    }

  }
}
