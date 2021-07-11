package junittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunitTest {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("inside before all");
	}
	@BeforeEach
	public void beforeEachMethod(){
		System.out.println("inside before each");
	}
	
	@Test
	public void  testcase1() {
		boolean flag= true;
		Assertions.assertTrue(flag);
	}
	
	@AfterEach
	public void afterEach() {
		
		System.out.println("inside after each");
	}

}
