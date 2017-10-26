package javaprog.class_design.lv5;

class Lv5Q07 {

  public static class Club {

    private Member[] members;

    public Club() {
      members = new Member[30];
    }

    public void join(Member member) {
      // 処理は省略している
    }
  }

  public static class Member {

    private String gakuseki;

    public Member(String gakuseki) {
      this.gakuseki = gakuseki;
    }

    public String getGakuseki() {
      return gakuseki;
    }
  }

}
