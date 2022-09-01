package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInstaFirefox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();//open firefox browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);//delay of 5 sec
		driver.close();//close the browser
	}

}
