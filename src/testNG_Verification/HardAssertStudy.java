package testNG_Verification;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy
{
  @Test
  public void myMethod()
  {
	  String a="Akshay";
	  String b=null;
	  
	  Assert.assertNull(a, "Value of A is not null, TC is failed");
	  
	  Assert.assertNotNull(b, "Value of B is null, TC is failed");
	  
	  
	  }
}
