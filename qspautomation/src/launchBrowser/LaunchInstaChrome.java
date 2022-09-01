package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchInstaChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//open firefox browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);//delay of 5 sec
		driver.close();//close the browser
	}

}
