package javaprog.class_design.lv7;

public class Lv7Q5 {

  public interface Player {
    public void say();
  }

  public class Villager implements Player {
    @Override
    public void say() {
      System.out.println("私は村人です");
    }
  }

  public class Wolf implements Player {
    @Override
    public void say() {
      System.out.println("私は狼です");
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
