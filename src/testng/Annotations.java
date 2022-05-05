package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class Annotations {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("connect to DataBase",true);
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("Disconnect with database", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Keep ready- Custom-report", true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Save the Report", true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Open the broeser,enter URL ", true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("Close the browser", true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout",true);
	}

}
