package training;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void Validation() {
		SoftAssert softassert = new SoftAssert();
		
		int i=20; int j=5;
		System.out.println("sum : +(i+j)");
		softassert.assertTrue(true);
		
		boolean b1 = 1<2;
		boolean b2 = 2>3;
		softassert.assertEquals(b2,b1,"b2 wrong");
		
		softassert.assertAll();
		
	}
}
