package javaprog.worksheet.ws0202;

import java.util.Scanner;

public class Q3 {

  static class Rate {
    String country;
    float value;
    String unit;

    String exchange(int yen) {
      float money = yen * value;
      return country + "：" + money + unit;
    }
  }

  static class Keyboard {
    int getNum() {
      Scanner key = new Scanner(System.in);
      int n = key.nextInt();
      key.close();
      return n;
    }
  }

  static class Lec05B {
    public static void main(String[] args) {
      System.out.print("入力された金額を変換します：");
      Keyboard keyboard = new Keyboard();
      int n = keyboard.getNum();

      Rate r1 = new Rate();
      r1.country = "US";
      r1.value = 0.0090f;
      r1.unit = "ドル";
      String m1 = r1.exchange(n);

      Rate r2 = new Rate();
      r2.country = "ARS";
      r2.value = 0.1586f;
      r2.unit = "ペソ";
      String m2 = r2.exchange(n);

      System.out.println(m1);
      System.out.println(m2);
    }
  }



}
