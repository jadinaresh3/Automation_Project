package flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//button[text()='✕']") private WebElement popup;
	
	@FindBy(xpath = "//a[text()='Login']") private WebElement lgnbtn;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement untb;
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']") private WebElement pwd;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement clickLgnBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
		
	}
	
	public WebElement getPopup() {
		return popup;
	}


	public void setPopup() {
		popup.click();
	}
	
	public WebElement getLgnbtn() {
		return lgnbtn;
	}


	public void setLgnbtn() {
		lgnbtn.click();
	}



	public WebElement getUntb() {
		return untb;
	}


	public void setUntb(String un) {
		untb.sendKeys(un);
		
	}


	public WebElement getPwd() {
		return pwd;
	}


	public void setPwd(String pw) {
		pwd.sendKeys(pw);
	}


	public WebElement getClickLgnBtn() {
		return clickLgnBtn;
	}


	public void setClickLgnBtn() {
		clickLgnBtn.click();
	}
	
	
//	Business Logic of the application
	
	public void LogintoApp(String un,String pw) {
		untb.sendKeys(un);
		pwd.sendKeys(pw);
		clickLgnBtn.click();
		
		
	}


	


	
//	Bussiness Logic of the application
	
//	public void LoginToApp(String un,String pw) {
//		untb.sendKeys(un);
//		pwd.sendKeys(pw);
//		clickloginbtn.click();
//		
//		
//	}
	
	

}
