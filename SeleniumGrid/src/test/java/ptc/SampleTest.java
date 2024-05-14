package ptc;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SampleTest {

	RemoteWebDriver driver;
	
	@Test
	public void m1Test() throws MalformedURLException 
	{
		URL url = new URL("http://192.168.128.167:4444/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("edge");
		cap.setPlatform(Platform.WINDOWS);
		driver= new RemoteWebDriver(url, cap);

		driver.get("https://www.amazon.in/");
	}

}
