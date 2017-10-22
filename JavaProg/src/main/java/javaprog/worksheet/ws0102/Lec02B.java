package javaprog.worksheet.ws0102;

class Lec02B {

  public static void main(String[] args) {

    // 長さ6の32ビット整数型のa配列
    int[] a = new int[6];

    // 2.0, 2.5, 3.0, 3.5 の少数を要素とする32ビット少数のb配列
    float[] b = new float[]{2.0F, 2.5F, 3.0F, 3.5F};

    // Asa, Hiru, Yoru を要素とするc配列
    String[] c = new String[]{"Asa", "Hiru", "Yoru"};

    // c から、"Yoru"要素を取り出した文字列のd変数
    String d = c[2];

    // b の要素のうち、第1要素 と 第2要素 の足し算結果のe変数
    float e = b[1] + b[2];
  }
}
