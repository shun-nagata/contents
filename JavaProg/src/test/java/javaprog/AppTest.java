package javaprog;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {

  @Test
  public void testApp() {
    assertTrue(true);
  }

  @Test
  public void hoge() {
    System.out.println("7" + 5 * (3 + 2.0));
  }

}