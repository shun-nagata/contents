package javaprog.class_structure.lv5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Lv5Q07Test {

	@Test
	public void わり算() {
		Lv5Q08.Calculator sut = new Lv5Q08.Calculator();
		sut.x = 3;
		sut.y = 2;
		float actual = sut.divide();
		assertThat(actual, is(1.5f));
	}

}