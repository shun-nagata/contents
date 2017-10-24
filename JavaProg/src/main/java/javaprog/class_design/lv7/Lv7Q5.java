package javaprog.class_design.lv7;

class Lv7Q5 {

  public interface Player {
    public void say();
  }

  public static class Villager implements Player {
    @Override
    public void say() {
      System.out.println("私は村人です");
    }
  }

  public static class Wolf implements Player {
    @Override
    public void say() {
      System.out.println("私は狼です");
    }
  }

  public static class App {
    public static void main(String[] args) {
      Player p = new Wolf();
      p.say();

      p = new Villager();
      p.say();

      p = new Wolf();
      p.say();
    }
  }

}
