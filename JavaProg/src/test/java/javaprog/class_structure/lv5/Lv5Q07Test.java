package javaprog.class_structure.lv5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Lv5Q07Test {

	@Test
	public void 不明を出力() {
		Lv5Q07.TestResult sut = new Lv5Q07.TestResult();
		sut.point = 80;
		String actual = sut.decide(-1);
		assertThat(actual, is("不明"));
	}

	@Test
	public void 不合格を出力() {
		Lv5Q07.TestResult sut = new Lv5Q07.TestResult();
		sut.point = 80;
		String actual = sut.decide(80);
		assertThat(actual, is("不合格"));
	}

	@Test
	public void 合格を出力() {
		Lv5Q07.TestResult sut = new Lv5Q07.TestResult();
		sut.point = 81;
		String actual = sut.decide(80);
		assertThat(actual, is("合格"));
	}


}