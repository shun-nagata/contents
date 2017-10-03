package javaprog.class_structure.lv5;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Lv5Q04Test {

  @Test
  public void 加算() {
    Lv5Q04.Calculator sut = new Lv5Q04.Calculator();
    sut.nums = new int[]{1, 2, 3};
    sut.sum();
    int expected = 6;
    assertThat(sut.ans, is(expected));
  }

  @Test
  public void nullのとき() {
    Lv5Q04.Calculator sut = new Lv5Q04.Calculator();
    sut.sum();
    int expected = 0;
    assertThat(sut.ans, is(expected));
  }

}