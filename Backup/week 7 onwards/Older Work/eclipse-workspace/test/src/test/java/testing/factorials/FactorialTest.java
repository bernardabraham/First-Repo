package testing.factorials;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import factorial.Factorial;

public class FactorialTest {

	private Factorial fact = new Factorial();

	@Test
	public void testNotFailed() {
		assertEquals("", false, -1 == fact.factorialAK(120));

	}

	@Test
	public void testFailed() {
		assertEquals("", -1, fact.factorialAK(150));

	}

}
