package training;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B4method {

	@BeforeMethod
	public void userRegister() {
		System.out.println("User Register");
	}

	@Test
	public void LoggedIn() {
		System.out.println("User LoggedIn");
	}
	
	@Test
	public void UserDashboard() {
		System.out.println("User DashBoard");
	}
	
	@AfterMethod
	public void UserLoggedOut() {
		System.out.println("User LoggedOut");
	}
	
	
}
