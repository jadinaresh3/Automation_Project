package flipkart;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import keywordDrivenFrameworks.BaseTest;

public class WebDriverCommonLib {
	
		
		public void verify(String actualResult,String expectedResult,String page) {
			if(expectedResult.equals(actualResult)) {
				System.out.println(page+" is displayed, Test PASS");
			}
			else {
				System.out.println(page+" is not Displayed Test FAILED");
			}
			
		}
		
		public String  getTitle() {
			String title = BaseTest.driver.getTitle();
			return title;
			
		}
		
		public void webDriverWait(String title) {
			WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.titleContains(title));
		}
		public void selectedOption(WebElement element,String text) {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		public void selectedOption(int index,WebElement element) {
			Select sel = new Select(element);
			sel.selectByIndex(index);;
		}
		public void selectedOption(String value, WebElement element) {
			Select sel = new Select(element);
			sel.selectByValue(value);
		}
		
		public void mouseHover(WebElement element) {
			Actions ac = new Actions(BaseTest.driver);
			ac.moveToElement(element).perform();
		}
		
		public void rightClick(WebElement element) {
			Actions ac = new Actions(BaseTest.driver);
			ac.contextClick(element).perform();
			
		}
		
		public void getScreenShot(String path) throws Throwable {
			TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			Files.copy(src, dest);
		}
		
		public void getElemntScreenShot(WebElement element,String path) {
			File src = element.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			try {
				Files.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void switchtoFrame(int index) {
			BaseTest.driver.switchTo().frame(index);
			
		}
		public void switchtoFrame(String value) {
			BaseTest.driver.switchTo().frame(value);
			
		}
		public void switchtoFrame(WebElement element) {
			BaseTest.driver.switchTo().frame(element);
			
		}

}
