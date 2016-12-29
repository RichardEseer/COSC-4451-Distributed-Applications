

import static org.junit.Assert.assertEquals;
import static java.lang.System.out;
import org.junit.Test;

import edu.tarleton.Person;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person("Larry");
		out.println("Results: ");
		assertEquals("Larry", person.getName());
		assertEquals("Lary", person.getName());
//        out.println("Results: " + assertEquals("Larry", person.getName()));
	}

}
