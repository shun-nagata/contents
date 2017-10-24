package javaprog.worksheet;

public class SubClass {

  public class Player {
    protected String name;
    public String getName() {
      return name;
    }
  }

  public class Villager extends Player {
    public Villager(String name) {
      this.name = name;
    }
  }

  public class Wolf extends Player {
    public Wolf(String name) {
      this.name = name;
    }

    public void bite(Player player) {
      System.out.println(name + "が"
        + player.getName() + "を噛みました");
    }
  }

  public void atNight() {
    Wolf p1 = new Wolf("Hikari");
    Villager p2 = new Villager("Chitose");
    Wolf p3 = new Wolf("Hikari");
    p1.bite(p2);
    p3.bite(p2);
  }

}
