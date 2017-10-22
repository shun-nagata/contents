package javaprog.worksheet.ws0203;

class YenConverter {
  public static void main(String[] args) {
    System.out.print("入力された金額を変換します：");
    Keyboard inputter = new Keyboard();
    int yen = inputter.getNum();
    if (yen < 0) {
      System.out.println("0以上を入れて下さい");
    }
    Exchanger exchanger = new Exchanger();
    exchanger.print(yen);
  }
}
