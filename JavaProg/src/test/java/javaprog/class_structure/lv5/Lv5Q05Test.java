package javaprog.class_structure.lv5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Lv5Q05Test {

	@Test
	public void 不明を出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.name = "Taro";
		sut.point = 80;
		String actual = sut.decide(-1);
		assertThat(actual, is("Taroは不明"));
	}

	@Test
	public void 不合格を出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.name = "Taro";
		sut.point = 80;
		String actual = sut.decide(80);
		assertThat(actual, is("Taroは不合格"));
	}

	@Test
	public void 合格を出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.name = "Taro";
		sut.point = 81;
		String actual = sut.decide(80);
		assertThat(actual, is("Taroは合格"));
	}


}