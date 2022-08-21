package testNG_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_False {
  @Test
  public void myMethod() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	 // Assert.assertTrue(b, "Value of b is false, TC is failed");
	  
	 // Assert.assertFalse(a, "Value of a is true, TC is failed");

	  Assert.fail();    //exception coming java.lang.AssertionError: null
  }
  
}
