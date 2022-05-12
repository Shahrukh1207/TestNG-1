package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class depend {

	public static WebDriver driver;
	
	@BeforeTest
	public void start() {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mycarhelpline.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void LandingPage() {
		System.out.println(driver.getCurrentUrl());
		String CurrentURL = "https://www.mycarhelpline.com/";
				
				if(CurrentURL.equals("https://www.mycarhelpline.com/")) {
					System.out.println("Passd");
				}
				else {
					System.out.println("Failed");
				}
			}
	

	@Test
	public void Calculator() {
		driver.findElement(By.linkText("Calculator")).click();
	}
}