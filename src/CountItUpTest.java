import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountItUpTest {

	@Test
	void countUpTo5() {
		assertEquals("0 1 2 3 4 5",CountItUp.countUp(5));
	}
	
	@Test
	void countUpTo0() {
		assertEquals("0",CountItUp.countUp(0));
	}
	
	@Test
	void getInputTest() {
		assertTrue(CountItUp.getInput() >= 0);
	}
	
}
