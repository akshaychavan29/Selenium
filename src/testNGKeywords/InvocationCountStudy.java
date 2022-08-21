package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 7)
  public void myMethod () 
  {
	  Reporter.log("My Method is running", true);
  }
}
