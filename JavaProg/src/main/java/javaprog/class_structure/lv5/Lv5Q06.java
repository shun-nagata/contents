package javaprog.class_structure.lv5;

class Lv5Q06 {

  static class Main {
    public static void main(String[] args) {
      TestResult result = new TestResult();
      result.name = "Taro";
      result.point = 80;
      String msg = result.decide(-80);
      System.out.println(msg);
    }
  }

  static class TestResult {
    String name;
    int point;

    String decide(int reference) {
      if (reference < 0) {
        return name + "は不明";
      }
      if (point > reference) {
        return name + "は合格";
      }
      return name + "は不合格";
    }
  }
}
