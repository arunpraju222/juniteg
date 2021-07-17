package PackageA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassATest {

	@Tag("Sanity")
	@DisplayName("First Junit in class A")
	@Test
	public void test1() {
		System.out.println("inside test1");
	}
	
}
