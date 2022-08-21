package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsStudy {
	@Test
	  public void a()
	  {
		  Reporter.log("A method is running", true);
	  }
	  
	  @Test(dependsOnMethods = {"c"})
	  public void b()
	  {
		  Reporter.log("B method is running", true);
	  }
	  @Test(timeOut = 100)
	  public void c() throws InterruptedException 
	  {
		  Thread.sleep(111);
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
