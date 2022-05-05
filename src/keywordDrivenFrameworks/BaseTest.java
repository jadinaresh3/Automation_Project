package keywordDrivenFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconstants {
	public static WebDriver driver;
	
	
	public void openBrowser() throws Throwable {
		
		FileLib flib = new FileLib();
		String browser=flib.readPropData(PROP_PATH,"browser");
		if(browser.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROMEVALUE);
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Please Enter correct browser Name");
		}
		String appUrl = flib.readPropData(PROP_PATH, "url");
		driver.get(appUrl);
		
		driver.manage().window().maximize();
		
		
		
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
}
