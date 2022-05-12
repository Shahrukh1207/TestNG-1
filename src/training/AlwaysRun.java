package training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test (priority=1)
	public void Begin() {
		System.out.println("initial case");
		Assert.fail("fail case");
	}
	
	@Test (priority=2, dependsOnMethods = "Begin", alwaysRun = true)
	public void Ready() {
		 System.out.println("next case");
	}
	
	@Test (priority=3, dependsOnMethods = {"Begin" , "Ready"})
	public void Steady() {
		System.out.println("next sequence");
	}
	
	@Test (priority=4, dependsOnMethods = {"Begin" , "Ready" , "Steady"})
	public void Go() {
		System.out.println("GO");
	}
	
}
