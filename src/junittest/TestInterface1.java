package junittest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public interface TestInterface1 {
	public void method1();
		
	@Test
	default void test1(){
			
		assertTrue(Stringfunctions.isPalindrome("madam"));
	}

}
