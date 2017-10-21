package javaprog.class_design.lv7;

public class Lv7Q6 {

  public class Player {
    protected String role;

    public void say() {
      System.out.println("私は" + role +"です");
    }
  }

  public class Villager extends Player {
    public Villager() {
      this.role = "村人";
    }
  }

  public class Wolf extends Player {
    public Wolf() {
      this.role = "狼";
    }
  }

  public void atNight() {
    Player p = new Wolf();
    p.say();

    p = new Villager();
    p.say();

    p = new Wolf();
    p.say();
  }

}
