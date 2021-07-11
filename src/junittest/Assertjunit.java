package junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Assertjunit {
	
	@Test
	public void Testcase1() {
		
		String expected= "Hi there";
		String actual = "Hi there";
		
		Assertions.assertEquals(expected, actual);
		
		String[] expectedArray= {"one","two","three"};
		String[] resultArray={"one","two","three"};
		assertArrayEquals(expectedArray,resultArray);
		boolean falg=true;
		assertTrue(falg);
		
	}

}
