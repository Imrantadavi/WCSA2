package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7
{

	@Test(invocationCount = 50)
	public void f() 
	{
		Reporter.log("IHT",true);
	}
}
