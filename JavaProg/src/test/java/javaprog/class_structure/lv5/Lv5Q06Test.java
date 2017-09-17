package javaprog.class_structure.lv5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Lv5Q06Test {

	@Test
	public void Eを出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.attendance = false;
		String actual = sut.decide();
		assertThat(actual, is("E"));
	}

	@Test
	public void Sを出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.attendance = true;
		sut.point = 91;
		String actual = sut.decide();
		assertThat(actual, is("S"));
	}

	@Test
	public void Aを出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.attendance = true;
		sut.point = 81;
		String actual = sut.decide();
		assertThat(actual, is("A"));
	}

	@Test
	public void Bを出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.attendance = true;
		sut.point = 71;
		String actual = sut.decide();
		assertThat(actual, is("B"));
	}

	@Test
	public void Cを出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.attendance = true;
		sut.point = 61;
		String actual = sut.decide();
		assertThat(actual, is("C"));
	}

	@Test
	public void Dを出力() {
		Lv5Q06.TestResult sut = new Lv5Q06.TestResult();
		sut.attendance = true;
		sut.point = 51;
		String actual = sut.decide();
		assertThat(actual, is("D"));
	}


}