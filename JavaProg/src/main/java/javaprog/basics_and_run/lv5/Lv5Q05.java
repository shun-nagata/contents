package javaprog.basics_and_run.lv5;

/**
 * xが偶数であれば○を表示する
 */
public class Lv5Q05 {

  public static void main(String[] args) {
    int x = 5;

    if (x % 2 == 0) {
      System.out.println("○");
    } else {
      System.out.println("×");
    }
  }

}
