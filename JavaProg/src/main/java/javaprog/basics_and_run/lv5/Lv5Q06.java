package javaprog.basics_and_run.lv5;

/**
 * x が80以上であれば良、60以上であれば可、それ以外は不可と表示する
 */
public class Lv5Q06 {

  public static void main(String[] args) {
    int x = 70;

    if (x >= 80) {
      System.out.println("良");
    } else if (x >= 60) {
      System.out.println("可");
    } else {
      System.out.println("不可");
    }
  }

}
