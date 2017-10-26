package javaprog.class_design.lv5;

class Lv5Q08 {

  public static class YosakoiClub {

    private Leader leader;
    private Member[] members;

    public YosakoiClub() {
      leader = null;
      members = new Member[30];
    }

    public void join(Leader member) {
      // 処理は省略している
    }

    public void join(Member member) {
      // 処理は省略している
    }
  }

  public static class Member {

  }

  public static class Leader {

  }

}
