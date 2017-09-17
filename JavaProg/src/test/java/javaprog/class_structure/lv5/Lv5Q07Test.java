package javaprog.class_structure.lv5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Lv5Q07Test {

	@Test
	public void Q7() {
		Lv5Q07.Calculator sut = new Lv5Q07.Calculator();
		sut.x = 5;
		sut.y = 2;
		float actual = sut.divide();
		assertThat(actual, is(2.5f));
	}

	@Test
	public void Q8() {
		Lv5Q08.Calculator sut = new Lv5Q08.Calculator();
		sut.x = 8;
		sut.y = 0;
		float actual = sut.divide();
		assertThat(actual, is(0.0F));
	}

}