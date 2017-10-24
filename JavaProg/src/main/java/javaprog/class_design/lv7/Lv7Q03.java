package javaprog.class_design.lv7;

class Lv7Q03 {

  public interface Player {
    public void poll(Player player);
  }

  public class Villager implements Player {

    private String name;
    protected int vote;

    public Villager(String name) {
      // 略
    }

    @Override
    public void poll(Player player) {
      // 略
    }
  }
}
