package javaprog.basics_and_run.lv5;

/**
 * xが奇数であれば○を表示する
 */
class Lv5Q04 {

  public static void main(String[] args) {
    int x = 5;

    if (x % 2 != 0) {
      System.out.println("○");
    } else {
      System.out.println("×");
    }
  }

}
