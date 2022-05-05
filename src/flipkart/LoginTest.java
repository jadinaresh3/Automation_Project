package flipkart;



public class LoginTest extends BaseTest{

	public static void main(String[] args) throws Throwable {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
//		close the pop up
		LoginPage lp = new LoginPage();
		lp.setPopup();
		
//		click on Login button
		lp.setLgnbtn();
		
		lp.LogintoApp("8500661716", "abcdef1@N");
				
//		Enter valid user name and password
//		FileLib flib = new FileLib();
//		String un = flib.readPropData(PROP_PATH, "username");
//		String pw = flib.readPropData(PROP_PATH, "password");
//		lp.setUntb(un);
//		lp.setPwd(pw);
//		lp.setClickLgnBtn();
		
		
		
		
		
//		Enter valid user name and password
		FileLib flib = new FileLib();
//		String un = flib.readPropData(PROP_PATH, "username");
//		String pw = flib.readPropData(PROP_PATH, "password");
		
//		lp.LogintoApp(un, pw);
		
		
	}

}
