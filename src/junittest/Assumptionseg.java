package junittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;

public class Assumptionseg {
	
	@BeforeAll
	public static void setup() {
		
		System.setProperty("ENV", "DEV");
		
		
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(Stringfunctions.isPalindrome("madam"));
		
		
	}
	
	
	@Test
	public void test2() {
		
		assumeFalse("PROD".equals(System.getProperty("ENV")));
		assertFalse(Stringfunctions.isPalindrome("nikunj"));
	}

}
