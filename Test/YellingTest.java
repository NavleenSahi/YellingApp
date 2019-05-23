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
	
	//R2 nobody is yelling
	@Test
	void testNobodyIsYelling() {
		Yelling y = new Yelling();
		String result = y.scream("NULL");
		assertEquals("Nobody is yelling", result);
	}
	
	//R3 uppercase yelling
	@Test
	void testUppercaseYelling() {
		Yelling y = new Yelling();
		String result = y.scream("PETER");
		assertEquals("PETER IS YELLING", result);
	}

}
