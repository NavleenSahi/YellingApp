import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class YellingTest {

//R1: one Person is yelling
	
	@Test
	void testOnePersonYelling() {
		Yelling y = new Yelling();
		String result = y.scream("Peter");
		assertEquals("Peter is yelling", result);
	}

}
