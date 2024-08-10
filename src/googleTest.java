import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class googleTest {

	@Test
	public void homePageCheck() throws MalformedURLException, URISyntaxException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
        System.setProperty("webdriver.chrome.driver\"","C:\\Users\\Public\\Java Projects\\SeleniumGrid");
		WebDriver driver = new RemoteWebDriver(new URI("http://172.31.36.165:4444").toURL(), caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Ajay Sharma");
		
		

	}

}
