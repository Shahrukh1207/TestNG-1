package training;

import org.testng.annotations.Test;

public class Test_Priority {

	@Test(priority=1)
	public void UserLogIn() {
	System.out.println("user logIn");
}

	@Test(priority=2)
	public void UserCreditial() {
	System.out.println("user credential");
}

	@Test(priority=3)
	public void UserdashBoard() {
	System.out.println("user DashBoard");
}

	@Test(priority=4)
	public void AddBenefiaciary() {
	System.out.println("Benefiaciary");
}
	
	@Test(priority=5)
	public void BenefiaciaryValid() {
	System.out.println("Benefiaciary Valid");
}

	@Test(priority=6)
	public void UserLogOut() {
	System.out.println("user log Out");
}

	
}
