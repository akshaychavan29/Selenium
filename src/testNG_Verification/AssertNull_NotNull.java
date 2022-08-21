package testNG_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_NotNull {
  @Test
  public void myMethod() 
  {
	  String a=null;
	  String b="Akshay";

	 // Assert.assertNotNull(a, "Value of A is null, Tc is failed");
	  
	  Assert.assertNull(b, "Value of B is not null, Tc is failed");
  }
}
