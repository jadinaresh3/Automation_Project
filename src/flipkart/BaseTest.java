package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstants  {
	public static WebDriver driver;
	
	
	
	public void openBrowser() throws Throwable {
		FileLib flib = new FileLib();
		String browser = flib.readPropData(PROP_PATH, "browser");
		if(browser.equals("chrome")) {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		driver=new ChromeDriver(co);
		
		
		
		}
		else if(browser.equals("firefox")){
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			ChromeOptions co=new ChromeOptions();
			co.addArguments("start-maximized");
			driver=new FirefoxDriver();
			}
		else {
			System.out.println("EnterCorrecrt browser Name");
		}
		String appurl = flib.readPropData(PROP_PATH, "url");
		driver.get(appurl);
		
		
	}

}
