package junittest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(EnvCheck.class)

public class ExtentionPointEg {
	
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
