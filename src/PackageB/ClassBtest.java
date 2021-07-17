package PackageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBtest {

	@Tag("Sanity")
	@DisplayName("First Junit in class B")
	@Test
	public void test() {
		System.out.println("inside test");
	}

}
