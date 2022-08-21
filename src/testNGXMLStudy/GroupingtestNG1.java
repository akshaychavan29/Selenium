package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingtestNG1 
{
	@Test(groups = {"Sanity"})
	  public void a()
	  {
		  Reporter.log("A method is running", true);
	  }
	  
	  @Test(groups = {"Regression"})
	  public void b()
	  {
		  Reporter.log("B method is running", true);
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("C method is running", true);
	  }
	  @Test
	  public void d()
	  {
		  Reporter.log("D method is running", true);
	  }
	  @Test
	  public void e()
	  {
		  Reporter.log("E method is running", true);
	  }

}
