package testNGListner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListner.Listner.class)
public class DemoClass2    //this class created for run the listner xml file 
{
  @Test
  public void myMethod4 () 
  {
	  Reporter.log("myMethod4 TC execution is started", true);
  }
  
  @Test
  public void myMethod5 () 
  {
	  Assert.fail();
	  Reporter.log("myMethod5 TC execution is started", true);
  }
  
  @Test (dependsOnMethods = {"myMethod5"})
  public void myMethod6 () 
  {
	  Reporter.log("myMethod6 TC execution is started", true);
  }
  
}
