package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingtestNG2 
{
	@Test(groups = {"Sanity"})
	  public void f()
	  {
		  Reporter.log("F method is running", true);
	  }
	  
	  @Test(groups = {"Regression"})
	  public void g()
	  {
		  Reporter.log("G method is running", true);
	  }
	  @Test
	  public void h() 
	  {
		  Reporter.log("H method is running", true);
	  }
	  @Test
	  public void i()
	  {
		  Reporter.log("I method is running", true);
	  }
	  @Test
	  public void j()
	  {
		  Reporter.log("J method is running", true);
	  }

}
