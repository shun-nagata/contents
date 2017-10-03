package javaprog.class_structure.lv4;

public class Lv4Q06 {

  static class Main {
    public static void main(String[] args) {
      int[] nums = {8, 2, 4, 6, 9};
      Calculator calc = new Calculator();
      calc.print(nums);
    }
  }

  static class Calculator {
    int sum(int[] nums) {
      int ans = 0;
      for (int num : nums) {
        ans = ans + num;
      }
      return ans;
    }

    void print(int[] nums) {
      int ans = sum(nums);
      System.out.println(ans);
    }
  }

}
