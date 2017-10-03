package javaprog.worksheet.lec02;

import java.util.Scanner;

class Lec02E {

  public static void main(String[] args) {
    int max = 8;
    int[] nums = new int[max];

    System.out.println("整数を" + max + "個入力してください");
    Scanner key = new Scanner(System.in);
    for (int i = 0; i < max; i++) {
      nums[i] = key.nextInt();
    }
    key.close();

    System.out.println("入力された数値は");
    for (int numi : nums) {
      String suffix = "は素数！";
      // 素数の求め方は、合っていればこれよりシンプルでもよい
      if (numi < 2 || (numi != 2 && numi % 2 == 0)) {
        suffix = "";
      } else for (int i = 2; i <= numi / 2; i++) {
        if (numi % i == 0) {
          suffix = "";
          break;
        }
      }
      System.out.println(numi + suffix);
    }

  }

}
