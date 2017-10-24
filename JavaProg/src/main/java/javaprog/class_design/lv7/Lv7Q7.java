package javaprog.class_design.lv7;

class Lv7Q7 {

  public static class Player {

    protected String role;

    public void say() {
      System.out.println("私は" + role + "です");
    }

  }

  public static class Villager extends Player {

    public Villager() {
      this.role = "村人";
    }

  }

  public static class Wolf extends Player {

    public Wolf() {
      this.role = "狼";
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
