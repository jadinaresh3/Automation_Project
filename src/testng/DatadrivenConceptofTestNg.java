package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenConceptofTestNg {
	@DataProvider()
	public Object[][] dataBank1() {
		Object[][] obj = new Object[2][2];
		obj[0][0]="9876543210";
		obj[0][1]="naresh#123";
		
		obj[1][0]="9876543211";
		obj[1][1]="naresh@123";
		return obj;
	}
	@Test(dataProvider = "dataBank1")
	public void getCreadentoal(String un,String pwd) {
		
		Reporter.log(un+" "+pwd,true);
		
		
	}

}
