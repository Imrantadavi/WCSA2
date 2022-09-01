package keywordDrivenFramework;

import java.io.IOException;


import org.openqa.selenium.By;


public class TestInvalidActiTime extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.getRowCount("./Data/TestDataAct.xlsx", "invalidcreds");
		
		for (int i=1; i<=rc;i++)
		{
			String username = flib.readExcelData("./Data/TestDataAct.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./Data/TestDataAct.xlsx", "invalidcreds", i, 1);
			
			System.out.println(i);
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			
			
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(30);
			driver.findElement(By.name("username")).clear();
			
		}
			bt.closeBrowser();
		}
	}
	
