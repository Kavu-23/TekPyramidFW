package ptc;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Practice.BaseClass;

public class SampleTest2  extends BaseClass{

	RemoteWebDriver driver;
	@Test
	public void m2Test()
	
	{
	   driver.get("https://www.amazon.in/");
	}
}
