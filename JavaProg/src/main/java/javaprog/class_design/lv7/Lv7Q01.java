package javaprog.class_design.lv7;

class Lv7Q01 {

  public class Player {

    private String name;
    private int vote;

    public Player(String name) {
      // 略
    }

    protected void addVote() {
      // 略
    }

  }

  public class Villager extends Player {

    public Villager(String name) {
      super(name);
      // 略
    }

    public void poll(Player player) {
      // 略
    }

  }

}


