package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords {
	@Test
	  public void a()
	  {
		  Reporter.log("A method is running", true);
	  }
	  
	  @Test(dependsOnMethods = {"c"},invocationCount = 3, priority = -1)
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
