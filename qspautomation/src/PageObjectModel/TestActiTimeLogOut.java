package PageObjectModel;

import java.io.IOException;

public class TestActiTimeLogOut  extends BaseTest{

	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LogInPage lp = new LogInPage(driver);
		
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readPropertyFile(PROP_PATH, "username"), flib.readPropertyFile(PROP_PATH, "password"));
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.logoutActitime();
		
	}
}
