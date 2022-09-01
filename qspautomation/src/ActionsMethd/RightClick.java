package ActionsMethd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver drivers= new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://www.flipkart.com/");
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		drivers.findElement(By.xpath("//button[.='✕']")).click();
		WebElement target = drivers.findElement(By.xpath("//a[.='Login']"));
		Actions act = new Actions(drivers);
		act.contextClick(target).perform();
	}
}

