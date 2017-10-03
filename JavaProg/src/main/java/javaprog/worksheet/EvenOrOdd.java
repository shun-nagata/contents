package javaprog.worksheet;

import java.util.Scanner;

/**
 * 穴埋め
 */
class EvenOrOdd {

  static class Main {
    public static void main(String[] args) {
      Collector odds = new Collector();
      Collector evens = new Collector();
      while (true) {
        Scanner keyInput = new Scanner(System.in);
        int input = keyInput.nextInt();
        if (input == 0) {
          break;
        }
        if (input % 2 != 0) {
          odds.append(input);
        } else {
          evens.append(input);
        }
      }
      System.out.println("入力された奇数は：");
      odds.print();
      System.out.println("入力された偶数は：");
      evens.print();
    }
  }

  static class Collector {
    int[] nums;

    Collector() {
      nums = new int[0];
    }

    void append(int input) {
      int reSize = nums.length + 1;
      int[] tmpNums = new int[reSize];
      for (int i = 0; i < nums.length; i++) {
        tmpNums[i] = nums[i];
      }
      tmpNums[reSize - 1] = input;
      nums = tmpNums;
    }

    void print() {
      for (int i : nums) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }
}
