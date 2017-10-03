package javaprog.class_structure.lv5;

class Lv5Q01 {
  static class Gakuseki {

    String bangou;

    void setBangou(String arg0) {
      String regex = "^b[0-9]{7}";
      if (!arg0.matches(regex)) {
        System.out.println("学籍番号のパターンに一致しない");
        return;
      }
      bangou = arg0;
    }
  }
}


