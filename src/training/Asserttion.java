package training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserttion {

	@Test
	public void Critical() {
	String ExpectedOutPut = "TestNG";
	String ActualOutPut = "No TestNG";
	Assert.assertEquals(ActualOutPut, ExpectedOutPut);
	}

	@Test
	public void High() {
		boolean b1 = 1<2;
		boolean b2 = 2>3;
		Assert.assertTrue(b1==b2, "2 never greatter than 3");
	}
	
	@Test
	public void Mediium() {
		
	}
	
	@Test
	public void Low() {
		
	}
	



}
