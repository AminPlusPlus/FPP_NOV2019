package dataStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindCharInStringTest {

	@Test
	void testSearch() {
		assertTrue(FindCharInString.search("Hello", 'e'));
		assertFalse(FindCharInString.search("Hello", '9'));
	}



}
