package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	@Test
	public void run() {
		Reporter.log("This is the Sumo class", true);
		}
}