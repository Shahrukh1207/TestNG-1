package training;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider="getData")
	public void DataMatrix(String username, String password, int mobile, String Browser) {
		
	}
	
	@DataProvider
	public Object[][]getData() {
		Object[][]data = new Object[3][4];
		
		data[0][0]="Username";
		data[0][1]="Password";
		data[0][2]=12345678;
		data[0][3]="chrome";
		
		data[1][0]="Username1";
		data[1][1]="Password1";
		data[1][2]=1234;
		data[1][3]="delta";
		
		data[2][0]="Username2";
		data[2][1]="Password2";
		data[2][2]=1238;
		data[2][3]="omega";

		return data;
}
}