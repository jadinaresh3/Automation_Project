package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run() {
		
//		it will print report only 
		Reporter.log("this is Demo class");
		
//		it will print both console and report 
		Reporter.log("This is the Demo classes", true);
		
		
	}

}
