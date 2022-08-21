package testNG_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy 
{
  @Test
  public void myMethod() 
  {
	  String a="Akshay";
	  String b=null;
	  
	  SoftAssert soft =new SoftAssert();  // created object of soft Assert
	  
	  soft.assertNull(a, "Value of A is not null, TC is failed");
	  
	  soft.assertNotNull(b, "Value of B is null, TC is failed");
	  
	  soft.assertAll();
  }
  
}
