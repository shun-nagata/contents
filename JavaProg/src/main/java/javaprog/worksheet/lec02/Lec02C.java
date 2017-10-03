package javaprog.worksheet.lec02;

class Lec02C {

  public static void main(String[] args) {
    float[] b = new float[]{2.0F, 2.5F, 3.0F, 3.5F};

    float ans = 0.0F;
    for (float bi : b) {
      ans = ans + bi;
    }

    System.out.println("Ans:" + ans);
  }

}
