package javaprog.worksheet;

public class Impl {

  public interface Player {
    public String getName();
  }

  public class Villager implements Player {
    private String name;

    public Villager(String name) {
      this.name = name;
    }

    @Override
    public String getName() {
      return name;
    }
  }

  public class Wolf implements Player {
    private String name;

    public Wolf(String name) {
      this.name = name;
    }

    @Override
    public String getName() {
      return name;
    }

    public void bite(Player player) {
      System.out.println(name + "が"
        + player.getName() + "を噛みました");
    }
  }

  public void atNight() {
    Wolf p1 = new Wolf("Hikari");
    Villager p2 = new Villager("Chitose");
    Wolf p3 = new Wolf("Yuri");
    p1.bite(p2);
    p3.bite(p1);
  }

}
