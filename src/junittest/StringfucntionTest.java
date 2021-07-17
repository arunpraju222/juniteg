package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringfucntionTest {

	
	@Test
	public void test1() {
		
		assertTrue(Stringfunctions.isPalindrome("madam"));
	}

	@Test
	public void test2() {
		assertFalse(Stringfunctions.isPalindrome("arun"));
	}
}
