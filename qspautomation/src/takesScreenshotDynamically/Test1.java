package takesScreenshotDynamically;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListner.class)
public class Test1 extends BaseTest{
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void test1()
	{
		Assert.fail();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
