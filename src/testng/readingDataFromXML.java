package testng;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class readingDataFromXML {
	
	@Parameters("browser")
	@Test
	public void readData(String br) {
		Reporter.log(br, true);
		
	}

}
