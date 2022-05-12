package training;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Test_deoend {
	public static WebDriver driver;
	
	@BeforeTest
	public void start() {
		//WebDriver.chromedriver().setup();
		//driver = new WebDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com/");
	
	}
}