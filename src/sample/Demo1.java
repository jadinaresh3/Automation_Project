package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://oxheaduatstg.wpengine.com");
//		driver.findElement(By.xpath("//button[text()='×']")).click();
		driver.findElement(By.xpath("//button[@class='mfp-close']")).click();
		driver.findElement(By.xpath("(//a[@class=' wd-social-icon social-facebook'])[1]")).click();
		
		
		
////		driver.findElement(By.xpath("(//a[@class=' wd-social-icon social-facebook'])[1]")).click();
//		Thread.sleep(5000);
//		System.out.println(driver.getTitle());
		//driver.close();
		
		
	}

}
