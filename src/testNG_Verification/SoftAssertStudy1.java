package testNG_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy1 
{
  @Test
  public void myMethod() 
  {
	  String a="Akshay";
	  String b="Akshay";
	  String c="Chavan";
	  String d=null;
	  boolean e=true;
	  boolean f=false;
	  
	  SoftAssert soft =new SoftAssert();
	  
	  soft.assertEquals(a, b, "Both values are not equal, TC is failed");
	  soft.assertNotEquals(a, c,"Both values are equal, TC is failed");
	  
	  soft.assertNull(d, "Given value is not null, TC is failed");
	  soft.assertNotNull(c, "Given value is null, TC is failed");
	  
	  soft.assertTrue(e, "Given value is false, TC is failed");
	  soft.assertFalse(f, "Given value is true, TC is failed");
	  
	  //Assert.fail();
	  
	  soft.assertAll();
  }
}
