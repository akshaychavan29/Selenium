package testNG_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals_NotEquals 
{
	  @Test
	  public void myMethod()
	  {
		  String a="Pune";
		  String b="Pune";
		  String c="Sambhajinagar";
		  
		  //1.If a and b are equal TC should be PASSED
		  //I want to verify a equals b, equals c we will be using Hard Assert to verify
		  
		 // Assert.assertEquals(a,c, "A & C is not equal TC is Failed");
		  
		  Assert.assertNotEquals(a,b, "A & B is  equal TC is Failed");
		  
	  }
}	  
	  
