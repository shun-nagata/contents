package javaprog.class_design.lv7;

public class Lv7Q01 {

  static class Player {

    private String name;
    private int vote;

    public Player(String name) {
      // 略
    }

    public void incrementVote() {
      // 略
    }

  }

  static class Villager extends Player {

    public Villager(String name) {
      super(name);
      // 略
    }

    public void poll(Player player) {
      // 略
    }

  }

}


