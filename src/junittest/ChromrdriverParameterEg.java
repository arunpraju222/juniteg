package junittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ParameterproviderEg.class)
public class ChromrdriverParameterEg {
	

	@Test
	public void Logintest(ChromeDriver driver) {
		
		driver.get("https://www.simplilearn.com/");
	}
	
}
