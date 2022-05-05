package testng;

import org.testng.Reporter;

public class GroupingExecution {
	public void smokegrp1() {
		Reporter.log("Smoke group1",true);
	}
	public void ft1() {
		Reporter.log("functional grp");
	}
	public void smokegrp2() {
		Reporter.log("Smoke group2",true);
	}
	public void smokegrp3() {
		Reporter.log("Smoke group3",true);
	}
	public void smokegrp4() {
		Reporter.log("Smoke group4",true);
	}

}
