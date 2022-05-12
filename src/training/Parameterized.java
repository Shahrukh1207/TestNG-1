package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser","url","email","password"})
	public void rediff(String Browser, String url, String emailid, String password) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		if(Browser.equals("Chrome")) {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	} 
		else if(Browser.equals("Firefox")) {
		//WebDriverManager.firefox().setup();
	}
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("email");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.className("signinbtn")).click();
		
	}
}
