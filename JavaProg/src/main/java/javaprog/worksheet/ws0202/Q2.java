package javaprog.worksheet.ws0202;

class Q2 {
  
  static class Lec05A {
    public static void main(String[] args) {
      TestResult tr1 = new TestResult();
      tr1.name = "Hikari";
      tr1.point = 81;
      String m1 = tr1.decide();

      TestResult tr2 = new TestResult();
      tr2.name = "Yuri";
      tr2.point = 80;
      String m2 = tr2.decide();

      TestResult tr3 = new TestResult();
      tr3.name = "Chitose";
      tr3.point = 79;
      String m3 = tr3.decide();

      System.out.println(m1);
      System.out.println(m2);
      System.out.println(m3);
    }
  }

  static class TestResult {
    String name;
    int point;

    String decide() {
      if (point > 80) {
        return name + "は合格";
      }
      return name + "は不合格";
    }
  }
}
