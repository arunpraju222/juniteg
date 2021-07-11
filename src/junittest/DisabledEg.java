package junittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class DisabledEg {
	
	/*@DisplayName("Positive Test")
	@Disabled            				//to disable test case
	@Test*/
	@CustomAnottation
	public void test1() {
		
		
		assertTrue(Stringfunctions.isPalindrome("madam"));
		
	}
	
	@DisplayName("Negative Test")
	@RepeatedTest(5)					//Repeat the test 5times
	@Test
	public void test2() {

		assertFalse(Stringfunctions.isPalindrome("nikunj"));
	}

}



