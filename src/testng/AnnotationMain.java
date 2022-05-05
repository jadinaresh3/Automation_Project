package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationMain extends Annotations {
	
	@Test
	public void run1() {
		Reporter.log("create customer test",true);
	}
	
	@Test
	public void ren2() {
		Reporter.log("create Project Test",true);
	}

}
