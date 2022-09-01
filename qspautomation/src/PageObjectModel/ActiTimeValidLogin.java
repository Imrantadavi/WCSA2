package PageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		
		bt.openBrowser();
		LogInPage lp = new LogInPage(driver);
		
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readPropertyFile(PROP_PATH, "username"), flib.readPropertyFile(PROP_PATH, "password"));
		
		
	}

}
