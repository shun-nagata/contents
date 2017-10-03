package javaprog.class_structure.lv5;

import javaprog.class_structure.lv5.Lv5Q02.Gakuseki;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

public class Lv5Q02Test {

  @Test
  public void 文字数が足りない() {
    Gakuseki sut = new Gakuseki();
    sut.setBangou("b199249");
    assertThat(sut.bangou, is(nullValue()));
  }

  @Test
  public void 文字数が多い() {
    Gakuseki sut = new Gakuseki();
    sut.setBangou("b19924900");
    assertThat(sut.bangou, is(nullValue()));
  }

  @Test
  public void 頭がbじゃない() {
    Gakuseki sut = new Gakuseki();
    sut.setBangou("m1992490");
    assertThat(sut.bangou, is(nullValue()));
  }

  @Test
  public void 正しい学籍番号() {
    String expected = "b1992490";
    Gakuseki sut = new Gakuseki();
    sut.setBangou(expected);
    assertThat(sut.bangou, is(expected));
  }

  @Test(expected = NullPointerException.class)
  public void Null対策はしていない() {
    Gakuseki sut = new Gakuseki();
    sut.setBangou(null);
  }
}
