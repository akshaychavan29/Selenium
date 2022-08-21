package testNGXMLStudy;


import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCases {
	@Test
	  public void a()
	  {
		  Reporter.log("A method is running", true);
	  }
	  
	  @Test
	  public void b()
	  {
		 // Assert.fail();
		  Reporter.log("B method is running", true);
	  }
	  @Test
	  public void c() 
	  {
		  //Assert.fail();
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
