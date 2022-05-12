package ParallelTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTextNG2 {
	WebDriver driver;

	@Test(threadPoolSize = 3, invocationCount = 3)
	public void TC1() {
	System.out.println("for TC1" + Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void TC2() {
	System.out.println("for TC2" + Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.yahoo.com/");
	}
	
	@Test
	public void TC3() {
	System.out.println("for TC3" + Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.aol.com/");
	}	
	
}
