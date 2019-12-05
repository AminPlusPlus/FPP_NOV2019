package debugging_5_dec;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testHello() {
		HelloWorld w = new HelloWorld();
		assertEquals("Hello",w.Hello());
	}

	@Test
	void testJoin() {
		assertEquals("jimNyc",HelloWorld.join("jim", "Nyc"));
	}

	@Test
	void testMultiply() {
		assertEquals(50,HelloWorld.multiply(10 ,5));
	}

}
