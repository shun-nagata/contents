package javaprog.class_structure.lv5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Lv5Q03Test {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void 未成年() {
		Lv5Q03.Person sut = new Lv5Q03.Person();
		sut.name = "Hikari";
		sut.age = 19;
		sut.print();
		assertThat(systemOutRule.getLog(), is("Hikariさんは未成年です\n"));
	}

	@Test
	public void 成年() {
		Lv5Q03.Person sut = new Lv5Q03.Person();
		sut.name = "Hikari";
		sut.age = 20;
		sut.print();
		assertThat(systemOutRule.getLog(), is("Hikariさんは成年です\n"));
	}

}