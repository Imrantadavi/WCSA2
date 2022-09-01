package operationalMethodDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsmultipleMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/tadav/OneDrive/Desktop/html/multiselectdropdown.html");
		
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='menu']"));
		Thread.sleep(3000);
		Select sel = new Select(dropdown);
		List<WebElement> allOps = sel.getOptions();
		
		for(int i=0;i<=allOps.size();i++)
		{
			WebElement op = allOps.get(i);
        	String text = op.getText();
        	System.out.println(text);
        	Thread.sleep(1000);
		}
		

	}

}