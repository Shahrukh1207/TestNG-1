package training;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITest_context {

	@Test(priority=1)
	public void setup(ITestContext context) { 
		System.out.println("new laptop");
		context.setAttribute("win10" , "Asus");
	}
	
	@Test(priority = 2, dependsOnMethods = "setup")
	public void Logic (ITestContext context) {
		System.out.println("logic functioning");
		String OperatingSystem = (String)context.getAttribute("win10");
		System.out.println("setup for laptop" + OperatingSystem);
		context.setAttribute("Complex", "Agile");
	}
	
	@Test(priority = 3, dependsOnMethods = {"setup" , "Logic"})
	public void exit(ITestContext context) {
		System.out.println("Exiting");
		String OperatingSystem = (String)context.getAttribute("Win10");
		System.out.println("Setup for laptop" + OperatingSystem);
		
		String logicComplexity = (String)context.getAttribute("Complex");
		System.out.println("The logic exting" + logicComplexity);
			
		
	}
}
