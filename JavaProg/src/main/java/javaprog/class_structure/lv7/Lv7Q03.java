package javaprog.class_structure.lv7;

/**
 * flag(false)は奇数の合計を求める
 */
class Lv7Q03 {

  static class Main {
    public static void main(String[] args) {
      Separator obj = new Separator();
      obj.setFlag(false);
      System.out.println(obj.getSum());
    }
  }

  static class Separator {

    int[] array;
    boolean flag;

    Separator() {
      array = new int[]{5, 8, 10, 12, 3, 11};
    }

    void setFlag(boolean flag) {
      this.flag = flag;
    }

    int getSum() {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        int item = getItem(i);
        sum = sum + item;
      }
      return sum;
    }

    int getItem(int i) {
      boolean odd = (array[i] % 2 == 0);
      if (odd == flag) {
        return array[i];
      }
      return 0;
    }
  }

}