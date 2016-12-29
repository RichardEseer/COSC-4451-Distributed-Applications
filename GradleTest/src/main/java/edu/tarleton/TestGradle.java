package edu.tarleton;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;

public class TestGradle {

	public static void main(String[] args) {
		out.println("Hello Gradle!");
		Person person = new Person("Larry");
		out.println("Results: ");
		assertEquals("Larry", person.getName());
		assertEquals("Lary", person.getName());
	}

}
