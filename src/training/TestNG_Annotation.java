package training;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {

	
		// TODO Auto-generated method stub

		@BeforeSuite
		public void beforeSuite() {
			System.out.println("this is before Suite ");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("this is before Test ");
		}
		
		@BeforeClass
		public void beforeClass() {
			System.out.println("this is before Class ");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("this is before Mehod ");
		}
		
		@Test
		public void logintest() {
			System.out.println("this is LoginTest ");
		}
		
		@Test
		public void Logouttest() {
			System.out.println("this is LogoutTest ");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("this is After Method ");
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("this is AfterClass ");
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("this is After Test ");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("this is After Suite ");
		}
		

}
