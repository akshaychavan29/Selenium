package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test
  public void a()
  {
	  Reporter.log("A method is running", true);
  }
  
  @Test(priority = -5)
  public void b()
  {
	  Reporter.log("B method is running", true);
  }
  @Test(priority = -4)
  public void c()
  {
	  Reporter.log("C method is running", true);
  }
  @Test(priority = -3)
  public void d()
  {
	  Reporter.log("D method is running", true);
  }
  @Test(priority = -2)
  public void e()
  {
	  Reporter.log("E method is running", true);
  }
  @Test(priority = -1)
  public void f()
  {
	  Reporter.log("F method is running", true);
  }
}
