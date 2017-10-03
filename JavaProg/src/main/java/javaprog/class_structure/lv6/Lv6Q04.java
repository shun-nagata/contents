package javaprog.class_structure.lv6;

/**
 * 実行結果を問う
 */
class Lv6Q04 {

  static class Main {

    public static void main(String[] args) {
      String[] strs = new String[3];
      Converter converter = new Converter();
      converter.toDo1(strs);
      converter.toDo2(strs);
      converter.toDo3(strs);

      for (String str : strs) {
        System.out.println(str);
      }
    }

  }

  static class Converter {

    void toDo1(String[] arg0) {
      String a = "Taro";
      arg0 = new String[]{a};
    }

    void toDo2(String[] arg1) {
      String b = "Hanako";
      arg1[1] = b;
    }

    void toDo3(String[] arg2) {
      String[] arg3 = arg2;
      String c = "Hikari";
      arg3[2] = c;
    }
  }

}

