package ptc;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Practice.BaseClass;

public class SampleTest1 extends BaseClass{

	RemoteWebDriver driver;
	@Test
	public void m1Test()
	
	{
	   driver.get("https://www.facebook.com/");
	}

}
