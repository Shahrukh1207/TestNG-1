package training;

import org.testng.annotations.Test;

@Test(groups = "Complete")
public class Group {

	@Test(groups = {"smoke"})
	public void TC1() {
		System.out.println("TestCase1");
	}
	
	@Test (groups = {"smoke" , "regression"})
	public void TC2() {
		System.out.println("TestCase2");
	}
	
	@Test (groups = {"smoke" , "regression" , "sanity"})
	public void TC3() {
		System.out.println("TestCase3");
	}
	
	@Test (groups = {"monkey"})
	public void TC4() {
		System.out.println("TestCase4");
	}
	
	@Test (groups = {"smoke" , "regression" , "alpha"})
	public void TC5() {
		System.out.println("TestCase5");
	}
	
	@Test (groups = {"regression" , "monkey" , "sanity"})
	public void TC6() {
		System.out.println("TestCase6");
	}
	
}

