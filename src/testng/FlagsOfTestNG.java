package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsOfTestNG {
	@Test(priority = 2)
	public void gun() {
		
//		it will print report only 
		Reporter.log("this is Demo class");
		
//		it will print both console and report 
		Reporter.log("This is the gun classes", true);
		}
	@Test(priority = 1)
	public void run() {
			
		Reporter.log("This is the run classes", true);
	}
		
		@Test(priority = 3)
		public void bun() {
			
			Reporter.log("This is the bun class", true);
	}
}
