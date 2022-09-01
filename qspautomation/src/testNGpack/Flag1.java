package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 
{
	
  @Test(description = "this test is used to perform valid login")
  public void validActiTimeTest() 
  {
	  Reporter.log("valid login is perform",true);
  }
  
  @Test(description = "this test is used to perform invalid login")
  public void invalidActiTimeTest()
  {
	Reporter.log("invalid login is perform",true);  
  }
  
}
