package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActiTime  extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		String username = flib.readPropertyFile("./Data/config.properties", "username");
		String password = flib.readPropertyFile("./Data/config.properties", "password");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		
		bt.closeBrowser();
		
		
	}

}
