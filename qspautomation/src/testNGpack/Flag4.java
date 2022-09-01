package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4
{
	@Test
	public void actiTimeLogin()
	{
		int i= 9/0;
		System.out.println(i);
		Reporter.log("Login Successful",true);
	}


	@Test(dependsOnMethods = "actiTimeLogin")
	public void actiTimeCreateUser()
	{
		Reporter.log("Create user",true);

	}

	@Test(dependsOnMethods = "actiTimeCreateUser")
	public void actiTimeLogOut()
	{
		Reporter.log("Logout Successful",true);
	}
}
