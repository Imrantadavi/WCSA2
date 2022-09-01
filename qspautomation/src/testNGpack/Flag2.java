package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 
{
	//this test will not run itself ........it is disable
  @Test(enabled = false)
  public void method1()
  {
	  Reporter.log("actiTimevlaid",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("actiTimevlaid",true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("actiTimevlaid",true);
  }
  
}
