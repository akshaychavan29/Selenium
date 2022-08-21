package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AnnotationStudy {
  @Test
  public void validateUserID ()
  {
	  Reporter.log("userID is validated", true);
  }
  
  @BeforeMethod
  public void login ()
  {
	  Reporter.log("Login done", true);
  }

  @AfterMethod
  public void logout () 
  {
	  Reporter.log("logout done", true);
	  System.out.println("================================");

  }

  @Test 
  public void testme ()
  {
	  Reporter.log("hiiiii", true);
  }
  
  
}
